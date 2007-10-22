/**
 * 
 */
package scheduling.exec.db;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 * @author Morten Lorenzen
 *
 */

public class Database {

//	This method closes the connection to the database.
	public void closeCon(Connection con)
	{
		try{
			con.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error disconnecting from database : "+
					e.getMessage() , "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
	}

//	----------------------------------------------------

//	This method creates a new connection to the database.

	public Connection getConn(String USER, String PASS, String host)
	{
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://"+host+"/scheduling",
					USER,PASS);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Fejl i brugernavn eller password."
					, "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
		return con;
	}

}
