import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class DataBase extends JFrame {
	String heart="",liver="",kidney="",eye="",blood="",allrecord="";
	String name1,name2;
	int tabcont;
	String namedelet;
	String  DName="",DAge="",DAaddress="",DEmail="",DMO="",Dgen="",Dhrt="",Dliv="",Dkid="",Deye="",Dblod="",Dbg="",DAss="",Date="";


	private JPanel contentPane;
	 private JTable table_2;
	 private final ButtonGroup buttonGroup = new ButtonGroup();

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
	public DataBase() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				Login2 frame = new Login2();
				frame.setVisible(true);
			}
			 
		});
		
		JButton btnNewButton_1 = new JButton("Information");
		btnNewButton_1.setEnabled(false);


		
		setBounds(200, 100, 1181, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JLabel lblSelectOptionFollowing = new JLabel("Select Option Following For Data of Donar :-");
		lblSelectOptionFollowing.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblSelectOptionFollowing.setBounds(37, 21, 508, 41);
		contentPane.add(lblSelectOptionFollowing);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Heart");
		rdbtnNewRadioButton.setBackground(new Color(255, 228, 181));
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			heart="SELECT `Donar_Name`, `Donae_Age`, `Donar_Address`, `Donar_Email`, `Donar_ConactNumber`, `Donar_Gender`, `DHeart`, `DBlood_Group`, `Ddisease`,`Date_of_FormSubmit` FROM `donar_data` WHERE DHeart='Heart'";
 			btnNewButton_1.setEnabled(false);

			}
		});
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		rdbtnNewRadioButton.setBounds(37, 84, 85, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Liver");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 228, 181));
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				liver="SELECT `Donar_Name`, `Donae_Age`, `Donar_Address`, `Donar_Email`, `Donar_ConactNumber`, `Donar_Gender`, `DLiver`,  `DBlood_Group`, `Ddisease`,`Date_of_FormSubmit` FROM `donar_data` WHERE DLiver='Liver'";
				btnNewButton_1.setEnabled(false);

			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		rdbtnNewRadioButton_1.setBounds(124, 84, 85, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Kidney");
		rdbtnNewRadioButton_2.setBackground(new Color(255, 228, 181));
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				kidney="SELECT `Donar_Name`, `Donae_Age`, `Donar_Address`, `Donar_Email`, `Donar_ConactNumber`, `Donar_Gender`, `DKidney`,  `DBlood_Group`, `Ddisease` ,`Date_of_FormSubmit`FROM `donar_data` WHERE DKidney='Kidney'";
				btnNewButton_1.setEnabled(false);

			}
			
		});
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		rdbtnNewRadioButton_2.setBounds(211, 84, 105, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Eye");
		rdbtnNewRadioButton_3.setBackground(new Color(255, 222, 173));
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			eye="SELECT `Donar_Name`, `Donae_Age`, `Donar_Address`, `Donar_Email`, `Donar_ConactNumber`, `Donar_Gender`, `DEye`,  `DBlood_Group`, `Ddisease`,`Date_of_FormSubmit` FROM `donar_data` WHERE DEye='Eye'";
			btnNewButton_1.setEnabled(false);

			}
		});
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		rdbtnNewRadioButton_3.setBounds(318, 84, 67, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Blood");
		rdbtnNewRadioButton_4.setBackground(new Color(255, 222, 173));
		buttonGroup.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			blood="SELECT `Donar_Name`, `Donae_Age`, `Donar_Address`, `Donar_Email`, `Donar_ConactNumber`, `Donar_Gender`, `DBlood`,  `DBlood_Group`, `Ddisease`,`Date_of_FormSubmit` FROM `donar_data` WHERE DBlood='Blood'";
			btnNewButton_1.setEnabled(false);

			}
		});
		rdbtnNewRadioButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		rdbtnNewRadioButton_4.setBounds(387, 84, 91, 21);
		contentPane.add(rdbtnNewRadioButton_4);
		
		
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("All Records");
		buttonGroup.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				allrecord="SELECT * FROM `donar_data` WHERE 1";
				
			}
		});
		rdbtnNewRadioButton_5.setBackground(new Color(255, 222, 173));
		rdbtnNewRadioButton_5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		rdbtnNewRadioButton_5.setBounds(480, 77, 167, 39);
		contentPane.add(rdbtnNewRadioButton_5);
	
		
		
		 		
		JButton btnNewButton = new JButton("Apply");
		btnNewButton.setToolTipText("Information about selected organ");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnNewButton.setBounds(968, 74, 140, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(heart.isEmpty()&&liver.isEmpty()&&kidney.isEmpty()&&eye.isEmpty()&&blood.isEmpty()&&allrecord.isEmpty() )
				{
					JOptionPane.showMessageDialog(contentPane,"Select Organ For Donr Data","Conform",JOptionPane.INFORMATION_MESSAGE);

				}else {
				
				String quary = null;
 				try {
 					
				 
							Class.forName("com.mysql.cj.jdbc.Driver");
						 
 					Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/organ_donation","OrgainDonition","OrgainDonition");
					Statement st=com.createStatement();
 					
					if(rdbtnNewRadioButton.isSelected()==true) {
						quary=heart;
						btnNewButton_1.setEnabled(true);

 					}
					if(rdbtnNewRadioButton_1.isSelected()==true) {
						quary=liver;
						btnNewButton_1.setEnabled(true);

					}
					if(rdbtnNewRadioButton_2.isSelected()==true) {
						quary=kidney;
						btnNewButton_1.setEnabled(true);

					}
					if(rdbtnNewRadioButton_3.isSelected()==true) {
						quary=eye;
						btnNewButton_1.setEnabled(true);

					}
					if(rdbtnNewRadioButton_4.isSelected()==true) {
						quary=blood;
						btnNewButton_1.setEnabled(true);

					}
					if(rdbtnNewRadioButton_5.isSelected()==true) {
						quary=allrecord;
						btnNewButton_1.setEnabled(true);

					}
					
					ResultSet set=st.executeQuery(quary);
					
					table_2.setModel(DbUtils.resultSetToTableModel(set));

									
 
				}catch(Exception el) {
					JOptionPane.showMessageDialog(contentPane,"Dtabase is NOT runing Mode","Conform",JOptionPane.INFORMATION_MESSAGE);

					System.out.println(el);}
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 149, 1071, 364);
		contentPane.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setBackground(new Color(152, 251, 152));
		table_2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_2.setToolTipText("Data of Donar ");
		table_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		table_2.setRowHeight(25);
		table_2.setRowSelectionAllowed(true);

		
		table_2.setRowSelectionAllowed(true);
		scrollPane.setViewportView(table_2);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setToolTipText("Delete selected row");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabcont=table_2.getSelectedRow();
				if(-1==tabcont) 
				{
					JOptionPane.showMessageDialog(contentPane,"Select Row For Delete DataBase","Conform",JOptionPane.INFORMATION_MESSAGE);

				
				}
				if(0<tabcont||0==tabcont) {
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 
 			Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/organ_donation","OrgainDonition","OrgainDonition");
			Statement st1=com.createStatement();
		
			
			
 
			namedelet=(String) table_2.getValueAt(tabcont, 0);
			String deletquary;
								
			DefaultTableModel model=(DefaultTableModel) table_2.getModel();
			model.removeRow(tabcont);
			
		
			deletquary="DELETE FROM `donar_data` WHERE `Donar_Name`='"+namedelet+"'";
 
			st1.executeUpdate(deletquary);
			
			
			System.out.println(tabcont+"rrrrr");
			if(0<tabcont||0==tabcont)
			{
			
			JOptionPane.showMessageDialog(contentPane,"Data is Delete From DataBase","Conform",JOptionPane.INFORMATION_MESSAGE);
			}
				}catch(Exception el) {
					JOptionPane.showMessageDialog(contentPane,"Dtabase is NOT runing Mode","Conform",JOptionPane.INFORMATION_MESSAGE);

					System.out.println(el);}
				}
			}
		});
		btnDelete.setForeground(new Color(255, 0, 0));
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBounds(968, 541, 140, 41);
		contentPane.add(btnDelete);
		
		btnNewButton_1.setToolTipText("Full information about selected row");
		btnNewButton_1.setForeground(new Color(0, 0, 205));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabcont=table_2.getSelectedRow();
 				if(tabcont>=0)
				{
				
				 DName=(String) table_2.getValueAt(tabcont, 0);
				 DAge=(String) table_2.getValueAt(tabcont, 1);
				 DAaddress=(String) table_2.getValueAt(tabcont, 2);
				 DEmail=(String) table_2.getValueAt(tabcont, 3);
				 DMO=(String) table_2.getValueAt(tabcont, 4);
				 Dgen=(String) table_2.getValueAt(tabcont, 5);
				
				 if(rdbtnNewRadioButton.isSelected()) {
				 Dhrt=(String) table_2.getValueAt(tabcont, 6);
				 }
				 if(rdbtnNewRadioButton_1.isSelected()) {
				 Dliv=(String) table_2.getValueAt(tabcont, 6);
				 }
				 if(rdbtnNewRadioButton_2.isSelected()) {
				 Dkid=(String) table_2.getValueAt(tabcont, 6);
				 }
				 if(rdbtnNewRadioButton_3.isSelected()) {
				 Deye=(String) table_2.getValueAt(tabcont,6);
				 }
				 if(rdbtnNewRadioButton_4.isSelected()) {
				 Dblod=(String) table_2.getValueAt(tabcont,6);
				 }
				 Dbg=(String) table_2.getValueAt(tabcont,7);
			     DAss=(String) table_2.getValueAt(tabcont,8);
				 Date=(String) table_2.getValueAt(tabcont,9);
					
				if(rdbtnNewRadioButton_5.isSelected()) {
					 Dhrt=(String) table_2.getValueAt(tabcont, 6);
					 Dliv=(String) table_2.getValueAt(tabcont, 7);
					 Dkid=(String) table_2.getValueAt(tabcont, 8);
					 Deye=(String) table_2.getValueAt(tabcont, 9);
					 Dblod=(String) table_2.getValueAt(tabcont, 10);
					
					 Dbg=(String) table_2.getValueAt(tabcont, 11);
					 DAss=(String) table_2.getValueAt(tabcont, 12);
					 Date=(String) table_2.getValueAt(tabcont, 13);
				} 
				
			
				Infomation dialog = new Infomation(DName,DAge,DAaddress,DEmail,DMO,Dgen,Dhrt,Dliv,Dkid,Deye,Dblod,Dbg,DAss,Date);
				Dhrt="";
				Dliv="";
						Dkid="";Deye="";Dblod="";

				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
				
				}else {
					JOptionPane.showMessageDialog(contentPane,"No Selected DataBase","Conform",JOptionPane.INFORMATION_MESSAGE);

				}
		
			}
		});
		btnNewButton_1.setBounds(755, 541, 203, 41);
		contentPane.add(btnNewButton_1);
		
		
		
				
	 
			 
		
		}
}
