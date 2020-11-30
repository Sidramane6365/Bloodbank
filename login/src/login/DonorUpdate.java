package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class DonorUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonorUpdate frame = new DonorUpdate();
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
	public DonorUpdate() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE DONOR DETAILS");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 36));
		lblNewLabel.setBounds(42, 11, 437, 36);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(13, 56, 466, 20);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Donor ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(53, 77, 86, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(170, 74, 103, 20);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=ConnectionProvider.getCon();
				try
				{
					int id;
					id=Integer.parseInt(textField.getText());
					
					String s1="select * from bank where id='"+id+"'";
					
			    	PreparedStatement p1=con.prepareStatement(s1);
			    
			    	ResultSet rs1=p1.executeQuery();
			    	while( rs1.next())
			    	{
			    		textField_5.setText(rs1.getString(2));
			    		textField_4.setText(rs1.getString(3));
			    		textField_3.setText(rs1.getString(4));
			    		textField_2.setText(rs1.getString(5));
			    		textField_1.setText(rs1.getString(6));
			    	}
				}
				catch(Exception ex)
				{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Something went wrong");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\search1.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(300, 73, 118, 23);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(13, 107, 466, 20);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Donor Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(53, 138, 87, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(53, 176, 87, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Weight");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(53, 212, 87, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Age");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(53, 250, 87, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Date");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(53, 289, 87, 27);
		contentPane.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(197, 292, 150, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(197, 253, 150, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(197, 217, 150, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(197, 179, 150, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(197, 145, 150, 20);
		contentPane.add(textField_5);
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				JFrame t1 = new login.Home(); 
				t1.setVisible(true);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Exit application.png"));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(283, 350, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=ConnectionProvider.getCon();
				try
				{
				

				int id,age,wt;
				String name,bg;

				id=Integer.parseInt(textField.getText());
				name=textField_5.getText();
				bg=textField_4.getText();
				age=Integer.parseInt(textField_3.getText());
				wt=Integer.parseInt(textField_2.getText());
				String date=textField_1.getText();

			
				String s1="update bank set name='"+textField_5.getText()+"' , bldgroup='"+
						textField_4.getText()+"' ,wt='"+textField_3.getText()+"' , age='"+textField_2.getText()
						+"',ddate='"+textField_1.getText()+"' where id='"+textField.getText()+"' ";
				PreparedStatement ps1=con.prepareStatement(s1);
				
				ps1.executeUpdate();


				JOptionPane.showMessageDialog(null, "Data updated.....");
				setVisible(false);
				JFrame t1 = new login.DonorUpdate(); 
				t1.setVisible(true);
				

				}
				catch(Exception ex)
				{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Duplicate ID");
				}
			
				
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Update details.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(53, 350, 113, 23);
		contentPane.add(btnUpdate);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\all page background image.png"));
		lblNewLabel_2.setBounds(0, 0, 489, 396);
		contentPane.add(lblNewLabel_2);
	}

}
