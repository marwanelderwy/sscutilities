/**
 * 
 */
package scheduling.GUI.MainFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author Morten Lorenzen
 *
 */
public class MainFrame extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public MainFrame(){
		setLayout(new BorderLayout());
		
		/*
		 * Working area 
		 */
		WorkArea workarea = new WorkArea();
		
		
		/*
		 * Console 
		 */
		Console console = new Console();
		JScrollPane consoleScroll = new JScrollPane(console);
		consoleScroll.setPreferredSize(new Dimension(200,200));
		consoleScroll.setMaximumSize(new Dimension(200,300));
		consoleScroll.setMinimumSize(new Dimension(200,100));
		
		
		/*
		 * Adding Components
		 */
		add(consoleScroll,BorderLayout.SOUTH);
		add(workarea, BorderLayout.CENTER);
		
		console.write("Console successfully added.");
	}

}
