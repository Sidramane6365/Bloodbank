package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import project.ConnectionProvider;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StockDet extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockDet frame = new StockDet();
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
	public StockDet() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stock (Details)");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 30));
		lblNewLabel.setBounds(105, 11, 317, 48);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 70, 438, 161);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Donor Name","Blood Group", "Weight","Age","Date"}, 0);
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame t1 = new login.Home(); 
				t1.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Exit application.png"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(321, 255, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Load Data");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Dec.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=ConnectionProvider.getCon();
				try
				{
					String sql="SELECT * FROM bank";
					PreparedStatement p1=con.prepareStatement(sql);
					ResultSet rs = p1.executeQuery();
					while(rs.next())
					{
					    String a = rs.getString("id");
					    String b = rs.getString("name");
					    String c = rs.getString("bldgroup");
					    String d = rs.getString("wt");
					    String f = rs.getString("age");
					    String g = rs.getString("ddate");
					    model.addRow(new Object[]{a,b,c,d,f,g});
					}
					table.setModel(model);
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
			}
		});
	
		btnNewButton_1.setBounds(45, 255, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\all page background image.png"));
		lblNewLabel_1.setBounds(0, 0, 493, 342);
		contentPane.add(lblNewLabel_1);
	}
}
