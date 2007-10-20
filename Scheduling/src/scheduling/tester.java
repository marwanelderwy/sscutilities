package scheduling;

import javax.swing.JFrame;

import scheduling.GUI.Schedule.TitleBar;
import scheduling.GUI.Schedule.WeekNrDisplay;
import scheduling.GUI.Schedule.displaySchedule;
import scheduling.GUI.Users.DisplayUsers;

public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new DisplayUsers());
		//frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);

	}

}
