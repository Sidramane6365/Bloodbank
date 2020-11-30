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
import java.awt.event.ActionEvent;

public class DonorDelete extends JFrame {

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
					DonorDelete frame = new DonorDelete();
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
	public DonorDelete() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteDonor = new JLabel("Delete Donor");
		lblDeleteDonor.setFont(new Font("Algerian", Font.BOLD, 36));
		lblDeleteDonor.setBounds(63, 6, 364, 36);
		contentPane.add(lblDeleteDonor);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 53, 416, 20);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Donor ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 75, 86, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(146, 76, 103, 20);
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
			    		textField_1.setText(rs1.getString(2));
			    		textField_2.setText(rs1.getString(3));
			    		textField_3.setText(rs1.getString(4));
			    		textField_4.setText(rs1.getString(5));
			    		textField_5.setText(rs1.getString(6));
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
		btnNewButton.setBounds(301, 73, 118, 23);
		contentPane.add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 111, 416, 20);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Donor Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(50, 142, 87, 27);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(194, 149, 150, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(194, 183, 150, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(50, 180, 87, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Weight");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(50, 216, 87, 31);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(194, 221, 150, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(194, 257, 150, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_7 = new JLabel("Age");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(50, 254, 87, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Date");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(50, 293, 87, 27);
		contentPane.add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(194, 296, 150, 20);
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
		btnNewButton_1_1.setBounds(280, 347, 103, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con=ConnectionProvider.getCon();
				int action=JOptionPane.showConfirmDialog(null, "Do you really want to Delete","Delete",JOptionPane.YES_NO_OPTION);
				if(action==0)
				{
					try
					{
						
						String s1="delete from bank where id='"+textField.getText()+"'";
						PreparedStatement ps=con.prepareStatement(s1);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Deleted Successfully");
						setVisible(false);
						JFrame t1 = new login.DonorDelete(); 
						t1.setVisible(true);
						
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
				
			}
		});
		btnDelete.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\delete.png"));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(50, 347, 113, 23);
		contentPane.add(btnDelete);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\all page background image.png"));
		lblNewLabel.setBounds(0, 0, 437, 398);
		contentPane.add(lblNewLabel);
	}

}
