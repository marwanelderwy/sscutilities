/**
 * 
 */
package scheduling.GUI.MainFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

/**
 * @author Morten Lorenzen
 *
 */
public class Console extends JTextArea{

	private static final long serialVersionUID = 1L;

	public Console(){
		
		//Dimensions and appearing settings
		setPreferredSize(new Dimension(400,200));
		setMaximumSize(new Dimension(400,300));
		setMinimumSize(new Dimension(200,100));
		
		setBackground(Color.white);
		setBorder(BorderFactory.createEmptyBorder(7, 7, 4, 4));
		
		setEditable(false);
		
	}
	
	public void write(String s){
		int MaxChar = 2000;
		int replaceRate = 20;
		
		append("\n"+s);
		
		while(MaxChar < getDocument().getLength()){
			replaceRange("", 0, replaceRate);
		}
		
	}
	
}
