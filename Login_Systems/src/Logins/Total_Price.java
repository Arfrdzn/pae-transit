package Logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel; 
import java.text.DecimalFormat;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;



public class Total_Price extends JFrame {
	
	 DecimalFormat priceformatter = new DecimalFormat("#0.00");

	private JPanel contentPane;

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
					Total_Price frame = new Total_Price();
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
	public Total_Price() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total Detail");
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		lblNewLabel.setBounds(153, 80, 217, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblSubTotal = new JLabel("Sub Total :");
		lblSubTotal.setForeground(new Color(178, 34, 34));
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSubTotal.setBounds(79, 128, 91, 13);
		contentPane.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax :");
		lblTax.setForeground(Color.RED);
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTax.setBounds(79, 177, 45, 19);
		contentPane.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setForeground(new Color(165, 42, 42));
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(79, 231, 66, 19);
		contentPane.add(lblTotal);
		
		JTextArea textSubTotal = new JTextArea();
		textSubTotal.setBounds(236, 128, 122, 22);
		contentPane.add(textSubTotal);
		
		JTextArea textTax = new JTextArea();
		textTax.setBounds(236, 177, 122, 22);
		contentPane.add(textTax);
		
		JTextArea textTotal = new JTextArea();
		textTotal.setBounds(236, 231, 122, 22);
		contentPane.add(textTotal);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel.setBounds(54, 115, 377, 155);
		contentPane.add(panel);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setForeground(new Color(205, 92, 92));

		btnTotal.setFont(new Font("Segoe Script", Font.BOLD, 20));
		btnTotal.setBounds(216, 292, 91, 21);
		contentPane.add(btnTotal);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setForeground(new Color(0, 0, 139));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receipt a = new Receipt();
				a.setVisible(true);
				a.setLocationRelativeTo(null);
				a.show();
				dispose();
				
				String CustName = name;
				String email = CustEmail;
				String phonenum = Phonenum;
				double totalPrice = TotalPrice;

				a.display(CustName, email, phonenum, totalPrice);
			}
		});
		btnEnter.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnEnter.setBounds(398, 379, 105, 21);
		contentPane.add(btnEnter);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASFA ADRIANA\\OneDrive\\Pictures\\persons.png"));
		
		lblNewLabel_1.setBounds(4, 10, 139, 97);
		contentPane.add(lblNewLabel_1);
		
				btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnTotal){
          			
          			double TotalTax = TotalPrice * 0.4;
					textSubTotal.setText(priceformatter.format(TotalPrice));
					textTax.setText("0.4");
					textTotal.setText("" + (priceformatter.format(TotalPrice + TotalTax)));
				}
			}
		});
	}
}