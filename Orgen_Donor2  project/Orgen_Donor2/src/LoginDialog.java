import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Toolkit;

//This calss Handels the UserName And password for Login

public class LoginDialog extends JDialog {
	String rs="Reg",rpass="1234";			//USERNAME AND PASSWORD FOR ADDMANSTER
	String s="Doctor",pass="0000";			//USERNAME AND PASSWORD FOR REGISTEAR
	String pss;


	private final JPanel contentPanel = new JPanel(); 
	private JTextField textField;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginDialog() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\eclipse-workspace\\Orgen_Donor2\\background.jpg"));
		 
		setAlwaysOnTop(true);
		
		JLabel lla=new JLabel("",new ImageIcon("b2.jpg"),JLabel.CENTER);  //SET IMAGE ON BACKGROUND ON DIALOG 

		
 		setBounds(100, 100,290,316);
 		setLocation(680,310);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setFont(new Font("Times New Roman", Font.PLAIN, 33));
		lblLoginPage.setBounds(56, 0, 179, 80);
		contentPanel.add(lblLoginPage);
		
		JLabel lblUsername = new JLabel("UserName :-");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(10, 90, 144, 31);
		contentPanel.add(lblUsername);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(122, 90, 144, 31);
		contentPanel.add(textField);
		textField.setColumns(10);
 

		
		JLabel lblPassword = new JLabel("Password :-");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(10, 141, 125, 31);
		contentPanel.add(lblPassword);
		
		//here we chack the UserName OR Password valadition
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				int chak=0;
				pss=new String(passwordField.getPassword());
			
				if(s.equals(textField.getText()) && pass.equals(pss))
				{
					chak++;
					JOptionPane.showMessageDialog(contentPanel,"LOGIN SUCCESSFULLY","Conform",JOptionPane.INFORMATION_MESSAGE);
 					DataBase frame = new DataBase();
					frame.setVisible(true);
					
					setVisible(false);
				
				}else 
					{
						if(rs.equals(textField.getText()) && rpass.equals(pss) )
						{ 
							JOptionPane.showMessageDialog(contentPanel,"LOGIN SUCCESSFULLY","Conform",JOptionPane.INFORMATION_MESSAGE);
							setVisible(false);

							DonatonForm frame = new DonatonForm();
							frame.setVisible(true); 
						}else {JOptionPane.showMessageDialog(contentPanel,"Invalid username or password","Conform",JOptionPane.INFORMATION_MESSAGE);}
					}
				}
		});
		passwordField.setBounds(122, 143, 144, 31);
		contentPanel.add(passwordField);
		
		JButton btnExitt = new JButton("EXIT");
		btnExitt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnExitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
			
		});
		btnExitt.setBounds(40, 208, 83, 46);
		contentPanel.add(btnExitt);
		
		JButton btnLogin = new JButton("LOGIN",new ImageIcon("lo.")); 
		btnLogin.setForeground(Color.RED);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				passwordField.setText("");
				
			}
		});
		btnLogin.setBounds(151, 208, 94, 46);
		contentPanel.add(btnLogin);
		
		lla.setBounds(-12,0,298,290);
		contentPanel.add(lla);
		
		

	}
}
