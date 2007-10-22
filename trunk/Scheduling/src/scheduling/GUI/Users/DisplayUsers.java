/**
 * 
 */
package scheduling.GUI.Users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

/**
 * @author Morten Lorenzen
 *
 */
public class DisplayUsers extends JPanel{

	public Container kasse;
	public JScrollPane scrollPane;
	
	public DisplayUsers(AbstractUserTable mtb){
		setLayout(new BorderLayout());
		
		this.setPreferredSize(new Dimension(500,200));
		setBackground(new Color(190,205,150));
		
		//The table is initialized.	
		JTable table = new JTable(mtb);
		scrollPane = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(500,200));
		
		//modifying table appearance
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setHorizontalAlignment(JLabel.CENTER);
		TableColumn col1 = table.getColumnModel().getColumn(0);
		TableColumn col2 = table.getColumnModel().getColumn(1);
		TableColumn col3 = table.getColumnModel().getColumn(2);
		TableColumn col4 = table.getColumnModel().getColumn(3);
		col1.setPreferredWidth(40);
		col1.setMaxWidth(45);
		col1.setMinWidth(35);
		col1.setCellRenderer(renderer);
		col2.setPreferredWidth(200);
		col3.setPreferredWidth(125);
		col3.setMaxWidth(150);
		col3.setMinWidth(100);
		col3.setCellRenderer(renderer);
		col4.setPreferredWidth(125);
		col4.setMaxWidth(150);
		col4.setMinWidth(100);
		col4.setCellRenderer(renderer);
		

		add(scrollPane, BorderLayout.CENTER);
		add(new Commands(table), BorderLayout.SOUTH);
	}
}
