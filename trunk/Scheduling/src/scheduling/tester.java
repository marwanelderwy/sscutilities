package scheduling;

import javax.swing.JFrame;

import scheduling.GUI.MainFrame.MainFrame;
import scheduling.GUI.Schedule.TitleBar;
import scheduling.GUI.Schedule.WeekNrDisplay;
import scheduling.GUI.Schedule.displaySchedule;
import scheduling.GUI.Users.Commands;
import scheduling.GUI.Users.DisplayUsers;
import scheduling.GUI.forms.Login;
import scheduling.GUI.forms.PersonalInfo;
import scheduling.exec.PerformLogin;
import scheduling.exec.ShowUsers;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShowUsers su = new ShowUsers();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new MainFrame());
		//frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
		
		//new PerformLogin(0);

	}

}
