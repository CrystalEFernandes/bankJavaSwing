package javaprojectbank;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Dashboard {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard("");
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
	String Acc;
	public Dashboard(String Acc) {
		this.Acc=Acc;
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {	
		frame = new JFrame();
		frame.setBounds(250, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		Image img=new ImageIcon(this.getClass().getResource("/gradresize.png")).getImage();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/atm2.png")).getImage();
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setText("Card Number: "+Acc);
		lblNewLabel_16.setBounds(590, 261, 200, 21);
		frame.getContentPane().add(lblNewLabel_16);
				
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(104, 115, 696, 10);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(508, 130, 288, 305);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JPanel panel_2_3_2_1 = new JPanel();
		panel_2_3_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Withdraw(Acc).frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_3_2_1.setBackground(new Color(97,190,195));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_3_2_1.setBackground(new Color(255,255,255));
			}
		});
		panel_2_3_2_1.setBackground(new Color(255, 255, 255));
		panel_2_3_2_1.setBounds(176, 141, 147, 151);
		frame.getContentPane().add(panel_2_3_2_1);
		panel_2_3_2_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(27, 34, 120, 70);
		panel_2_3_2_1.add(lblNewLabel_3);
		Image img2=new ImageIcon(this.getClass().getResource("/withdraw1.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_8 = new JLabel("WITHDRAW");
		lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_8.setBounds(39, 126, 78, 14);
		panel_2_3_2_1.add(lblNewLabel_8);
		
		JPanel panel_2_3_2 = new JPanel();
		panel_2_3_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				new Deposit(Acc).frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_3_2.setBackground(new Color(220,239,235));
			}
			public void mouseExited(MouseEvent e) {
				panel_2_3_2.setBackground(new Color(255,255,255));
			}
		});
		panel_2_3_2.setBackground(new Color(255, 255, 255));
		panel_2_3_2.setBounds(351, 141, 147, 151);
		frame.getContentPane().add(panel_2_3_2);
		panel_2_3_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/balance.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img3));
		lblNewLabel_4.setBounds(21, 29, 105, 86);
		panel_2_3_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_8_1 = new JLabel("DEPOSIT");
		lblNewLabel_8_1.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_8_1.setBounds(42, 126, 78, 14);
		panel_2_3_2.add(lblNewLabel_8_1);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_3_1.setBackground(new Color(220,239,235));
			}
			public void mouseExited(MouseEvent e) {
				panel_2_3_1.setBackground(new Color(255,255,255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				String Query ="select * from accounttb where AccNum='"+Acc+"'";
				int OldBalance=0;
				try {
					Conn conn = new Conn();
					ResultSet Rs=conn.St.executeQuery(Query);
					Rs.next();
					OldBalance=Rs.getInt("Balance");
					
					}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
			}
				JOptionPane.showMessageDialog(null, "Balance is "+OldBalance);
			}
		});
		panel_2_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2_3_1.setBackground(new Color(255, 255, 255));
		panel_2_3_1.setBounds(176, 317, 147, 151);
		frame.getContentPane().add(panel_2_3_1);
		panel_2_3_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/piggybank.png")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img4));
		lblNewLabel_6.setBounds(32, 11, 90, 103);
		panel_2_3_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8_2 = new JLabel("BALANCE");
		lblNewLabel_8_2.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_8_2.setBounds(42, 125, 66, 14);
		panel_2_3_1.add(lblNewLabel_8_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				
				new Transfers(Acc).frame.setVisible(true);
			}
			public void mouseEntered(MouseEvent e) {
				panel_2_3.setBackground(new Color(97,190,195));
			};
			public void mouseExited(MouseEvent e) {
				panel_2_3.setBackground(new Color(255,255,255));
			}	
			});
		panel_2_3.setBackground(new Color(255, 255, 255));
		panel_2_3.setBounds(351, 317, 147, 151);
		frame.getContentPane().add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(31, 21, 94, 91);
		panel_2_3.add(lblNewLabel_7);
		Image img5=new ImageIcon(this.getClass().getResource("/transfer.png")).getImage();
		lblNewLabel_7.setIcon(new ImageIcon(img5));
		
		JLabel lblNewLabel_8_3 = new JLabel("TRANSFERS");
		lblNewLabel_8_3.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_8_3.setBounds(40, 123, 127, 14);
		panel_2_3.add(lblNewLabel_8_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(134, 0, 666, 119);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("DASHBOARD");
		lblNewLabel_5.setBounds(21, 21, 248, 42);
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 40));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		String pattern="dd/MM/YYYY HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date d = new Date();
		String today=df.format(d);
		lblNewLabel_1.setText("Last login at: "+today);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(21, 50, 260, 38);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ans=JOptionPane.showConfirmDialog(null, "Do you really want to exit?","EXIT MESSAGE",JOptionPane.YES_NO_OPTION);
				if(ans==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		Image img13=new ImageIcon(this.getClass().getResource("/close.png")).getImage();
		lblNewLabel_15.setIcon(new ImageIcon(img13));
		lblNewLabel_15.setBounds(610, 11, 46, 40);
		panel_1.add(lblNewLabel_15);
		
		String Query ="select * from accounttb where AccNum='"+Acc+"'";
		String AccountName = null;
		try {
			Conn conn = new Conn();
			ResultSet Rs=conn.St.executeQuery(Query);
			Rs.next();
			AccountName=Rs.getString("AccName");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_17.setForeground(new Color(0, 255, 255));
		lblNewLabel_17.setText("Hello "+AccountName+"! Have a nice day!");
		lblNewLabel_17.setBounds(21, 94, 248, 14);
		panel_1.add(lblNewLabel_17);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, -13, 134, 536);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 5, 2, 2);
		panel.add(scrollPane);
		Image img6=new ImageIcon(this.getClass().getResource("/prof.png")).getImage();
		
		JPanel panel_3 = new JPanel();
		panel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_3.setBackground(new Color(244, 244, 244));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_3.setBackground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				String Query ="select * from accounttb where AccNum='"+Acc+"'";
				String Name=null;
				int OldBalance=0;
				String PhoneNo=null;
				String mailid=null;
				try {
					Conn conn = new Conn();
					ResultSet Rs=conn.St.executeQuery(Query);
					Rs.next();
					Name=Rs.getString("AccName");
					OldBalance=Rs.getInt("Balance");
					PhoneNo=Rs.getString("Phone");
					mailid=Rs.getString("Email");
					
					}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
			}
				JOptionPane.showMessageDialog(null, "\nName of Account: "+Name+"\n Balance: "+OldBalance+"\n Phone Number: "+PhoneNo+"\n Email: "+mailid,"MY PROFILE",JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(0, 11, 134, 117);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(29, 24, 70, 61);
		panel_3.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon(img6));
		
		JLabel lblNewLabel_10 = new JLabel("MY PROFILE");
		lblNewLabel_10.setBounds(29, 96, 70, 14);
		panel_3.add(lblNewLabel_10);
		lblNewLabel_10.setFont(new Font("Calibri", Font.BOLD, 14));
		
		JPanel panel_4 = new JPanel();
		panel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4.setBackground(new Color(244, 244, 244));
			}
		});
		panel_4.setBackground(new Color(244, 244, 244));
		panel_4.setBounds(0, 139, 134, 80);
		panel.add(panel_4);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(41, 11, 48, 40);
		Image img7=new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		panel_4.setLayout(null);
		lblNewLabel_11.setIcon(new ImageIcon(img7));
		
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10_1 = new JLabel("      HOME");
		lblNewLabel_10_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(29, 55, 70, 14);
		panel_4.add(lblNewLabel_10_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4_1.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4_1.setBackground(new Color(244, 244, 244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "CONTACT OUR CURTOMER CARE AT:\n 9321591032 \n OR \n unitedbanking@gmail.com");
			}
		});
		panel_4_1.setBackground(new Color(244, 244, 244));
		panel_4_1.setBounds(0, 235, 134, 80);
		panel.add(panel_4_1);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(41, 0, 48, 48);
		Image img8=new ImageIcon(this.getClass().getResource("/map.png")).getImage();
		panel_4_1.setLayout(null);
		lblNewLabel_12.setIcon(new ImageIcon(img8));
		panel_4_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("CONTACT US");
		lblNewLabel_10_1_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_10_1_1.setBounds(33, 55, 91, 14);
		panel_4_1.add(lblNewLabel_10_1_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4_1_1.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4_1_1.setBackground(new Color(244, 244, 244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				new FAQ(Acc).frame.setVisible(true);
						}
		});
		panel_4_1_1.setBackground(new Color(244, 244, 244));
		panel_4_1_1.setBounds(0, 336, 134, 80);
		panel.add(panel_4_1_1);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(43, 11, 45, 45);
		Image img10=new ImageIcon(this.getClass().getResource("/headset.png")).getImage();
		panel_4_1_1.setLayout(null);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("   FAQ");
		lblNewLabel_10_1_1_1.setBounds(43, 62, 45, 18);
		lblNewLabel_10_1_1_1.setFont(new Font("Calibri", Font.BOLD, 14));
		panel_4_1_1.add(lblNewLabel_10_1_1_1);
		lblNewLabel_14.setIcon(new ImageIcon(img10));
		
		panel_4_1_1.add(lblNewLabel_14);
		
		JPanel panel_4_1_2 = new JPanel();
		panel_4_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4_1_2.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4_1_2.setBackground(new Color(244, 244, 244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp=JOptionPane.showConfirmDialog(null, "Do you want to logout?","LOGOUT MESSAGE", JOptionPane.YES_NO_OPTION, 0);
				if (resp==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		panel_4_1_2.setBackground(new Color(244, 244, 244));
		panel_4_1_2.setBounds(0, 433, 134, 80);
		panel.add(panel_4_1_2);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(50, 11, 49, 45);
		Image img9=new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		panel_4_1_2.setLayout(null);
		lblNewLabel_13.setIcon(new ImageIcon(img9));
		
		panel_4_1_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_10_1_2 = new JLabel("     LOGOUT");
		lblNewLabel_10_1_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_10_1_2.setBounds(24, 67, 70, 14);
		panel_4_1_2.add(lblNewLabel_10_1_2);
		
		
		JLabel lblNewLabel = new JLabel("");

		lblNewLabel.setBounds(125, 0, 890, 500);
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);

		

	}
}
