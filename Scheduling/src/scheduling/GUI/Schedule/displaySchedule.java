package scheduling.GUI.Schedule;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class displaySchedule extends JPanel{
	
	public displaySchedule(int week){
		setLayout(new BorderLayout());
		
		TaskContainer taskContainer1 = new TaskContainer();
		TaskContainer taskContainer2 = new TaskContainer();
		TaskContainer taskContainer3 = new TaskContainer();
		TaskContainer taskContainer4 = new TaskContainer();
		TaskContainer taskContainer5 = new TaskContainer();
		TaskContainer taskContainer6 = new TaskContainer();
		TaskContainer taskContainer7 = new TaskContainer();
		
		
		JPanel allContainers = new JPanel();
		allContainers.setLayout(new BoxLayout(allContainers,BoxLayout.X_AXIS));
		allContainers.add(taskContainer1);
		allContainers.add(taskContainer2);
		allContainers.add(taskContainer3);
		allContainers.add(taskContainer4);
		allContainers.add(taskContainer5);
		allContainers.add(taskContainer6);
		allContainers.add(taskContainer7);
		
		add(new TitleBar(),BorderLayout.NORTH);
		add(allContainers,BorderLayout.CENTER);
	}
}
