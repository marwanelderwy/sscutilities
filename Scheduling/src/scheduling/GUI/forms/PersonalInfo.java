package scheduling.GUI.forms;

import java.awt.*;
import javax.swing.*;

public class PersonalInfo extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel txtTitle;
	private JLabel lblFirstName;
	private JLabel lblMidName;
	private JLabel lblLastName;
	private JTextField txtFirstName;
	private JTextField txtMidName;
	private JTextField txtLastName;
	private JLabel lblAddress;
	private JLabel lblCity;
	private JLabel lblZipCode;
	private JTextField component11;
	private JTextField component12;
	private JTextField component13;
	private JLabel lblTel;
	private JLabel lblMob;
	private JTextField txtTel;
	private JTextField txtMob;
	private JLabel lblEmail;
	private JTextField component19;
	private JLabel lblBirth;
	private JTextField txtDay;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JLabel txt1;
	private JLabel txt2;
	private JButton cmdCancel;
	private JButton cmdEnter;
	private JTextField component28;
	private JLabel lblPosition;
	private JLabel lbl;
	private JComboBox cmbAccess;

	public PersonalInfo()
	{
		//construct preComponents
		String[] cmbAccessItems = {"Item 1", "Item 2", "Item 3"};

		//construct components
		txtTitle = new JLabel ("Personlige Informationer");
		lblFirstName = new JLabel ("Fornavn*:");
		lblMidName = new JLabel ("Mellemnavn:");
		lblLastName = new JLabel ("Efternavn*:");
		txtFirstName = new JTextField (5);
		txtMidName = new JTextField (5);
		txtLastName = new JTextField (5);
		lblAddress = new JLabel ("Vejnavn:");
		lblCity = new JLabel ("By:");
		lblZipCode = new JLabel ("Postnr:");
		component11 = new JTextField (5);
		component12 = new JTextField (5);
		component13 = new JTextField (5);
		lblTel = new JLabel ("Hjemmetelefon:");
		lblMob = new JLabel ("Mobiltelefon:");
		txtTel = new JTextField (5);
		txtMob = new JTextField (5);
		lblEmail = new JLabel ("E-mail:");
		component19 = new JTextField (5);
		lblBirth = new JLabel ("Fødselsdato:");
		txtDay = new JTextField (5);
		txtMonth = new JTextField (5);
		txtYear = new JTextField (5);
		txt1 = new JLabel (" -");
		txt2 = new JLabel (" -");
		cmdCancel = new JButton ("Cancel");
		cmdEnter = new JButton ("Enter");
		component28 = new JTextField (5);
		lblPosition = new JLabel ("Stilling:");
		lbl = new JLabel ("Access*:");
		cmbAccess = new JComboBox (cmbAccessItems);

		//adjust size and set layout
		setPreferredSize (new Dimension (509, 565));
		setLayout (null);

		//add components
		add (txtTitle);
		add (lblFirstName);
		add (lblMidName);
		add (lblLastName);
		add (txtFirstName);
		add (txtMidName);
		add (txtLastName);
		add (lblAddress);
		add (lblCity);
		add (lblZipCode);
		add (component11);
		add (component12);
		add (component13);
		add (lblTel);
		add (lblMob);
		add (txtTel);
		add (txtMob);
		add (lblEmail);
		add (component19);
		add (lblBirth);
		add (txtDay);
		add (txtMonth);
		add (txtYear);
		add (txt1);
		add (txt2);
		add (cmdCancel);
		add (cmdEnter);
		add (component28);
		add (lblPosition);
		add (lbl);
		add (cmbAccess);

		//set component bounds (only needed by Absolute Positioning)
		txtTitle.setBounds (165, 15, 150, 25);
		lblFirstName.setBounds (100, 65, 100, 25);
		lblMidName.setBounds (100, 100, 100, 25);
		lblLastName.setBounds (100, 135, 100, 25);
		txtFirstName.setBounds (190, 65, 100, 25);
		txtMidName.setBounds (190, 100, 100, 25);
		txtLastName.setBounds (190, 135, 100, 25);
		lblAddress.setBounds (100, 215, 100, 25);
		lblCity.setBounds (100, 250, 100, 25);
		lblZipCode.setBounds (100, 285, 100, 25);
		component11.setBounds (190, 215, 150, 25);
		component12.setBounds (190, 250, 150, 25);
		component13.setBounds (190, 285, 75, 25);
		lblTel.setBounds (100, 320, 100, 25);
		lblMob.setBounds (100, 355, 100, 25);
		txtTel.setBounds (215, 320, 100, 25);
		txtMob.setBounds (215, 355, 100, 25);
		lblEmail.setBounds (100, 390, 100, 25);
		component19.setBounds (190, 390, 200, 25);
		lblBirth.setBounds (100, 170, 100, 25);
		txtDay.setBounds (190, 170, 20, 25);
		txtMonth.setBounds (220, 170, 20, 25);
		txtYear.setBounds (250, 170, 40, 25);
		txt1.setBounds (210, 170, 10, 25);
		txt2.setBounds (240, 170, 10, 25);
		cmdCancel.setBounds (215, 500, 100, 25);
		cmdEnter.setBounds (355, 500, 100, 25);
		component28.setBounds (190, 425, 126, 25);
		lblPosition.setBounds (100, 425, 100, 25);
		lbl.setBounds (100, 460, 100, 25);
		cmbAccess.setBounds (190, 460, 124, 25);
	}
	
	public JFrame getFrame(){
		JFrame frame = new JFrame ("Indtast Personlige Oplysninger");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new PersonalInfo());
		frame.setResizable(false);
		frame.pack();
		
		return frame;
	}

	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("JPanel Preview");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add (new PersonalInfo());
		frame.pack();
		frame.setResizable(false);
		frame.setVisible (true);
	}
}
