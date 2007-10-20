/**
 * 
 */
package scheduling.exec.db;

import java.sql.Connection;

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
		return con;
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
