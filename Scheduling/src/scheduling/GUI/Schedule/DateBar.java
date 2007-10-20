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
public class DateBar extends JPanel{

	public DateBar(String date){
		addDate(new JLabel(date));
	}
	
	public DateBar(int dd, int mm, int yyyy){
		String day = new Integer(dd).toString();
		String month = new Integer(mm).toString();
		String year = new Integer(yyyy).toString();
		
		addDate(new JLabel(day+"-"+month+"-"+year));
	}
	
	public void addDate(JLabel date){
		setPreferredSize(new Dimension(100,30));
		setLayout(new BorderLayout());
		setBackground(new Color(141,198,128));
		date.setFont(new Font("Ariel",1,12));
		
		add(date,BorderLayout.CENTER);
	}
}
