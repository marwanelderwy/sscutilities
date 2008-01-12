/**
 * 
 */
package scheduling.GUI.Schedule;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import scheduling.GUI.forms.Login;

/**
 * @author Morten Lorenzen
 *
 */
public class WeekNrDisplay extends JPanel{
		
	private JLabel lblWeek = null;
	public WeekNrDisplay(){
			setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
			
			lblWeek = new JLabel("Uge 39");
			lblWeek.setFont(new Font("Verdana",0,20));
			
			JButton prev = new JButton(new ImageIcon("Icons/lc10616.png"));
			prev.setFocusPainted(false);
			prev.setRolloverIcon(new ImageIcon("Icons/lc10616over.png"));
			prev.setPressedIcon(new ImageIcon("Icons/lc10616over.png"));
			prev.setRolloverEnabled(true);
			prev.setBorderPainted(false);
			prev.setContentAreaFilled(false);
			prev.addActionListener(new changeWeek());
			
			JButton next = new JButton(new ImageIcon("Icons/lc10619.png"));
			next.setFocusPainted(false);
			next.setRolloverIcon(new ImageIcon("Icons/lc10619over.png"));
		    next.setPressedIcon(new ImageIcon("Icons/lc10619over.png"));
			next.setRolloverEnabled(true);
		    next.setBorderPainted(false);
		    next.setContentAreaFilled(false);
		    next.addActionListener(new changeWeek());
			
		    add(prev);
		    add(lblWeek);
			add(next);
	}
	
	class changeWeek implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			Object command = ae.getSource();
			
			System.out.println(command);
			
		}
		
	}
}
