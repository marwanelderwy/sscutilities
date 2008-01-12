/**
 * 
 */
package scheduling.exec.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import scheduling.exec.PerformLogin;

/**
 * @author Morten Lorenzen
 *
 */
public class CommonDataHolder {
	
	private static CommonDataHolder theInstance = new CommonDataHolder();
	
	static public CommonDataHolder getinstance(){
		return theInstance;
	}
	
	/*
	 * User specific variables
	 */
	private Connection con;
	private String firstName;
	private String middelName;
	private String lastName;
	private Access userAccess;
	
	/*
	 * Global variables
	 */
	private String host = "localhost";
	
	protected CommonDataHolder(){
		con = null;
	}
	
	/*
	 * reseting all variables related to user.
	 */
	public void logout(){
		con = null;
		firstName = "";
		middelName = "";
		lastName = "";
	}
	
	/**
	 * @param myCon save a connection session to DB
	 */
	public void setCon(Connection myCon){
		con = myCon;
	}
	
	/**
	 * @return Get current DB connection. Null if no connection established.
	 */
	public Connection getCon(){
			if(con != null && connectionIsValid(con)){
				return con;
			}
			
		JOptionPane.showMessageDialog(null, "Connection to database has been lost."
				, "ERROR" , JOptionPane.ERROR_MESSAGE);
		PerformLogin pl = new PerformLogin(1);
		while(pl.isPerformingLogin()){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "Fatal Error. Save your work and restart application."
						, "ERROR" , JOptionPane.ERROR_MESSAGE);
			}
		}
		return con;
	}
	
	
	private boolean connectionIsValid(Connection dbConn) {
        //log.debug("ENTER connectionIsValid(): "+dbConn);        
        boolean result = true;
        
        PreparedStatement psr = null;
        try {
            //Prepared statement is used to cache the compiled SQL
            psr = dbConn.prepareStatement("SELECT COUNT(*) FROM systemusers WHERE 1 = -1");
            psr.executeQuery();
        } catch (SQLException e) {
            try {
                dbConn.close(); //dbConn is never null at this point
                dbConn=null;
            } catch (Exception ee) {
                
            }
            result = false;
        } finally {
            try {
                //free up resource kept by the test statement
                if (psr!=null) {
                    psr.close();
                }               
                psr=null;
            } catch (Exception e) {
                //quite
            }
        }        
        return result;
    }

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middelName
	 */
	public String getMiddelName() {
		return middelName;
	}

	/**
	 * @param middelName the middelName to set
	 */
	public void setMiddelName(String middelName) {
		this.middelName = middelName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	
}
