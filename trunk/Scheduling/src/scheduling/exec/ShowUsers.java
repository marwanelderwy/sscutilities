/**
 * 
 */
package scheduling.exec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import scheduling.GUI.Users.AbstractUserTable;
import scheduling.GUI.Users.DisplayUsers;
import scheduling.exec.db.CommonDataHolder;
import scheduling.exec.db.Database;

/**
 * @author Morten Lorenzen
 *
 */
public class ShowUsers {
	
	public ShowUsers(){

	}
	
	public AbstractUserTable getUserData(){
		
		ResultSet rs = null;
		AbstractUserTable aut = new AbstractUserTable();
		PreparedStatement pst = null;
		
		CommonDataHolder data = CommonDataHolder.getinstance();
		Connection con = data.getCon();
		
		String sql = "SELECT UID, firstname, middelname, lastname, position, access " +
				"FROM scheduling.systemusers s natural join scheduling.personalinfo p";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			rs.last();
			int rowCount = rs.getRow();
			aut.setTableSize(rowCount, 4);
			
			rs.beforeFirst();
			for(int r = 0; r<rowCount; r++){
				rs.next();
				aut.setValueAt(rs.getString("UID"), r, 0);
				aut.setValueAt(rs.getString("firstname")+" "+
						rs.getString("middelname")+" "+
						rs.getString("lastname"), r, 1);
				aut.setValueAt(rs.getString("position"), r, 2);
				aut.setValueAt(rs.getString("access"), r, 3);
			}			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error fetching data : "+
					e.getMessage() , "ERROR" , JOptionPane.ERROR_MESSAGE);
		} finally{
			try {
				if(pst!=null){
					pst.close();
				}
				pst=null;
			} catch (SQLException e) {
				//nothing
			}
		}
		
		return aut;
	}
	
}
