package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 702, 62);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu(" Donor");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Donor.png"));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Add New");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		
					JFrame t1 = new login.AddDonor(); 
					t1.setVisible(true);
			}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Add new.png"));
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Update Details");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				JFrame t1 = new login.DonorUpdate(); 
				t1.setVisible(true);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Update details.png"));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Search Donor");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame t1 = new login.DonorSearch(); 
				t1.setVisible(true);

			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\search user.png"));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Delete Donor");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame t1 = new login.DonorDelete(); 
				t1.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\delete donor.png"));
		mntmNewMenuItem_2.setForeground(Color.BLACK);
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mntmNewMenuItem_2.setBackground(SystemColor.menu);
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Stock");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame t1 = new login.StockDet(); 
				t1.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\stock.png"));
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Exit");
		mnNewMenu_2.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\exit.png"));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Logout");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					JFrame t1 = new login.Login(); 
					t1.setVisible(true);
				}
			}
		
		});
		mntmNewMenuItem_7.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Logout.png"));
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit Application");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\Exit application.png"));
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\icon\\Downloads\\BBMS ICON\\home.png"));
		lblNewLabel.setBounds(0, 60, 702, 380);
		contentPane.add(lblNewLabel);
	}
}
