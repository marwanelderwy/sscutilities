/**
 * 
 */
package scheduling.GUI.Users;

import javax.swing.table.AbstractTableModel;

/**
 * @author Morten Lorenzen
 *
 */
public class AbstractUserTable extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	
	Object[][] data = null;
	int rows = 0, cols = 0;
	String[] colNames = {"UID","Navn", "Stilling", "adgangsniveau"}; 
	
	public AbstractUserTable(){
		
	}
	
	
	public int getColumnCount() {
		return cols;
	}
	
	public void setTableSize(int row, int col){
		rows = row;
		cols = col;
		data = new Object[row][col];
	}

	public int getRowCount() {
		return rows;
	}

	public Object getValueAt(int row, int col) {
		return data[row][col];
	}
	
	public boolean isCellEditable(int row, int col){
		return false;
	}
	
	public void setValueAt(Object val,
            int row,
            int col){
		data[row][col] = val; 
		fireTableCellUpdated(row, col);
	}
	
	public String getColumnName(int column){
		return colNames[column];
	}
	
	public void setColumnName(String val, int col){
		colNames[col] = val;
	}

}
