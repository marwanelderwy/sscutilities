/**
 * 
 */
package scheduling.exec;

import javax.swing.JFrame;

import scheduling.GUI.MainFrame.MainFrame;
import scheduling.GUI.Users.DisplayUsers;

/**
 * @author Morten Lorenzen
 *
 */
public class Initialize {
	
	MainFrame mainframe = null;
	JFrame frame = new JFrame();
	
	public Initialize(){
		InitializeGUI();
		
	}
	
	private void InitializeGUI(){
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new MainFrame());
		//frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		
	}

}
