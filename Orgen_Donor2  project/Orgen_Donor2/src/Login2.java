import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

/*This Class is Handle the Login of Addministater OR Registar */

public class Login2 extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		// this statement are display the image on Background By using Jlabel
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\eclipse-workspace\\Orgen_Donor2\\background.jpg"));
		
		JLabel ll=new JLabel("",new ImageIcon("bak.jpg"),JLabel.CENTER);
		ll.setFont(new Font("Times New Roman", Font.PLAIN, 29));


		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,610,610);
		setLocation(520,120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//This Button Addministater Login
		
		JButton btnNewButton = new JButton(new ImageIcon("addmi.jpg"));
		btnNewButton.setToolTipText("The Administrator Login Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDialog dialog = new LoginDialog();
 				dialog.setVisible(true);
			} 
		});
		btnNewButton.setBounds(60, 214, 161, 186);
		contentPane.add(btnNewButton);
		
		//This Button Registrar Login

		
		JButton btnNewButton_1 = new JButton(new ImageIcon("k.jpg"));
		btnNewButton_1.setToolTipText("The Registrar Login Button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginDialog dialog = new LoginDialog();
 				dialog.setVisible(true);
 				 }
		});
		btnNewButton_1.setBounds(380, 211, 161, 178);
		contentPane.add(btnNewButton_1);
		
		JLabel lblOrganDonaton = new JLabel("Organ Donation...\r\n");
		lblOrganDonaton.setFont(new Font("Times New Roman", Font.PLAIN, 60));
		lblOrganDonaton.setBounds(22, 456, 471, 51);
		contentPane.add(lblOrganDonaton);
		
		ll.setBounds(0,0,600,600);						   
		getContentPane().add(ll);
		
	}
}
