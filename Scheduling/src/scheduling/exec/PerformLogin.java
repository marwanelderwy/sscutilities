package scheduling.exec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import scheduling.GUI.forms.Login;
import scheduling.exec.db.CommonDataHolder;
import scheduling.exec.db.Database;

public class PerformLogin {
	
	private Database DBcon;
	private Connection con;
	private CommonDataHolder data;
	private JFrame frame = new JFrame();
	private boolean performingLogin = false;
	private int loginType = 0;
	
	
	/**
	 * @param loginType describes if its a first login (logintype = 0) or if it is a refresh of the DB connection (loginType = 1)
	 */
	public PerformLogin(int loginType){
		performingLogin = true;
		
		this.loginType = loginType;
		DBcon = new Database();
		data = CommonDataHolder.getinstance();
		
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new Login(this));
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
	
	public boolean validateUser(String username, String password){
		
		con = DBcon.getConn(username, password, data.getHost());
		if(con == null){
			return false;
		}
		data.setCon(con);
		
		if(!isRegistered(username)){
			return false;
		}
		return true;
		
	}
	
	public boolean isRegistered(String username){
		
		ResultSet rs = null;
		int rowCount = 0;
		String result = null;
		String sql = "SELECT s.Username FROM scheduling.systemusers s WHERE s.Username = 'morten'";
		
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			rs.last();
			rowCount = rs.getRow();
			result = rs.getString("Username");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error validating user!"
					, "ERROR" , JOptionPane.ERROR_MESSAGE);
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
		
		if(rowCount==1 && result.equals(username)){
			return true;
		}
		JOptionPane.showMessageDialog(null, "Fejl i brugernavn eller password."
				, "ERROR" , JOptionPane.ERROR_MESSAGE);
		return false;
	}
	
	public void runInitialize(){
		performingLogin = false;
		frame.setVisible(false);
		new Initialize();
	}
	
	public void hideLogin(){
		performingLogin = false;
		frame.setVisible(false);
	}

	/**
	 * @return the loginType
	 */
	public int getLoginType() {
		return loginType;
	}

	/**
	 * @return the performingLogin
	 */
	public boolean isPerformingLogin() {
		return performingLogin;
	}
}
