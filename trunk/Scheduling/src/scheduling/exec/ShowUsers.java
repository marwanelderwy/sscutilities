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
		CommonDataHolder data = CommonDataHolder.getinstance();
		Database db = new Database();
		data.setCon(db.getConn("root", ".Morten7", "localhost"));
	}
	
	public AbstractUserTable getUserData(){
		
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		AbstractUserTable aut = new AbstractUserTable();
		
		CommonDataHolder data = CommonDataHolder.getinstance();
		Connection con = data.getCon();
		
		String sql = "SELECT UID, firstname, middelname, lastname, position, access " +
				"FROM scheduling.systemusers s natural join scheduling.personalinfo p";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			rsmd = rs.getMetaData();
			
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
		}
		
		return aut;
	}
	
}
