import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class QRCode extends JFrame {
	String qrCodeData="",Mobile="",filePath;
	private JPanel contentPane;

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
	 * @param dMO 
	 */
	public QRCode(String dMO) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				}
		});
 		Mobile=dMO;
 		setBounds(800, 300, 373, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
 
		
		try {
             qrCodeData = dMO;
 
            filePath = "chillyfacts"+dMO+"+.png";
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                new String(qrCodeData.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                .lastIndexOf('.') + 1), new File(filePath));
             
			Mobile="";
			dMO="";
            
        } catch (Exception e) {
            System.err.println(e);
        }
	 
		
		JLabel label = new JLabel("",new ImageIcon(filePath),JLabel.CENTER);
		label.setBackground(new Color(255, 255, 224));
		label.setBounds(71, 134, 212, 166);
		contentPane.add(label);
		
		File file =new File(filePath);
			 if(file.exists()) {
				file.delete();
			 }


		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
  			 setVisible(false);
  			 
  			 }
  			 
			
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnBack.setBounds(230, 310, 107, 32);
		contentPane.add(btnBack);
		
		JLabel lblScanCodeFor = new JLabel("Scan Q.R.Code For Call");
		lblScanCodeFor.setForeground(new Color(165, 42, 42));
		lblScanCodeFor.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		lblScanCodeFor.setBounds(10, 10, 339, 38);
		contentPane.add(lblScanCodeFor);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\eclipse-workspace\\Orgen_Donor2\\icons8-down-arrow-52.png"));
		label_1.setBounds(147, 65, 67, 59);
		contentPane.add(label_1);
	}
}
