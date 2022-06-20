package Logins;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import com.github.lgooddatepicker.components.TimePicker;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;



public class Booking_Station extends JFrame{
	
	static DecimalFormat priceformatter = new DecimalFormat("#0.00");
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtClassOut;
	private JTextField txtFromOut;
	private JTextField txtPriceOut;
	private JTextField txtTimeOut;
	private JTextField txtDateOut;
	private JTextField txtTypeOut;
	private JTextField txtName;
	private JLabel lblFrom;
	private JTextField lblName;
	private JTextField txtNameOut;
	private JTextField txtNoOut;
	private JTextField txtToOut;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textEmail;
	private JTextField textMobile;
	private JTextField txtEmailOut;
	private JTextField txtMobileOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking_Station window = new Booking_Station();
					window. setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the  
	 */
	     public Booking_Station () {
	     setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		 getContentPane().setBackground(new Color(0, 255, 0));
		 setBounds(100, 100, 1522, 743);
		 setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		 getContentPane().setLayout(null);
		
		JLabel lblNewLabel;
		lblFrom = new JLabel("From* :");
		lblFrom.setForeground(new Color(85, 107, 47));
		lblFrom.setFont(new Font("Stencil", Font.BOLD, 23));
		lblFrom.setBounds(26, 144, 215, 24);
		 getContentPane().add(lblFrom);
		
		JLabel lblDate = new JLabel("Journey Date* :");
		lblDate.setForeground(new Color(85, 107, 47));
		lblDate.setFont(new Font("Stencil", Font.BOLD, 23));
		lblDate.setBounds(24, 243, 230, 31);
		 getContentPane().add(lblDate);
		
		JLabel lblType = new JLabel("Ticket Type* :");
		lblType.setForeground(new Color(85, 107, 47));
		lblType.setFont(new Font("Stencil", Font.BOLD, 25));
		lblType.setBounds(10, 362, 215, 39);
		 getContentPane().add(lblType);
		
		JLabel lblClass = new JLabel("Class* :");
		lblClass.setForeground(new Color(85, 107, 47));
		lblClass.setFont(new Font("Stencil", Font.BOLD, 25));
		lblClass.setBounds(10, 435, 139, 24);
		 getContentPane().add(lblClass);
		
		JLabel lblPassengers = new JLabel("No. Of Passengers* :");
		lblPassengers.setForeground(new Color(85, 107, 47));
		lblPassengers.setFont(new Font("Stencil", Font.BOLD, 25));
		lblPassengers.setBounds(10, 493, 279, 39);
		 getContentPane().add(lblPassengers);
		
		JComboBox comboBoxFrom = new JComboBox();
		comboBoxFrom.setModel(new DefaultComboBoxModel(new String[] {"None", "Bandar Tasik Selatan ERL station", "KL Sentral ERL station", "KLIA ERL station", "klia2 ERL station", "Putrajaya & Cyberjaya ERL station", "Salak Tinggi ERL station"}));
		comboBoxFrom.setBounds(340, 145, 259, 24);
		 getContentPane().add(comboBoxFrom);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 342, 729, 2);
		 getContentPane().add(separator);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single");
		buttonGroup.add(rdbtnSingle);
		rdbtnSingle.setForeground(new Color(50, 205, 50));
		rdbtnSingle.setFont(new Font("Tahoma", Font.ITALIC, 20));
		rdbtnSingle.setBounds(340, 364, 103, 31);
		 getContentPane().add(rdbtnSingle);
		
		JRadioButton rdbtnReturn = new JRadioButton("Return");
		buttonGroup.add(rdbtnReturn);
		rdbtnReturn.setForeground(new Color(50, 205, 50));
		rdbtnReturn.setFont(new Font("Tahoma", Font.ITALIC, 20));
		rdbtnReturn.setBounds(472, 364, 103, 31);
		 getContentPane().add(rdbtnReturn);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		buttonGroup_1.add(rdbtnStandard);
		rdbtnStandard.setForeground(new Color(0, 0, 0));
		rdbtnStandard.setFont(new Font("Tahoma", Font.ITALIC, 20));
		rdbtnStandard.setBounds(498, 433, 139, 24);
		getContentPane().add(rdbtnStandard);	
		
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		buttonGroup_1.add(rdbtnEconomy);
		rdbtnEconomy.setForeground(new Color(0, 0, 0));
		rdbtnEconomy.setFont(new Font("Tahoma", Font.ITALIC, 20));
		rdbtnEconomy.setBounds(339, 436, 139, 21);
		 getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		buttonGroup_1.add(rdbtnFirstClass);
		rdbtnFirstClass.setForeground(new Color(0, 0, 0));
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.ITALIC, 20));
		rdbtnFirstClass.setBounds(656, 431, 131, 24);
		 getContentPane().add(rdbtnFirstClass);
		 
		 txtName = new JTextField();
		 txtName.setBounds(340, 93, 257, 27);
		 getContentPane().add(txtName);
		 txtName.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		
		btnNext.setForeground(new Color(0, 0, 139));
		btnNext.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		btnNext.setBounds(1400, 607, 85, 31);
		 getContentPane().add(btnNext);
		
		JLabel lblNewLabel_6 = new JLabel("REGISTER STATION");
		lblNewLabel_6.setForeground(new Color(255, 255, 0));
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblNewLabel_6.setBounds(174, 10, 344, 39);
		 getContentPane().add(lblNewLabel_6);
		
	    lblNewLabel = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/train.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image2));
	    lblNewLabel.setBounds(616, 10, 136, 128);
		 getContentPane().add(lblNewLabel);
		 Image image4 = new ImageIcon(this.getClass().getResource("/LOGIN.PNG")).getImage();
		 
		 JLabel lbllTo = new JLabel("To* :");
		 lbllTo.setForeground(new Color(85, 107, 47));
		 lbllTo.setFont(new Font("Stencil", Font.BOLD, 23));
		 lbllTo.setBounds(26, 186, 103, 31);
		 getContentPane().add(lbllTo);
		 
		 JComboBox comboBoxTo = new JComboBox();
		 comboBoxTo.setModel(new DefaultComboBoxModel(new String[] {"None", "Bandar Tasik Selatan ERL station", "KL Sentral ERL station", "KLIA ERL station", "klia2 ERL station", "Putrajaya & Cyberjaya ERL station", "Salak Tinggi ERL station"}));
		 comboBoxTo.setBounds(340, 188, 259, 28);
		 getContentPane().add(comboBoxTo);
		 
		 JPanel panel_1 = new JPanel();
		 panel_1.setBounds(806, 32, 692, 565);
		 getContentPane().add(panel_1);
		 panel_1.setLayout(null);
		 
		 JLabel lblNewLabel_10 = new JLabel("Class");
		 lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_10.setBounds(573, 100, 65, 25);
		 panel_1.add(lblNewLabel_10);
		 
		 JPanel panel = new JPanel();
		 panel.setBounds(159, 10, 452, 59);
		 panel_1.add(panel);
		 panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		 panel.setLayout(null);
		 
		 JLabel lblNewLabel_9 = new JLabel("Booking Details");
		 lblNewLabel_9.setForeground(new Color(139, 0, 0));
		 lblNewLabel_9.setBounds(91, 10, 277, 37);
		 lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		 panel.add(lblNewLabel_9);
		 
		 txtClassOut = new JTextField();
		 txtClassOut.setBounds(514, 138, 157, 25);
		 panel_1.add(txtClassOut);
		 txtClassOut.setColumns(10);
		 
		 JLabel lblNewLabel_11 = new JLabel("From :");
		 lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_11.setBounds(38, 216, 65, 19);
		 panel_1.add(lblNewLabel_11);
		 
		 txtFromOut = new JTextField();
		 txtFromOut.setBounds(173, 215, 226, 30);
		 panel_1.add(txtFromOut);
		 txtFromOut.setColumns(10);
		 
		 JLabel lblNewLabel_13 = new JLabel("Price");
		 lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_13.setBounds(59, 404, 65, 25);
		 panel_1.add(lblNewLabel_13);
		 
		 txtPriceOut = new JTextField();
		 txtPriceOut.setBounds(33, 465, 107, 25);
		 panel_1.add(txtPriceOut);
		 txtPriceOut.setColumns(10);
		 
		 JLabel lblNewLabel_14 = new JLabel("Time");
		 lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_14.setBounds(234, 404, 65, 25);
		 panel_1.add(lblNewLabel_14);
		 
		 JLabel lblNewLabel_15 = new JLabel("Date");
		 lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_15.setBounds(385, 404, 65, 25);
		 panel_1.add(lblNewLabel_15);
		 
		 txtTimeOut = new JTextField();
		 txtTimeOut.setBounds(217, 465, 96, 25);
		 panel_1.add(txtTimeOut);
		 txtTimeOut.setColumns(10);
		 
		 txtDateOut = new JTextField();
		 txtDateOut.setBounds(368, 465, 96, 25);
		 panel_1.add(txtDateOut);
		 txtDateOut.setColumns(10);
		 
		 JLabel lblNewLabel_16 = new JLabel("Type");
		 lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_16.setBounds(573, 184, 65, 30);
		 panel_1.add(lblNewLabel_16);
		 
		 txtTypeOut = new JTextField();
		 txtTypeOut.setBounds(514, 216, 157, 25);
		 panel_1.add(txtTypeOut);
		 txtTypeOut.setColumns(10);
		 
		 JLabel label = new JLabel("");
		 label.setBounds(0, 0, 185, 101);
		 panel_1.add(label);
		 label.setIcon(new ImageIcon (image4));
		 
		 JLabel lblNameOut = new JLabel("Name :");
		 lblNameOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNameOut.setBounds(38, 148, 86, 25);
		 panel_1.add(lblNameOut);
		 
		 txtNameOut = new JTextField();
		 txtNameOut.setBounds(173, 148, 226, 32);
		 panel_1.add(txtNameOut);
		 txtNameOut.setColumns(10);
		 
		 JLabel lblNoPassengers = new JLabel("Passengers :");
		 lblNoPassengers.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNoPassengers.setBounds(33, 330, 127, 25);
		 panel_1.add(lblNoPassengers);
		 
		 txtNoOut = new JTextField();
		 txtNoOut.setBounds(173, 337, 55, 25);
		 panel_1.add(txtNoOut);
		 txtNoOut.setColumns(10);
		 
		 JLabel lblNewLabel_1 = new JLabel("To :");
		 lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_1.setBounds(38, 274, 65, 19);
		 panel_1.add(lblNewLabel_1);
		 
		 txtToOut = new JTextField();
		 txtToOut.setBounds(173, 279, 226, 24);
		 panel_1.add(txtToOut);
		 txtToOut.setColumns(10);
		 
		 txtEmailOut = new JTextField();
		 txtEmailOut.setBounds(470, 527, 199, 23);
		 panel_1.add(txtEmailOut);
		 txtEmailOut.setColumns(10);
		 
		 txtMobileOut = new JTextField();
		 txtMobileOut.setBounds(514, 312, 157, 25);
		 panel_1.add(txtMobileOut);
		 txtMobileOut.setColumns(10);
		 
		 JLabel lblNewLabel_7 = new JLabel("Mobile Phone");
		 lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_7.setBounds(525, 274, 157, 25);
		 panel_1.add(lblNewLabel_7);
		 
		 JLabel lblNewLabel_8 = new JLabel("Email");
		 lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblNewLabel_8.setBounds(385, 527, 75, 19);
		 panel_1.add(lblNewLabel_8);
		 
		 JLabel lblName = new JLabel("Name*:");
		 lblName.setForeground(new Color(85, 107, 47));
		 lblName.setFont(new Font("Stencil", Font.BOLD, 23));
		 lblName.setBounds(27, 93, 103, 31);
		 getContentPane().add(lblName);
		 
		 JButton btnTotal = new JButton("Total");
		 btnTotal.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 23));
		 btnTotal.setBounds(816, 614, 85, 21);
		 getContentPane().add(btnTotal);
		 
		 JLabel lblTime = new JLabel("Time* :");
		 lblTime.setForeground(new Color(85, 107, 47));
		 lblTime.setFont(new Font("Stencil", Font.BOLD, 25));
		 lblTime.setBounds(26, 296, 188, 36);
		 getContentPane().add(lblTime);
		 
		 TimePicker timePicker = new TimePicker();
		 timePicker.setBounds(339, 296, 148, 24);
		 getContentPane().add(timePicker);
		 
		 JDateChooser dateChooser = new JDateChooser();
		 dateChooser.setBounds(340, 250, 147, 24);
		 getContentPane().add(dateChooser);
		 
		 JSpinner txtAdult = new JSpinner();
		 txtAdult.setBounds(432, 505, 85, 20);
		 getContentPane().add(txtAdult);
		 
		 JSpinner txtChild = new JSpinner();
		 txtChild.setBounds(647, 505, 85, 20);
		 getContentPane().add(txtChild);
		 
		 JLabel lblNewLabel_2 = new JLabel("Adult");
		 lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 20));
		 lblNewLabel_2.setBounds(340, 501, 100, 24);
		 getContentPane().add(lblNewLabel_2);
		 
		 JLabel lblNewLabel_3 = new JLabel("Child");
		 lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD, 20));
		 lblNewLabel_3.setBounds(552, 501, 85, 24);
		 getContentPane().add(lblNewLabel_3);
		 
		 JLabel lblNewLabel_4 = new JLabel("Email Address :");
		 lblNewLabel_4.setForeground(new Color(199, 21, 133));
		 lblNewLabel_4.setFont(new Font("Modern No. 20", Font.BOLD, 23));
		 lblNewLabel_4.setBounds(37, 573, 215, 24);
		 getContentPane().add(lblNewLabel_4);
		 
		 textEmail = new JTextField();
		 textEmail.setBounds(37, 619, 188, 19);
		 getContentPane().add(textEmail);
		 textEmail.setColumns(10);
		 
		 JLabel lblNewLabel_5 = new JLabel("Mobile Phone :");
		 lblNewLabel_5.setForeground(new Color(255, 20, 147));
		 lblNewLabel_5.setFont(new Font("Modern No. 20", Font.BOLD, 23));
		 lblNewLabel_5.setBounds(316, 573, 197, 24);
		 getContentPane().add(lblNewLabel_5);
		 
		 textMobile = new JTextField();
		 textMobile.setBounds(316, 619, 171, 19);
		 getContentPane().add(textMobile);
		 
		 btnTotal.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
		 		if(e.getSource()==btnTotal) {
		 		String name = txtName.getText();
		 		int NumChildren = (int) txtChild.getValue();
		 		int NumAdult = (int) txtAdult.getValue();
		 		String email = textEmail.getText();
		 		String Phonenum = textMobile.getText();
		 		double FromPrice = 0.0;
		 		double Class = 0.00;
		 		double Category = 0.00;
		 		double ToPrice = 0.0;
		 		
		 		int Passenger = NumChildren + NumAdult;
		 		
		 		if(comboBoxFrom.getSelectedItem().equals("Bandar Tasik Selatan ERL station")) {
					 FromPrice = 12.4 ;
		 			txtFromOut.setText("Bandar Tasik Selatan ERL station");
				}else if(comboBoxFrom.getSelectedItem().equals("KL Sentral ERL station")) {
					FromPrice = 9.4;
		 			txtFromOut.setText("KL Sentral ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("KLIA ERL station")) {
					 FromPrice = 10.5;
		 			txtFromOut.setText("KLIA ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("klia2 ERL station")) {
					 FromPrice = 10.1;
		 			txtFromOut.setText("klia2 ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("Putrajaya & Cyberjaya ERL station")) {
					 FromPrice = 7.5;
		 			txtFromOut.setText("Putrajaya & Cyberjaya ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("Salak Tinggi ERL station")) {
					 FromPrice =6.9;
		 			txtFromOut.setText("Salak Tinggi ERL station");
		 		}
		 		
		 		
		 	    if(comboBoxTo.getSelectedItem().equals("Bandar Tasik Selatan ERL station")) {
					ToPrice = 5.7;
		 			txtToOut.setText("Bandar Tasik Selatan ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("KL Sentral ERL station")) {
					 ToPrice = 4.5;
		 			txtToOut.setText("KL Sentral ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("KLIA ERL station")) {
					 ToPrice = 6.4;
		 			txtToOut.setText("KLIA ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("klia2 ERL station")) {
				 FromPrice = 8.3;
		 		txtFromOut.setText("klia2 ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("Putrajaya & Cyberjaya ERL station")) {
					 ToPrice = 5.9;
		 			txtToOut.setText("Putrajaya & Cyberjaya ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("Salak Tinggi ERL station")) {
					 ToPrice = 4.7;
		 		    txtToOut.setText("Salak Tinggi ERL station");
		 		}
		 	 	if(rdbtnStandard.isSelected() ){
			 	txtClassOut.setText("Standard");
				 }else if(rdbtnEconomy.isSelected()){
					 Class = 5.3;
					 txtClassOut.setText("Economy");
				 }else if(rdbtnFirstClass.isSelected()){
					 Class = 10.9;
					 txtClassOut.setText("First Class");			 
				 }
				 
		 		double price = FromPrice + ToPrice * Passenger;
		 		
				 if(rdbtnSingle.isSelected()){
					 txtTypeOut.setText("Single");
				 }else if(rdbtnReturn.isSelected()){
					 Category = 2.0;
					 txtTypeOut.setText("Return");
				 }	
				
			 	double TotalPrice = price + Class * Category;
			 		

		 	    SimpleDateFormat Date = new SimpleDateFormat("E,dd-MM-yyyy");
		 	        txtDateOut.setText(""+ Date.format(dateChooser.getDate()));
		 	        txtNameOut.setText(name);	 
					txtTimeOut.setText("" + timePicker.getTime());
					txtNoOut.setText("" + Passenger);
					txtEmailOut.setText("" + email);
					txtMobileOut.setText("" + Phonenum);
					txtPriceOut.setText("" + priceformatter.format(TotalPrice));
				}

				
				}
			});
		 
		 textMobile.setColumns(10);
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()== btnNext){
				 		int NumChildren = (int) txtChild.getValue();
				 		int NumAdult = (int) txtAdult.getValue();
						double totalPrice = 0.00;
				 		double FromPrice = 0.00;
				 		double ToPrice = 0.00;
				 		double Class = 0.00;
				 		double Category = 0.00;
				 		
				 		int Passenger = NumChildren + NumAdult;

				 			 		if(comboBoxFrom.getSelectedItem().equals("Bandar Tasik Selatan ERL station")) {
					 FromPrice = 12.4 ;
		 			txtFromOut.setText("Bandar Tasik Selatan ERL station");
				}else if(comboBoxFrom.getSelectedItem().equals("KL Sentral ERL station")) {
					FromPrice = 9.4;
		 			txtFromOut.setText("KL Sentral ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("KLIA ERL station")) {
					 FromPrice = 10.5;
		 			txtFromOut.setText("KLIA ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("klia2 ERL station")) {
					 FromPrice = 10.1;
		 			txtFromOut.setText("klia2 ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("Putrajaya & Cyberjaya ERL station")) {
					 FromPrice = 7.5;
		 			txtFromOut.setText("Putrajaya & Cyberjaya ERL station");
		 		}else if(comboBoxFrom.getSelectedItem().equals("Salak Tinggi ERL station")) {
					 FromPrice =6.9;
		 			txtFromOut.setText("Salak Tinggi ERL station");
		 		}
		 		
		 		
		 	    if(comboBoxTo.getSelectedItem().equals("Bandar Tasik Selatan ERL station")) {
					ToPrice = 5.7;
		 			txtToOut.setText("Bandar Tasik Selatan ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("KL Sentral ERL station")) {
					 ToPrice = 4.5;
		 			txtToOut.setText("KL Sentral ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("KLIA ERL station")) {
					 ToPrice = 6.4;
		 			txtToOut.setText("KLIA ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("klia2 ERL station")) {
				 FromPrice = 8.3;
		 		txtFromOut.setText("klia2 ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("Putrajaya & Cyberjaya ERL station")) {
					 ToPrice = 5.9;
		 			txtToOut.setText("Putrajaya & Cyberjaya ERL station");
		 		}else if(comboBoxTo.getSelectedItem().equals("Salak Tinggi ERL station")) {
					 ToPrice = 4.7;
		 		    txtToOut.setText("Salak Tinggi ERL station");
		 		}
				 		
				 	 	if(rdbtnStandard.isSelected() ){
					 	txtClassOut.setText("Standard");
						 }else if(rdbtnEconomy.isSelected()){
							 Class = 5.3;
							 txtClassOut.setText("Economy");
						 }else if(rdbtnFirstClass.isSelected()){
							 Class = 10.9;
							 txtClassOut.setText("First Class");			 
						 }
						 
						 if(rdbtnSingle.isSelected()){
							 txtTypeOut.setText("Single");
						 }else if(rdbtnReturn.isSelected()){
							 Category = 2.0;
							 txtTypeOut.setText("Return");
						 }	
						
						 
						Total_Price  a = new Total_Price();
						
						a.setVisible(true);
						a.setLocationRelativeTo(null);
						a.show();
						dispose();
						
						String CustName = txtName.getText();
						String email = textEmail.getText();
						String Phonenum = textMobile.getText();

				 		double price = FromPrice + ToPrice * Passenger;
					 	double TotalPrice = price + Class * Category;

						a.display(CustName, email, Phonenum, TotalPrice);
						        }
				}
				});

	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}