/**
 * 
 */
package scheduling.GUI.MainFrame;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * @author Morten Lorenzen
 *
 */
public class WorkArea extends JTabbedPane{

	private static final long serialVersionUID = 1L;

	public WorkArea(){
		
		setPreferredSize(new Dimension(800,600));
		setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		
		add("Home  ", new JPanel());
		initTabComponent(0);
		add("Login  ", new JPanel());
		initTabComponent(1);
	}
	
	private void initTabComponent(int i) {
        setTabComponentAt(i,
                 new TabComponent(this));
    }    

	
}
