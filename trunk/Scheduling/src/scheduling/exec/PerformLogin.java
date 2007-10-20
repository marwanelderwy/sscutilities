package scheduling.exec;

import java.sql.Connection;

import scheduling.exec.db.CommonDataHolder;
import scheduling.exec.db.Database;

public class PerformLogin {
	
	private Database DBcon;
	private Connection con;
	private CommonDataHolder data;
	
	public PerformLogin(){
		DBcon = new Database();
		data = CommonDataHolder.getinstance();
		
	}
	
	public boolean validateUser(String username, String password){
		
		con = DBcon.getConn(username, password, data.getHost());
		if(con != null){
			data.setCon(con);
			
			return true;
		}
		
		return false;
	}
}
