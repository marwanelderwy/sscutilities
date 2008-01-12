package scheduling.GUI.forms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import scheduling.exec.UserManagement;

public class PersonalInfo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel txtTitle;
	private JLabel lblFirstName;
	private JLabel lblMidName;
	private JLabel lblLastName;
	private JTextField txtFirstName;
	private JTextField txtMidName;
	private JTextField txtLastName;
	private JLabel lblAddress;
	private JLabel lblCity;
	private JLabel lblZipCode;
	private JTextField txtStreet;
	private JTextField txtCity;
	private JTextField txtZip;
	private JLabel lblTel;
	private JLabel lblMob;
	private JTextField txtTel;
	private JTextField txtMob;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblBirth;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JLabel txt1;
	private JLabel txt2;
	private JButton cmdCancel;
	private JButton cmdEnter;
	private JTextField txtPosition;
	private JLabel lblPosition;
	private JLabel lblAccess;
	private JComboBox cmbAccess;
	private JLabel lblUsername;
	private JTextField txtUsername;
	private JLabel lblHouseno;
	private JTextField txtHouseno;
	
	private String formType = null;

	public PersonalInfo(String formType)
	{
		this.formType = formType;
		
		//construct preComponents
		String[] cmbAccessItems = {"Item 1", "Item 2", "Item 3"};

		//construct components
		txtTitle = new JLabel ("Personlige Informationer");
		lblFirstName = new JLabel ("Fornavn*:");
		lblMidName = new JLabel ("Mellemnavn:");
		lblLastName = new JLabel ("Efternavn*:");
		txtFirstName = new JTextField (5);
		txtMidName = new JTextField (5);
		txtLastName = new JTextField (5);
		lblAddress = new JLabel ("Vejnavn:");
		lblCity = new JLabel ("By:");
		lblZipCode = new JLabel ("Postnr:");
		txtStreet = new JTextField (5);
		txtCity = new JTextField (5);
		txtZip = new JTextField (5);
		lblTel = new JLabel ("Hjemmetelefon:");
		lblMob = new JLabel ("Mobiltelefon:");
		txtTel = new JTextField (5);
		txtMob = new JTextField (5);
		lblEmail = new JLabel ("E-mail:");
		txtEmail = new JTextField (5);
		lblBirth = new JLabel ("Fødselsdato:");
		txtDay = new JTextField (5);
		txtMonth = new JTextField (5);
		txtYear = new JTextField (5);
		txt1 = new JLabel (" -");
		txt2 = new JLabel (" -");
		cmdCancel = new JButton ("Cancel");
		cmdEnter = new JButton ("Enter");
		txtPosition = new JTextField (5);
		lblPosition = new JLabel ("Stilling:");
		lblAccess = new JLabel ("Access*:");
		cmbAccess = new JComboBox (cmbAccessItems);
		lblUsername = new JLabel ("Username:");
		txtUsername = new JTextField (5);
		lblHouseno = new JLabel ("Husnummer:");
		txtHouseno = new JTextField (5);


		//adjust size and set layout
		setPreferredSize (new Dimension (741, 466));
		setLayout (null);
		
		//adding ActionListeners
		ActionListener al = null;
		if(formType.equals("NewUser")){
			al = new NewUserType();
		}
		else if(formType.equals("EditUser")){
			al = new EditUserType();
		}
		cmdEnter.addActionListener(al);
		cmdCancel.addActionListener(al);

		//add components
		add (txtTitle);
		add (lblFirstName);
		add (lblMidName);
		add (lblLastName);
		add (txtFirstName);
		add (txtMidName);
		add (txtLastName);
		add (lblAddress);
		add (lblCity);
		add (lblZipCode);
		add (txtStreet);
		add (txtCity);
		add (txtZip);
		add (lblTel);
		add (lblMob);
		add (txtTel);
		add (txtMob);
		add (lblEmail);
		add (txtEmail);
		add (lblBirth);
		add (txtDay);
		add (txtMonth);
		add (txtYear);
		add (txt1);
		add (txt2);
		add (cmdCancel);
		add (cmdEnter);
		add (txtPosition);
		add (lblPosition);
		add (lblAccess);
		add (cmbAccess);
		add (lblUsername);
		add (txtUsername);
		add (lblHouseno);
		add (txtHouseno);

		//set component bounds (only needed by Absolute Positioning)
		txtTitle.setBounds (285, 15, 150, 25);
		lblFirstName.setBounds (100, 65, 100, 25);
		lblMidName.setBounds (100, 100, 100, 25);
		lblLastName.setBounds (100, 135, 100, 25);
		txtFirstName.setBounds (190, 65, 100, 25);
		txtMidName.setBounds (190, 100, 100, 25);
		txtLastName.setBounds (190, 135, 100, 25);
		lblAddress.setBounds (100, 250, 100, 25);
		lblCity.setBounds (100, 320, 100, 25);
		lblZipCode.setBounds (100, 355, 100, 25);
		txtStreet.setBounds (190, 250, 150, 25);
		txtCity.setBounds (190, 320, 150, 25);
		txtZip.setBounds (190, 355, 75, 25);
		lblTel.setBounds (385, 285, 100, 25);
		lblMob.setBounds (385, 320, 100, 25);
		txtTel.setBounds (495, 285, 100, 25);
		txtMob.setBounds (495, 320, 100, 25);
		lblEmail.setBounds (385, 250, 100, 25);
		txtEmail.setBounds (465, 250, 200, 25);
		lblBirth.setBounds (100, 170, 100, 25);
		txtDay.setBounds (190, 170, 20, 25);
		txtMonth.setBounds (220, 170, 20, 25);
		txtYear.setBounds (250, 170, 40, 25);
		txt1.setBounds (210, 170, 10, 25);
		txt2.setBounds (240, 170, 10, 25);
		cmdCancel.setBounds (455, 405, 100, 25);
		cmdEnter.setBounds (570, 405, 100, 25);
		txtPosition.setBounds (465, 65, 126, 25);
		lblPosition.setBounds (385, 65, 100, 25);
		lblAccess.setBounds (385, 100, 100, 25);
		cmbAccess.setBounds (465, 100, 124, 25);
		lblUsername.setBounds (385, 135, 100, 25);
		txtUsername.setBounds (465, 135, 126, 25);
		lblHouseno.setBounds (100, 285, 100, 25);
		txtHouseno.setBounds (190, 285, 40, 25);
	}
	
	/*
	 * ActionListener to be loaded for creating new user
	 * in the database.
	 */
	class NewUserType implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			String command = ae.getActionCommand();
			
			if(command.equals("Enter")){
				
			}
			else if(command.equals("Cancel")){
				
			}
			
		}
		
	}
	
	/*
	 * ActionListener to be loaded for editing user
	 * in the database.
	 */
	class EditUserType implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			String command = ae.getActionCommand();
			
			if(command.equals("Enter")){
				int birthday = new Integer(txtDay.getText()).intValue();
				int birthmonth = new Integer(txtMonth.getText()).intValue();
				int birthyear = new Integer(txtYear.getText()).intValue();
				int access = cmbAccess.getSelectedIndex();
				int zip = new Integer(txtZip.getText()).intValue();
				
				UserManagement um = new UserManagement();
				um.AddNewUser(txtUsername.getText(), access, txtFirstName.getText(), txtMidName.getText(),
						txtLastName.getText(), txtStreet.getText(),
						txtHouseno.getText(), zip, txtCity.getText(), 
						txtTel.getText(), txtMob.getText(),
						birthday, birthmonth, birthyear, txtPosition.getText(), txtPosition.getText());
			}
			else if(command.equals("Cancel")){
				
			}
			
		}
		
	}

}
