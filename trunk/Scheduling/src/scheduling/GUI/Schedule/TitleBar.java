/**
 * 
 */
package scheduling.GUI.Schedule;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import scheduling.exec.db.CommonDataHolder;

/**
 * @author Morten Lorenzen
 *
 */
public class TitleBar extends JPanel{
	
	public TitleBar(){
		
		setLayout(new BorderLayout());
		CommonDataHolder data = CommonDataHolder.getinstance();
		
		JLabel lblName = new JLabel("    "+
				data.getFirstName() + " " +
				data.getMiddelName() + " " +
				data.getLastName());
		lblName.setFont(new Font("Verdana",1,15));
		
		add(lblName,BorderLayout.CENTER);
		add(new WeekNrDisplay(),BorderLayout.WEST);
	}
	
}

