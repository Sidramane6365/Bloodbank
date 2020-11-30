package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

import project.ConnectionProvider;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

public class AddDonor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddDonor frame = new AddDonor();
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
	public AddDonor() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 413);
		contentPane = new JPanel();
		
		contentPane.setLocation(new Point(340, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add New Donor");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 36));
		lblNewLabel.setBounds(82, 0, 340, 70);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 62, 415, 20);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Donor ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 98, 87, 27);
		contentPane.add(lblNewLabel_1);
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("Donor Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(35, 136, 87, 27);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setColumns(10);
		textField.setBounds(179, 141, 150, 20);
		contentPane.add(textField);
		
		JLabel wtlbl = new JLabel("");
		wtlbl.setForeground(Color.RED);
		wtlbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		wtlbl.setBounds(339, 219, 170, 20);
		contentPane.add(wtlbl);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(Integer.parseInt(textField_2.getText())<50)
				{
					wtlbl.setText("Minimum wt should be 50");
				}
				else
				{
					wtlbl.setText(null);
				}
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(179, 219, 150, 20);
		contentPane.add(textField_2);
		
		JLabel agelbl = new JLabel("");
		agelbl.setForeground(Color.RED);
		agelbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		agelbl.setBounds(339, 259, 170, 45);
		contentPane.add(agelbl);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(Integer.parseInt(textField_3.getText())<18 || Integer.parseInt(textField_3.getText())>65 )
				{
					agelbl.setText("Age should be in 18 and 65");
				}
				else
				{
					agelbl.setText(null);
				}
			}
		});
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(179, 259, 150, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_7 = new JLabel("Age");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(35, 254, 87, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("Weight");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(35, 212, 87, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(35, 174, 87, 27);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+","B-","AB+","AB-","O+","O-"}));
		comboBox.setBounds(179, 178, 150, 22);
		contentPane.add(comboBox);
		
		String s = (String)comboBox.getSelectedItem();
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con=ConnectionProvider.getCon();
				try
				{
				if(textField.getText()!="" && s!="" && textField_2.getText()!="" && textField_3.getText()!="" && textField_5.getText()!="" )
				{
				LocalDate myObj = LocalDate.now();
				String date=myObj.toString();

				int id,age,wt;
				String name,bg;

				id=Integer.parseInt(textField_5.getText());
				name=textField.getText();
				bg=s;
				age=Integer.parseInt(textField_3.getText());
				wt=Integer.parseInt(textField_2.getText());
				

				String s1="insert into bank values(?,?,?,?,?,?)";
				PreparedStatement ps1=con.prepareStatement(s1);
				ps1.setInt(1, id);
				ps1.setString(2,name);
				ps1.setString(3, bg);
				ps1.setInt(4,wt);
				ps1.setInt(5,age);
				ps1.setString(6,date);
				ps1.executeUpdate();


				JOptionPane.showMessageDialog(null, "Submitted...Thank you.");
				setVisible(false);
				JFrame t1 = new login.AddDonor(); 
				t1.setVisible(true);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "Sorry...Empty Fields not Allowed..");
				}

				}
				catch(Exception ex)
				{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Duplicate ID");
				}

				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\save.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(56, 372, 102, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame t1 = new login.Home(); 
				t1.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Exit application.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(269, 372, 102, 23);
		contentPane.add(btnNewButton_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(179, 103, 150, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\all page background image.png"));
		lblNewLabel_2.setBounds(0, 0, 516, 413);
		contentPane.add(lblNewLabel_2);
		
	
		
		
		
		
	}
}
