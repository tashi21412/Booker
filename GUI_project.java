/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	private JMenuBar menuBar;
	private JTextField FName;
	private JLabel ID;
	private JTextField LName;
	private JPasswordField PWord;
	private JButton button1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label4;
	private JTextField textfield4;
	private JTextField idee;
	private JPasswordField passWord;
	private JLabel ideel;
	
	public SignUp signUp;
	

	//Constructor 
	public GUI_project(){

		this.setTitle("signUp");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(255,153,102));


		FName = new JTextField();
		FName.setBounds(136,44,175,38);
		FName.setBackground(new Color(255,255,255));
		FName.setForeground(new Color(0,0,0));
		FName.setEnabled(true);
		FName.setFont(new Font("sansserif",0,12));
		FName.setText("");
		FName.setVisible(true);
		
		idee = new JTextField();
		idee.setBounds(136,44,175,38);
		idee.setBackground(new Color(255,255,255));
		idee.setForeground(new Color(0,0,0));
		idee.setEnabled(true);
		idee.setFont(new Font("sansserif",0,12));
		idee.setText("");
		idee.setVisible(false);

		ID = new JLabel();
		ID.setBounds(316,142,90,35);
		ID.setBackground(new Color(214,217,223));
		ID.setForeground(new Color(0,0,0));
		ID.setEnabled(true);
		ID.setFont(new Font("sansserif",0,12));
		ID.setText("New ID *");
		ID.setVisible(true);

		LName = new JTextField();
		LName.setBounds(136,88,175,38);
		LName.setBackground(new Color(255,255,255));
		LName.setForeground(new Color(0,0,0));
		LName.setEnabled(true);
		LName.setFont(new Font("sansserif",0,12));
		LName.setText("");
		LName.setVisible(true);

		PWord = new JPasswordField();
		PWord.setBounds(136,176,175,38);
		PWord.setBackground(new Color(214,217,223));
		PWord.setForeground(new Color(0,0,0));
		PWord.setEnabled(true);
		PWord.setFont(new Font("sansserif",0,12));
		PWord.setVisible(true);

		button1 = new JButton();
		button1.setBounds(184,227,90,35);
		button1.setBackground(new Color(255,255,255));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("sansserif",0,12));
		button1.setText("Sign Up!");
		button1.setVisible(true);
		//Set action for button click
		//Call defined method
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				singUp(evt);
			}
		});

		//Set action for key events
		//Call defined method
		


		label1 = new JLabel();
		label1.setBounds(314,51,90,35);
		label1.setBackground(new Color(255,102,102));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(false);
		label1.setFont(new Font("sansserif",0,12));
		label1.setText("First Name *");
		label1.setVisible(true);
		
		ideel= new JLabel();
		ideel.setBounds(314,51,90,35);
		ideel.setBackground(new Color(255,102,102));
		ideel.setForeground(new Color(0,0,0));
		ideel.setEnabled(false);
		ideel.setFont(new Font("sansserif",0,12));
		ideel.setText("ID");
		ideel.setVisible(false);

		label2 = new JLabel();
		label2.setBounds(312,95,90,35);
		label2.setBackground(new Color(214,217,223));
		label2.setForeground(new Color(0,0,0));
		label2.setEnabled(true);
		label2.setFont(new Font("sansserif",0,12));
		label2.setText("Last Name *");
		label2.setVisible(true);

		label4 = new JLabel();
		label4.setBounds(316,177,150,35);
		label4.setBackground(new Color(214,217,223));
		label4.setForeground(new Color(0,0,0));
		label4.setEnabled(true);
		label4.setFont(new Font("sansserif",0,12));
		label4.setText("New Password *");
		label4.setVisible(true);

		textfield4 = new JTextField();
		textfield4.setBounds(136,132,175,38);
		textfield4.setBackground(new Color(255,255,255));
		textfield4.setForeground(new Color(0,0,0));
		textfield4.setEnabled(true);
		textfield4.setFont(new Font("sansserif",0,12));
		textfield4.setText("");
		textfield4.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(FName);
		contentPane.add(ID);
		contentPane.add(LName);
		contentPane.add(PWord);
		contentPane.add(button1);
		contentPane.add(label1);
		contentPane.add(label2);
		contentPane.add(label4);
		contentPane.add(textfield4);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for button1
	private void singUp (ActionEvent evt) {
	       String Fname, Lname, Id, password;
	       Fname=FName.getText();
	       Lname=LName.getText();
	       Id=ID.getText();
	       password=PWord.getText();
	       FName.setVisible(false);
	       LName.setVisible(false);
	       textfield4.setVisible(false);
	       PWord.setVisible (false);
	       button1.setVisible(false);
	       label1.setVisible(false);
	       label2.setVisible(false);
	       label4.setVisible(false);
	       ID.setVisible(false);
	       idee.setVisible(true);
	       ideel.setVisible(true);
	       
	       
	       
	       
	}

	

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}