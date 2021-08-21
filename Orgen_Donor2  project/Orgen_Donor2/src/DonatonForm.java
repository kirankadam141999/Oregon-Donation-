import java.awt.BorderLayout;

import java.util.*;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DonatonForm extends JFrame {
			int ivage,value=0;
			String ivcont;
			String heart="",liver="",kidney="",eye="",blood="",bloodgrp="";
			String Dname="",Dage="",Daddrass="",Demail="",Dconactmo="",Dgender="",Ddisease="",SubmitDate="";
 			int textchack=0,ack=0,eck=0,mck=0;
			
			/*
			 * Value = this use for Dispaly Massage The Empty 
			 * Ivage = this chack the age is valid or not 
			 * ivcont = it chack the mobile number is valid or not 
			 * heart,liver,kidney,eye,blood,bloodgrp = this take the value of user witch organ is selected
			 * Dname,Dage,Daddfrass,Demail,Dconactmo,Ddisease,submitDate = its also hold the value of user are etered
			    */


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DonatonForm() {
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setEnabled(false);

		
		
		btnSubmit.setToolTipText("Fill full form to submit");
		JTextArea textArea = new JTextArea();
		JRadioButton rdbtnMale = new JRadioButton("Male");
		JRadioButton rdbtnFemale = new JRadioButton("Female");


		

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\eclipse-workspace\\Orgen_Donor2\\background.jpg"));
		


		JLabel lll=new JLabel("",new ImageIcon("lb2.jpg"),JLabel.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,658);
		setLocation(610,120); 
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTRY OF DONOR");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(75, 31, 298, 41);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblName = new JLabel("Name :-");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblName.setBounds(27, 82, 96, 31); 
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e)
			{
   				
				if(value==0) 
				{
					if( textField.getText().equals("") )
					{ 
						value++;
						JOptionPane.showMessageDialog(contentPane,"Invalid name","Conform",JOptionPane.INFORMATION_MESSAGE);
						value--;
					  
 					}  
				}  
			
			}
			
		
		});
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(104, 82, 248, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age :-");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblAge.setBounds(27, 123, 73, 31);
		contentPane.add(lblAge);
		
		JLabel lblAddress = new JLabel("Address :-");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblAddress.setBounds(27, 164, 118, 31);
		contentPane.add(lblAddress);
		
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnSubmit.setEnabled(false);

				if(value==0) {
					 
				if(textField_1.getText().isEmpty()) {
 
					value++;
					JOptionPane.showMessageDialog(contentPane,"Invalid age","Conform",JOptionPane.INFORMATION_MESSAGE);
					value--;
					
				} 
 				
			try {
			 	 ivage=Integer.parseInt(textField_1.getText());

					if(0>=ivage||64<=ivage)
					{btnSubmit.setEnabled(false);

						ack++;
 
						value++;
						JOptionPane.showMessageDialog(contentPane,"Invalid age","Conform",JOptionPane.INFORMATION_MESSAGE);
						value--;
					} else {ack=0;}
				}catch(NumberFormatException el) {}
			}
			}
		});
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setBounds(104, 123, 41, 29);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :-");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblEmail.setBounds(27, 267, 73, 16);
		contentPane.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnSubmit.setEnabled(false);

				int em=0;
			     String email=textField_2.getText();
		    	 String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

			     if(value==0)
			     {  
			     
			    	 if(textField_2.getText().isEmpty())
			    	 {
 
			    		 value++;
			    		 em++;
			    		
			    		 JOptionPane.showMessageDialog(contentPane,"Email field is empty","Conform",JOptionPane.INFORMATION_MESSAGE);
			    		 value--;
			    	 } 
			     
			    
			     
			      if( email.matches(regex)==false)
			      {	
			    	  eck++;
			    	  if(em==0)
			    	  {value++;
 						JOptionPane.showMessageDialog(contentPane,"Invalid Email","Conform",JOptionPane.INFORMATION_MESSAGE);
 						value--;
						btnSubmit.setEnabled(false);

			    	  }
			      }else {eck=0; } 
			     }
			     


			}
		});
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setBounds(104, 261, 248, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblConactNumber = new JLabel("Contact Number :-");
		lblConactNumber.setForeground(Color.BLACK);
		lblConactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblConactNumber.setBounds(27, 302, 171, 24);
		contentPane.add(lblConactNumber);
		
		textField_3 = new JTextField();
		textField_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnSubmit.setEnabled(false);

 				ivcont=textField_3.getText();
				if(value==0) 
				{
					
					if(textField_3.getText().isEmpty())
					{
						value++;
 						JOptionPane.showMessageDialog(contentPane,"Mobile number field is empty","Conform",JOptionPane.INFORMATION_MESSAGE);
						value--;  
					}else {
						
						try {
 			 	 
						if(10>ivcont.length()||10<ivcont.length())
						{	btnSubmit.setEnabled(false);
					
							mck++;
							value++;
							JOptionPane.showMessageDialog(contentPane,"Mobile number should be in 10 digits","Conform",JOptionPane.INFORMATION_MESSAGE);
							value--;
							
 						}else {mck=0;} 
					}catch(NumberFormatException el) {}
					}				 
				}
			}
		});
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_3.setBounds(194, 302, 105, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		JLabel lblOrgan = new JLabel("Organ :-");
		lblOrgan.setForeground(Color.BLACK);
		lblOrgan.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblOrgan.setBounds(27, 382, 90, 20);
		contentPane.add(lblOrgan);
		
		JCheckBox chckbxHeart = new JCheckBox("Heart");
		chckbxHeart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSubmit.setEnabled(false);

				if(chckbxHeart.isSelected()) {
				 heart=chckbxHeart.getLabel();
				 

				}
 			 }
		});
		chckbxHeart.setForeground(Color.BLACK);
		chckbxHeart.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxHeart.setBounds(129, 393, 69, 21);
		contentPane.add(chckbxHeart);
		
		JCheckBox chckbxLiver = new JCheckBox("Liver");
		chckbxLiver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSubmit.setEnabled(false);

				if(chckbxLiver.isSelected()) {
					 liver=chckbxLiver.getLabel();
	
					}

 			}
		});
		chckbxLiver.setForeground(Color.BLACK);
		chckbxLiver.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxLiver.setBounds(205, 393, 69, 21);
		contentPane.add(chckbxLiver);
		
		JCheckBox chckbxKidney = new JCheckBox("Kidney");
		chckbxKidney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSubmit.setEnabled(false);

				if(chckbxKidney.isSelected()) {
					 kidney=chckbxKidney.getLabel();
	
					}
 			}
		});
		chckbxKidney.setForeground(Color.BLACK);
		chckbxKidney.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxKidney.setBounds(277, 395, 96, 17);
		contentPane.add(chckbxKidney);
		
		JCheckBox chckbxEay = new JCheckBox("Eye");
		chckbxEay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSubmit.setEnabled(false);

				if(chckbxEay.isSelected()) {
					eye=chckbxEay.getLabel();
	
					}
 			}
		});
		chckbxEay.setForeground(Color.BLACK);
		chckbxEay.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxEay.setBounds(125, 422, 57, 21);
		contentPane.add(chckbxEay);
		
		JCheckBox chckbxBlood = new JCheckBox("Blood");
		chckbxBlood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSubmit.setEnabled(false);

				if(chckbxBlood.isSelected()) {
					 blood=chckbxBlood.getLabel();

					}
 			}
		});
		chckbxBlood.setForeground(Color.BLACK);
		chckbxBlood.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxBlood.setBounds(204, 422, 95, 21); 
		contentPane.add(chckbxBlood);
		
		JLabel lblBloodGroup = new JLabel("Blood Group :-");
		lblBloodGroup.setForeground(Color.BLACK);
		lblBloodGroup.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblBloodGroup.setBounds(27, 449, 144, 20);
		contentPane.add(lblBloodGroup);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bloodgrp=comboBox.getSelectedItem().toString();
				btnSubmit.setEnabled(false);
				if(bloodgrp.equals("-Select-")) {
					btnSubmit.setEnabled(false);

				}

 			}
		});
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Select-","A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-"}));
		comboBox.setBounds(188, 448, 86, 21);
		contentPane.add(comboBox);
		
		JLabel lblDisease = new JLabel("Disease :-");
		lblDisease.setForeground(Color.BLACK);
		lblDisease.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblDisease.setBounds(27, 488, 90, 31);
		contentPane.add(lblDisease);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(240, 506, 186, 41);
		contentPane.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		textArea_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnSubmit.setEnabled(false);

			}
		});
		textArea_1.setEnabled(false);
		textArea_1.setToolTipText("Disease name :-");
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textArea_1.setLineWrap(true);
		
		
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				btnSubmit.setEnabled(false);

			}
		});


		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				String s=e.getActionCommand();
				 
				if(s.equals("Yes"))
				{
 
					 
					 textArea_1.setEnabled(true); 
				
				}
 				
			}
		});
		
		rdbtnYes.setForeground(Color.BLACK);
		rdbtnYes.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(125, 488, 57, 33);
		contentPane.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getActionCommand();
				 
				if(s.equals("No")) 
				{textArea_1.setText("");
					
 					 textArea_1.setEnabled(false);
					 
				} 
				
			

			  
			}
		});
		rdbtnNo.setForeground(Color.BLACK);
		rdbtnNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		buttonGroup.add(rdbtnNo); 
		rdbtnNo.setBounds(181, 488, 53, 33);
		contentPane.add(rdbtnNo);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(129, 164, 248, 83);
		contentPane.add(scrollPane_1);
		
 		textArea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(value==0) 
				{
				
				if( textArea.getText().isEmpty() )
				{ btnSubmit.setEnabled(false);
					value++;
					
 							JOptionPane.showMessageDialog(contentPane,"Address field is empty","Conform",JOptionPane.INFORMATION_MESSAGE);
					value--;
				} 	
				}
				
			}
		});
		scrollPane_1.setViewportView(textArea);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		

		
		
		
				
		JLabel lblDiseaseName = new JLabel("Disease name :-");
		lblDiseaseName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDiseaseName.setBounds(259, 476, 144, 33);
		contentPane.add(lblDiseaseName);
		
		JLabel lblGender = new JLabel("Gender :-");
		lblGender.setForeground(Color.BLACK);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblGender.setBounds(27, 347, 96, 25);
		contentPane.add(lblGender);
		
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getActionCommand();
				 

				if(s.equals("Male"))
				{ 
 					comboBox.setSelectedIndex(0);
					Dgender="Male";
					chckbxHeart.setSelected(false);
					chckbxLiver.setSelected(false);
					chckbxKidney.setSelected(false);
					chckbxEay.setSelected(false);
					chckbxBlood.setSelected(false);
					comboBox.setSelectedItem(false);
					
 				}
			} 
		});
		 		rdbtnMale.setForeground(Color.BLACK);
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		buttonGroup_1.add(rdbtnMale);
		rdbtnMale.setBounds(125, 350, 73, 21);
		contentPane.add(rdbtnMale);
		
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=e.getActionCommand();
				if(s.equals("Female"))
				{
					Dgender="Female";
					comboBox.setSelectedIndex(0);
					chckbxHeart.setSelected(false);
					chckbxLiver.setSelected(false);
					chckbxKidney.setSelected(false);
					chckbxEay.setSelected(false);
					chckbxBlood.setSelected(false);
					comboBox.setSelectedItem(false);
					
 				}
			
			}
		});
		 
		rdbtnFemale.setForeground(Color.BLACK);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		buttonGroup_1.add(rdbtnFemale);
		rdbtnFemale.setBounds(204, 350, 105, 21);
		contentPane.add(rdbtnFemale);
		
		 
		
		
		JButton btnVeryfy = new JButton("Verify");
		btnVeryfy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

 
 				int ck=0; 
				
				
				if(value==0)
				{
					if(textField.getText().isEmpty()||bloodgrp.equals("-Select-")||textField_1.getText().isEmpty()||bloodgrp.isEmpty()||textField_2.getText().isEmpty()
						||textField_3.getText().isEmpty()||textArea.getText().isEmpty()||ack>0||eck>0||mck>0
						||rdbtnMale.isSelected()==false&&rdbtnFemale.isSelected()==false
						||chckbxHeart.isSelected()==false  &&  chckbxLiver.isSelected()==false  &&  
						chckbxKidney.isSelected()==false  &&   chckbxEay.isSelected()==false  &&
						chckbxBlood.isSelected()==false || rdbtnYes.isSelected()==false&&rdbtnNo.isSelected()==false) 
						{
							btnSubmit.setEnabled(false);	
							ck++;
							value++;
							
							JOptionPane.showMessageDialog(contentPane,"Some Field are Empty So fill All Field to Submation ","Conform",JOptionPane.INFORMATION_MESSAGE);
							
							value--;
						
						}else {  btnSubmit.setEnabled(true);}
				
					if(rdbtnYes.isSelected())
					{					

						if(ck==0) 
						{
							if(value==0) 
							{
			
							  if(textArea_1.getText().isEmpty()) 
							  {							
								  btnSubmit.setEnabled(false);

								  value++;
 								  JOptionPane.showMessageDialog(contentPane,"Diseas field is Empty empty","Conform",JOptionPane.INFORMATION_MESSAGE);
						 
								  value--;
							  }else { btnSubmit.setEnabled(true);}
							}
						}

					}
 
				}
			}

			
		});
		btnVeryfy.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnVeryfy.setBounds(168, 557, 102, 41);
		contentPane.add(btnVeryfy);
		
		 	
		 
		btnSubmit.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
				Date date= new Date();
				System.out.println(date);
				SubmitDate=sdf.format(date);
				System.out.println(SubmitDate);

				
				Dname=textField.getText();
				Dage=textField_1.getText();
				Daddrass=textArea.getText();
				Demail=textField_2.getText();
				Dconactmo=textField_3.getText();
				Ddisease=textArea_1.getText();
				
				
				try {
					System.out.println("Hello"); 
						Class.forName("com.mysql.cj.jdbc.Driver");
						System.out.println("Registered");
					Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/organ_donation","OrgainDonition","OrgainDonition");
					 PreparedStatement preparedStatement = com.prepareStatement("INSERT INTO `donar_data`(`Donar_Name`,"
					 		+ " `Donae_Age`, `Donar_Address`, `Donar_Email`, `Donar_ConactNumber`, `Donar_Gender`, `DHeart`, "
					 		+ "`DLiver`, `DKidney`, `DEye`, `DBlood`, `DBlood_Group`, `Ddisease`,`Date_of_FormSubmit`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					
					 preparedStatement.setString(1,Dname);
					 preparedStatement.setString(2,Dage);				 
					 preparedStatement.setString(3,Daddrass);				 
					 preparedStatement.setString(4,Demail);				 
					 preparedStatement.setString(5,Dconactmo);				 
					 preparedStatement.setString(6,Dgender);				 
					 preparedStatement.setString(7,heart);				 
					 preparedStatement.setString(8,liver);				 
					 preparedStatement.setString(9,kidney);				 
					 preparedStatement.setString(10,eye);				 
					 preparedStatement.setString(11,blood);				 
					 preparedStatement.setString(12,bloodgrp);				 
					 preparedStatement.setString(13,Ddisease);
					 preparedStatement.setString(14,SubmitDate);


					 preparedStatement.execute(); 
						setVisible(false);
						
						
						JOptionPane.showMessageDialog(btnSubmit,"Data is saved","Conform",JOptionPane.INFORMATION_MESSAGE);

						int x=JOptionPane.showConfirmDialog(null,"NEW FORM","Conform",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
						
						if(x==JOptionPane.YES_OPTION)
					 		{
					 			DonatonForm frame = new DonatonForm();
					 			frame.setVisible(true);
							}else {setVisible(false);}
						

					}catch(Exception el) {
				JOptionPane.showMessageDialog(contentPane,"Server is not in running mode","Conform",JOptionPane.INFORMATION_MESSAGE);
						
						System.out.println(el);}

				
			}
			
			
			
		});
		
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnSubmit.setBounds(27, 557, 118, 41);
		contentPane.add(btnSubmit);
		btnSubmit.setEnabled(false);


		
		
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.setToolTipText("All Value will be reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    setVisible(false);	
				DonatonForm frame = new DonatonForm();
	 			frame.setVisible(true);	
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnReset.setBounds(291, 557, 118, 41);
		contentPane.add(btnReset);
		
		lll.setBounds(-12,-31,460,666);
		getContentPane().add(lll);
		
		
		
		 
	}
}
