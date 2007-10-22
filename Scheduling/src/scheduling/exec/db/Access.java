/**
 * 
 */
package scheduling.exec.db;

/**
 * @author Morten Lorenzen
 *
 */
public class Access {

	private int value;
	private String name;
	
	public Access(int val, String name){
		this.value = val;
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	
}
