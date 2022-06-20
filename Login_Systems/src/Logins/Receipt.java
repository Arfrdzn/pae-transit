package Logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DecimalFormat;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;

public class Receipt extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldMobile;
	private JTextField textFieldTax;
	private JTextField textFieldEmail;
	private JTextField textFieldFees;
	
	DecimalFormat priceformatter = new DecimalFormat("#0.00");
	String name;
	String CustEmail;
	String Phonenum;
	Double TotalPrice;


	/**
	 * Launch the application.
	 */
	
	 public void display(String name, String Email, String Phonenum, double TotalPrice){
		 this.name = name;
		 this.CustEmail = Email;
		 this.Phonenum = Phonenum;
		 this.TotalPrice = TotalPrice;
	 }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1270, 767);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Name = new JLabel("Passengger Name :");
		Name.setForeground(new Color(184, 134, 11));
		Name.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Name.setBounds(20, 134, 231, 31);
		contentPane.add(Name);
		
		JLabel Phone = new JLabel("Mobile Phone :");
		Phone.setForeground(new Color(184, 134, 11));
		Phone.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Phone.setBounds(20, 281, 231, 31);
		contentPane.add(Phone);
		
		textFieldName = new JTextField();
		textFieldName.setEditable(false);
		textFieldName.setColumns(10);
		textFieldName.setBounds(332, 134, 265, 31);
		contentPane.add(textFieldName);
		
		textFieldMobile = new JTextField();
		textFieldMobile.setEditable(false);
		textFieldMobile.setColumns(10);
		textFieldMobile.setBounds(332, 281, 215, 31);
		contentPane.add(textFieldMobile);
		
		textFieldTax = new JTextField();
		textFieldTax.setEditable(false);
		textFieldTax.setColumns(10);
		textFieldTax.setBounds(339, 357, 101, 37);
		contentPane.add(textFieldTax);
		
		JLabel lblNewLabel_3 = new JLabel("RECEIPT TICKET PAE TRANSIT");
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Segoe UI Symbol", Font.BOLD, 30));
		lblNewLabel_3.setBounds(420, 25, 423, 44);
		contentPane.add(lblNewLabel_3);
		
		JTextArea area = new JTextArea();
		area.setForeground(Color.BLACK);
		area.setFont(new Font("Monospaced", Font.BOLD, 13));
		area.setBounds(732, 108, 466, 523);
		contentPane.add(area);
		
		JButton btnNewButton = new JButton("Generate Receipt");
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		btnNewButton.setBounds(20, 557, 284, 44);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textFieldName.setText("");
				textFieldEmail.setText("");
				textFieldMobile.setText("");
				textFieldTax.setText("");
				textFieldFees.setText("");
			}
		});
		btnReset.setForeground(new Color(128, 0, 0));
		btnReset.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		btnReset.setBounds(455, 557, 171, 44);
		contentPane.add(btnReset);
		
		JButton btnNewButton_2 = new JButton("Print Receipt");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					area.print();
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnNewButton_2.setForeground(new Color(75, 0, 130));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(732, 656, 185, 31);
		contentPane.add(btnNewButton_2);
		
		JLabel Email = new JLabel("Email Address :");
		Email.setForeground(new Color(184, 134, 11));
		Email.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Email.setBounds(20, 208, 206, 31);
		contentPane.add(Email);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setEditable(false);
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(332, 208, 265, 31);
		contentPane.add(textFieldEmail);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setForeground(new Color(184, 134, 11));
		panel.setBounds(10, 109, 638, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax :");
		lblTax.setForeground(new Color(184, 134, 11));
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTax.setBounds(10, 252, 63, 31);
		panel.add(lblTax);
		
		JLabel Fees = new JLabel("Fees Amount :");
		Fees.setBounds(10, 327, 206, 31);
		panel.add(Fees);
		Fees.setForeground(new Color(184, 134, 11));
		Fees.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		textFieldFees = new JTextField();
		textFieldFees.setEditable(false);
		textFieldFees.setBounds(330, 331, 102, 36);
		panel.add(textFieldFees);
		textFieldFees.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(244, 108, 60, 90);
		contentPane.add(label);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO add your handling code here:
				
				textFieldName.setText(name);
				textFieldEmail.setText(CustEmail);
				textFieldMobile.setText(Phonenum);
				textFieldTax.setText("0.4");
				textFieldFees.setText(priceformatter.format(TotalPrice*0.4));
				
				area.setText("**********************************************************************\n");
				area.setText(area.getText()+"*                  Fees Receipt System                   *\n");
				area.setText(area.getText()+"***********************************************************\n");
				
				Date obj = new Date(0);
				
				String date = obj.toString();
				
				area.setText(area.getText()+"\n"+date+"\n\n");
				area.setText(area.getText()+"Passenger Name : "+textFieldName.getText()+"\n");
				area.setText(area.getText()+"Email Address : "+textFieldEmail.getText()+"\n");
				area.setText(area.getText()+"Phone_Number : "+textFieldMobile.getText()+"\n");
				area.setText(area.getText()+"Fees Amount : "+textFieldFees.getText()+"\n");
				area.setText(area.getText()+"\n                       signature");
				
				
			}
		});
	}
}

