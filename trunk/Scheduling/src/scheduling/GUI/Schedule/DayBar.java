/**
 * 
 */
package scheduling.GUI.Schedule;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Morten Lorenzen
 *
 */
public class DayBar extends JPanel{
	
	public DayBar(String nameOfDay){
		setPreferredSize(new Dimension(100,20));
		setLayout(new BorderLayout());
		setBackground(new Color(141,198,128));
		JLabel date = new JLabel(nameOfDay);
		date.setFont(new Font("Ariel",1,12));
		add(date,BorderLayout.CENTER);	
	}

}
