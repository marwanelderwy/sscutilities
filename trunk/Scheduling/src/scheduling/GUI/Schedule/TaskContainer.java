/**
 * 
 */
package scheduling.GUI.Schedule;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author Morten Lorenzen
 *
 */
public class TaskContainer extends JPanel {
	
	private JPanel tasks = new JPanel();
	
	public TaskContainer(){
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(100,200));
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Color.gray));
		
		add(new DateBar("01-10-2007"));
		add(new DayBar("Mandag"));
		
		tasks.setPreferredSize(new Dimension(100,170));
		add(tasks);
		
	}

}
