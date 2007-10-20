/**
 * 
 */
package scheduling.GUI.Users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 * @author Morten Lorenzen
 *
 */
public class DisplayUsers extends JPanel{

	public Container kasse;
	public JScrollPane scrollPane;
	
	public DisplayUsers(){
		setLayout(new BorderLayout());
		
		this.setPreferredSize(new Dimension(500,200));
		setBackground(new Color(190,205,150));
		
		//The table is initialized.	
		AbstractUserTable mtb = new AbstractUserTable();
		JTable table = new JTable(mtb);
		scrollPane = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(500,200));
		
		//The container is initialized.
		
		kasse = new Container();
		kasse.setLayout(new BorderLayout());
		kasse.add(table.getTableHeader(), BorderLayout.PAGE_START);
		kasse.add(table, BorderLayout.CENTER);
		add(kasse);
		
		
	}
}
