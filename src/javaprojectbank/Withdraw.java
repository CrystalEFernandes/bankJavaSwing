package javaprojectbank;
import java.sql.*;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Withdraw {

	public JFrame frame;
	public JTextField amtField;

	
	int OldBalance=0;
	public void GetBalance()
	{
		String Query ="select * from accounttb where AccNum='"+Acc+"'";
		
		try {
			Conn conn = new Conn();
			ResultSet Rs=conn.St.executeQuery(Query);
			Rs.next();
			OldBalance=Rs.getInt("Balance");
			}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw window = new Withdraw("");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}


	String Acc;
	int AccN;
	public Withdraw(String Acc) {
		this.Acc=Acc;
		AccN=Integer.valueOf(Acc);
		GetBalance();
		initialize();
	}


	public void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		Image img=new ImageIcon(this.getClass().getResource("/grad.png")).getImage();
		frame.getContentPane().setLayout(null);
		
		JPanel panel_4_1_1_1_1 = new JPanel();
		panel_4_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4_1_1_1_1.setBackground(new Color(172, 216, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4_1_1_1_1.setBackground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new Transfers(Acc).frame.setVisible(true);
				frame.dispose();
			}
		});
		panel_4_1_1_1_1.setLayout(null);
		panel_4_1_1_1_1.setBackground(Color.WHITE);
		panel_4_1_1_1_1.setBounds(678, 107, 112, 93);
		frame.getContentPane().add(panel_4_1_1_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("TRANSFERS");
		lblNewLabel_6_1_1.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_6_1_1.setBounds(23, 79, 102, 14);
		panel_4_1_1_1_1.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/transfersmall.png")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img5));
		
		lblNewLabel_9.setBounds(23, 0, 92, 71);
		panel_4_1_1_1_1.add(lblNewLabel_9);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4_1_1.setBackground(new Color(172, 216, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4_1_1.setBackground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new Dashboard(Acc).frame.setVisible(true);
				frame.dispose();
			}
		});
		panel_4_1_1.setBounds(678, 338, 112, 83);
		frame.getContentPane().add(panel_4_1_1);
		panel_4_1_1.setBackground(Color.WHITE);
		panel_4_1_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(32, 11, 56, 48);
		panel_4_1_1.add(lblNewLabel_5);

		
		JLabel lblNewLabel_6 = new JLabel("   HOME");
		lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_6.setBounds(32, 58, 46, 14);
		panel_4_1_1.add(lblNewLabel_6);
		
		JPanel panel_4_1_1_1 = new JPanel();
		panel_4_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_4_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_4_1_1_1.setBackground(new Color(172, 216, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_4_1_1_1.setBackground(new Color(255, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "CONTACT OUR CURTOMER CARE AT:\n 9321591032 \n OR \n unitedbanking@gmail.com");
			}
		});
		panel_4_1_1_1.setBackground(Color.WHITE);
		panel_4_1_1_1.setBounds(678, 224, 112, 83);
		frame.getContentPane().add(panel_4_1_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(32, 11, 45, 45);
		Image img3=new ImageIcon(this.getClass().getResource("/headset.png")).getImage();
		panel_4_1_1_1.setLayout(null);
		lblNewLabel_7.setIcon(new ImageIcon(img3));
		panel_4_1_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("   CONTACT US");
		lblNewLabel_6_1.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_6_1.setBounds(10, 58, 92, 14);
		panel_4_1_1_1.add(lblNewLabel_6_1);
		Image img2=new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 112, 192), 8));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(252, 92, 337, 347);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		amtField = new JTextField();
		amtField.setBorder(null);
		amtField.setBackground(new Color(232, 244, 241));
		amtField.setBounds(54, 96, 239, 33);
		panel_1.add(amtField);
		amtField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER  AMOUNT  TO  WITHDRAW");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setBounds(54, 71, 207, 26);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int amount=Integer.valueOf(amtField.getText());
				if(amtField==null)
				{
					JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
				}
				else {
					  if (OldBalance>(amount))
			          {
						  try {
								String Query="Update accounttb set Balance=? where AccNum=?";
								Conn conn = new Conn();
								PreparedStatement ps=conn.Con.prepareStatement(Query);
								ps.setInt(1, OldBalance-Integer.valueOf(amtField.getText()));
								ps.setInt(2, AccN);
								
								if(ps.executeUpdate()==1)
								{
									JOptionPane.showMessageDialog(null, "Balance Updated");
									new Dashboard(Acc).frame.setVisible(true);
									frame.dispose();
								}
								else {
									JOptionPane.showMessageDialog(null, "Missing information");
								}
							}catch(Exception e1) {
								JOptionPane.showMessageDialog(null, e1);
							}
			            
			          }
					  else {
						  JOptionPane.showMessageDialog(null, "Insuffient Balance");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 32, 96));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(54, 159, 239, 39);
		panel_1.add(btnNewButton);
		
		JButton btnCancelTrans = new JButton("CANCEL TRANSACTION");
		btnCancelTrans.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelTrans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Transaction Canceled");
				new Dashboard(Acc).frame.setVisible(true);
				frame.dispose();
			}
		});
		btnCancelTrans.setBorder(null);
		btnCancelTrans.setBackground(new Color(7, 103, 242));
		btnCancelTrans.setForeground(new Color(255, 255, 255));
		btnCancelTrans.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCancelTrans.setBounds(54, 253, 239, 39);
		panel_1.add(btnCancelTrans);
		
		JLabel lblNewLabel_4 = new JLabel("_______________________________________");
		lblNewLabel_4.setForeground(new Color(0, 32, 96));
		lblNewLabel_4.setBounds(34, 213, 276, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 338, 260, 162);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 821, 138);
		panel.setBackground(new Color(0, 32, 96));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WITHDRAWAL");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(24, 93, 217, 34);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 32));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		Image img13=new ImageIcon(this.getClass().getResource("/close.png")).getImage();
		lblNewLabel_8.setIcon(new ImageIcon(img13));
		lblNewLabel_8.setBounds(735, 11, 55, 40);
		panel.add(lblNewLabel_8);
		Image img1=new ImageIcon(this.getClass().getResource("/loggg1.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 70, 890, 430);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));

		

	}
}
