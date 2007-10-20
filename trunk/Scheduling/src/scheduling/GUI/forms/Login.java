package scheduling.GUI.forms;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import scheduling.exec.PerformLogin;

public class Login extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JTextField txtUsername;
	private JLabel txtCompany;
	private JPasswordField txtPassword;
	private JButton cmdExit;
	private JButton cmdEnter;
	private JFrame frame;
	

	public Login()
	{
		frame = new JFrame ("JPanel Preview");
		
		//construct components
		lblUsername = new JLabel ("Username");
		lblPassword = new JLabel ("Password");
		txtUsername = new JTextField (5);
		txtCompany = new JLabel ("Slager Stig & Co");
		txtPassword = new JPasswordField (5);
		cmdExit = new JButton ("Exit");
		cmdEnter = new JButton ("Enter");
		
		cmdExit.addActionListener(new ButtonClicked());
		cmdEnter.addActionListener(new ButtonClicked());
		
		//adjust size and set layout
		setPreferredSize (new Dimension (403, 210));
		setLayout (null);

		//add components
		add (lblUsername);
		add (lblPassword);
		add (txtUsername);
		add (txtCompany);
		add (txtPassword);
		add (cmdExit);
		add (cmdEnter);

		//set component bounds (only needed by Absolute Positioning)
		lblUsername.setBounds (100, 60, 80, 25);
		lblPassword.setBounds (100, 95, 80, 25);
		txtUsername.setBounds (180, 60, 100, 25);
		txtCompany.setBounds (150, 15, 100, 25);
		txtPassword.setBounds (180, 95, 100, 25);
		cmdExit.setBounds (90, 140, 100, 25);
		cmdEnter.setBounds (200, 140, 100, 25);
	}

	public void showFrame(){
		
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Login());
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("JPanel Preview");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Login());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible (true);
	}
	
	public class ButtonClicked implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			PerformLogin execLogin;
			if(command.equals("Exit")){
				System.exit(0);
			}
			else if(command.equals("Enter")){
				execLogin = new PerformLogin();
				
				String password = "";
				for(char c : txtPassword.getPassword()){
					password += c;
				}
				
				if(execLogin.validateUser(txtUsername.getText(), password)){
					System.out.println("Login Successfull");
					
				}				
				else{
					txtPassword.setText("");
				}
			}
			
		}
		
	}
}