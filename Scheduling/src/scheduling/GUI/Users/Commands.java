/**
 * 
 */
package scheduling.GUI.Users;

/**
 * @author Morten Lorenzen
 *
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Commands extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton cmdNewUser;
	private JButton cmdEdit;
	private JButton cmdCancel;
	private JTable table;

	public Commands(JTable table)
	{
		this.table = table;
		
		//construct components
		cmdNewUser = new JButton ("New User");
		cmdEdit = new JButton ("Edit");
		cmdCancel = new JButton ("Cancel");

		//adjust size and set layout
		FlowLayout layout = new FlowLayout();
		layout.setHgap (19);
		layout.setVgap (5);
		setLayout (layout);
		
		//Action Listeners
		cmdNewUser.addActionListener(new ButtonClick());
		cmdEdit.addActionListener(new ButtonClick());
		cmdCancel.addActionListener(new ButtonClick());

		//add components
		add (cmdNewUser);
		add (cmdEdit);
		add (cmdCancel);

	}
	
	class ButtonClick implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			
			String command = ae.getActionCommand();
			int selectedRow = table.getSelectedRow();
			//table.getValueAt(row, column)
			
			if(command.equals("New User")){
				
			}
			else if(command.equals("Edit")){
				
			}
			else if(command.equals("Cancel")){
				
			}
		}
		
	}
}
