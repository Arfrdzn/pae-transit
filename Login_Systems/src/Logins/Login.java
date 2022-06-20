package Logins;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.awt.print.Book;
import java.lang.ProcessHandle.Info;
import java.awt.*;
import javax.swing.*;




public class Login extends JFrame {
	protected static final String J0ptionPane = null;
	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPanel getContentPane;
	private void systemExit()
	{
		WindowEvent WinClosesing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
	}
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
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
	 * Initialize the contents of the frame.
	 */
	public Login() {
		getContentPane=new JPanel();
		getContentPane.setBackground(new Color(124, 252, 0));
		setBounds(100, 100, 618, 412);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(getContentPane);
		getContentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon (img));
		label.setBounds(10, 10, 273, 112);
		getContentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
		lblNewLabel.setBounds(245, 37, 142, 51);
		getContentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(new Color(255, 255, 255));
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblUsername.setBounds(106, 151, 164, 38);
		getContentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPassword.setBounds(106, 226, 164, 31);
		getContentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtUsername.setBounds(311, 157, 183, 31);
		getContentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtPassword.setBounds(311, 226, 183, 31);
		getContentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Booking_Station a = new Booking_Station();
				String Username = txtUsername.getText();
				String Password = txtPassword.getText();
				
				if(Username.contains("Asfa")&& (Password.contains("123")))
				{
					txtUsername.setText(null);
					txtPassword.setText(null);
					systemExit();
					Booking_Station Info = new Booking_Station ();
					Info.setVisible(true);
					Info.show();
				    dispose();
				    }
				    else
				    {
												JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
												txtUsername.setText(null);
												txtPassword.setText(null);
					}

			}
			
		});
		btnLogin.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
		btnLogin.setForeground(new Color(0, 255, 0));
		btnLogin.setBounds(44, 315, 131, 38);
		getContentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(238, 315, 131, 38);
		getContentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(220, 20, 60));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			
			}
				
				
		});
		btnExit.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
		btnExit.setBounds(439, 315, 117, 38);
		getContentPane.add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 288, 527, 2);
		getContentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 120, 527, 2);
		getContentPane.add(separator_1);
		
		JLabel lblPaeTransit = new JLabel("PAE ");
		lblPaeTransit.setForeground(Color.RED);
		lblPaeTransit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		lblPaeTransit.setBounds(451, -3, 53, 57);
		getContentPane.add(lblPaeTransit);
		
		JLabel lblTransit = new JLabel("TRANSIT");
		lblTransit.setForeground(new Color(128, 0, 0));
		lblTransit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		lblTransit.setBounds(498, 10, 96, 31);
		getContentPane.add(lblTransit);{
		
	
	}
	
	}
}