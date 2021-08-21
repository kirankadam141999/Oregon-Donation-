import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Infomation extends JDialog {
	String organ="";


	private final JPanel contentPanel = new JPanel();

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
	 * @param dAss 
	 * @param dbg 
	 * @param dblod 
	 * @param deye 
	 * @param dkid 
	 * @param dliv 
	 * @param dhrt 
	 * @param dgen 
	 * @param dMO 
	 * @param dEmail 
	 * @param dAaddress 
	 * @param dAge 
	 * @param date 
	 */
	public Infomation(String dname, String dAge, String dAaddress, String dEmail, String dMO, String dgen, String dhrt, String dliv, String dkid, String deye, String dblod, String dbg, String ddises, String date) {
		setBounds(400, 60, 733, 756);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(224, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	
 		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblInformationOfDonar = new JLabel("Information of Donar Person");
		lblInformationOfDonar.setBackground(new Color(51, 153, 0));
		lblInformationOfDonar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblInformationOfDonar.setBounds(186, 28, 411, 39);
		contentPanel.add(lblInformationOfDonar);
		
		JLabel lblName = new JLabel("Name :-");
		lblName.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblName.setBounds(29, 122, 92, 24);
		contentPanel.add(lblName);
		
		JLabel lblNewLabel = new JLabel(dname);
		
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblNewLabel.setBounds(118, 123, 411, 24);
		contentPanel.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age :-");
		lblAge.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblAge.setBounds(29, 170, 92, 24);
		contentPanel.add(lblAge);
		
		JLabel lblAddress = new JLabel("Address :-");
		lblAddress.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblAddress.setBounds(29, 221, 117, 24);
		contentPanel.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email :-");
		lblEmail.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblEmail.setBounds(29, 268, 92, 24);
		contentPanel.add(lblEmail);
		
		JLabel lblContactNumber = new JLabel("Contact Number  :-");
		lblContactNumber.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblContactNumber.setBounds(26, 330, 214, 24);
		contentPanel.add(lblContactNumber);
		
		JLabel lblGender = new JLabel("Gender :-");
		lblGender.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblGender.setBounds(29, 387, 117, 24);
		contentPanel.add(lblGender);
		
		JLabel lblOrgan = new JLabel("Organ :-");
		lblOrgan.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblOrgan.setBounds(29, 445, 103, 31);
		contentPanel.add(lblOrgan);
		
		JLabel lblBloodgroup = new JLabel("BloodGroup :-");
		lblBloodgroup.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblBloodgroup.setBounds(29, 502, 178, 31);
		contentPanel.add(lblBloodgroup);
		
		JLabel lblDisease = new JLabel("Disease :-");
		lblDisease.setFont(new Font("Times New Roman", Font.ITALIC, 26));
		lblDisease.setBounds(29, 557, 117, 24);
		contentPanel.add(lblDisease);
		
		JLabel lblGetage = new JLabel(dAge);
		lblGetage.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblGetage.setBounds(105, 168, 72, 31);
		contentPanel.add(lblGetage);
		
		JLabel lblGetadders = new JLabel(dAaddress);
		lblGetadders.setVerticalAlignment(SwingConstants.TOP);
		lblGetadders.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		lblGetadders.setBounds(142, 221, 567, 39);
		contentPanel.add(lblGetadders);
		
		JLabel lblGetemail = new JLabel(dEmail);
		lblGetemail.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblGetemail.setBounds(118, 266, 411, 31);
		contentPanel.add(lblGetemail);
		
		JLabel lblGetcont = new JLabel(dMO);
		lblGetcont.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblGetcont.setBounds(239, 330, 120, 26);
		contentPanel.add(lblGetcont);
		
		JLabel lblGetgender = new JLabel(dgen);
		lblGetgender.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		lblGetgender.setBounds(140, 385, 117, 31);
		contentPanel.add(lblGetgender);
		 
		JLabel lblGetheart = new JLabel(dhrt+" "+dliv+" "+dkid+" "+deye+" "+dblod);
					 
		lblGetheart.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		lblGetheart.setBounds(125, 446, 584, 31);
		contentPanel.add(lblGetheart);
		
		JLabel lblGrtblodgp = new JLabel(dbg);
		lblGrtblodgp.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblGrtblodgp.setBounds(198, 504, 92, 31);
		contentPanel.add(lblGrtblodgp);
		
		
		JLabel lblGetdises = new JLabel(ddises);
		lblGetdises.setVerticalAlignment(SwingConstants.TOP);
		lblGetdises.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		lblGetdises.setBounds(147, 558, 261, 53);
		contentPanel.add(lblGetdises);
		
		JLabel lblRegestrationDate = new JLabel("Regestration Date :-");
		lblRegestrationDate.setFont(new Font("Times New Roman", Font.ITALIC, 24));
		lblRegestrationDate.setBounds(29, 598, 203, 39);
		contentPanel.add(lblRegestrationDate);
		
		JLabel lblGetdate = new JLabel(date);
		lblGetdate.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblGetdate.setBounds(239, 598, 301, 39);
		contentPanel.add(lblGetdate);
		
		

		if(ddises.isEmpty()) {
			lblGetdises.setVisible(false);	
			lblDisease.setVisible(false);	
		}
		 
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(new Color(255, 0, 0));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);	
			}
		});
		btnClose.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		btnClose.setBounds(574, 645, 108, 39);
		contentPanel.add(btnClose);
		
		JButton btnCall = new JButton("Call");
		btnCall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
				QRCode frame = new QRCode(dMO);
				 
				frame.setVisible(true);
			
			}
		});
		btnCall.setForeground(new Color(46, 139, 87));
		btnCall.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		btnCall.setBounds(437, 647, 103, 37);
		contentPanel.add(btnCall);
		
		 				
		
	
		 }
}
