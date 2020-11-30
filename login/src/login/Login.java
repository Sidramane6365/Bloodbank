package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(307, 133, 87, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(307, 193, 87, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 235, 205));
		textArea.setBounds(427, 137, 138, 24);
		contentPane.add(textArea);
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\login.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String password=passwordField.getText();
				String username=textArea.getText();
				
				if(password.contains("abc") && username.contains("abc"))
				{
					//
					JOptionPane.showMessageDialog(null,"You Succesfully logined");
					setVisible(false);
					JFrame t1 = new login.Home(); 
					t1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid login details","Login Error",
							JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					textArea.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(272, 269, 111, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Exit application.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSytem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSytem, "Confirm if you want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(427, 269, 104, 29);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("password");
		passwordField.setBackground(new Color(255, 235, 205));
		passwordField.setBounds(427, 195, 138, 24);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\login background.png"));
		lblNewLabel.setBounds(0, 0, 589, 370);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
