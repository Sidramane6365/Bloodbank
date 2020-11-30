package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import project.ConnectionProvider;

import javax.swing.JButton;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class DonorSearch extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonorSearch frame = new DonorSearch();
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
	public DonorSearch() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SEARCH BLOOD DONOR");
		lblNewLabel.setBounds(78, 0, 392, 53);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 36));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 51, 537, 15);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Blood Group");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Blood group.png"));
		lblNewLabel_1.setBounds(99, 77, 121, 24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 129, 537, 15);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 155, 477, 91);
		contentPane.add(scrollPane);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+","B-","AB+","AB-","O+","O-"}));
		comboBox.setBounds(255, 80, 63, 22);
		contentPane.add(comboBox);
		
		String s = (String)comboBox.getSelectedItem();
		
		table = new JTable();
		DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Donor Name","Blood Group", "Weight","Age","Date"}, 0);
		scrollPane.setViewportView(table);
		
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
		btnNewButton.setBounds(411, 301, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=ConnectionProvider.getCon();
				try
				{
					String sql="SELECT * FROM bank where bldgroup='"+s+"'";
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
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\search1.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(371, 78, 118, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\all page background image.png"));
		lblNewLabel_2.setBounds(0, 0, 557, 354);
		contentPane.add(lblNewLabel_2);
		
	
	}
}
