/**
 * 
 */
package scheduling.exec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import scheduling.exec.db.CommonDataHolder;

/**
 * @author Morten Lorenzen
 *
 */
public class UserManagement {
	
	public boolean AddNewUser(String username,
			int access,	String fname,
			String mname, String lname,
			String street, String houseno,
			int zipcode, String city,
			String telephone, String mobile,
			int birthday, int birthmonth,
			int birthyear, String position,
			String email){
		
		PreparedStatement pst = null;
		
		CommonDataHolder data = CommonDataHolder.getinstance();
		Connection con = data.getCon();
		
		if(con == null){
			return false;
		}
		
		try {
			String sql = "Call ADD_NEW_USER(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			
			pst.setString(1, username);
			pst.setInt(2, access);
			pst.setString(3, fname);
			pst.setString(4, mname);
			pst.setString(5, lname);
			pst.setString(6, street);
			pst.setString(7, houseno);
			pst.setInt(8, zipcode);
			pst.setString(9, city);
			pst.setString(10, telephone);
			pst.setString(11, mobile);
			pst.setInt(12, birthday);
			pst.setInt(13, birthmonth);
			pst.setInt(14, birthyear);
			pst.setString(15, position);
			pst.setString(16, email);
			
			pst.execute();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error adding new user: "+e.getMessage()
					, "ERROR" , JOptionPane.ERROR_MESSAGE);
			return false;
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
		return true;
	}
	
}
