package javaprojectbank;

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

import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class Login {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/grad.png")).getImage();
		Image img3=new ImageIcon(this.getClass().getResource("/logobg1.png")).getImage();
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String url2="www.instagram.com";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url2));
				}
			catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Couldn't Reach Instagram Page");
			}
			}
		});
		Image img4=new ImageIcon(this.getClass().getResource("/insta.png")).getImage();
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String url1="www.twitter.com";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url1));
				}
			catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Couldn't Reach Twitter Page");
			}
		}});
		Image img5=new ImageIcon(this.getClass().getResource("/twitter.png")).getImage();
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String url3="www.facebook.com";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url3));
				}
			catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Couldn't Reach Facebook Page");
			}
			}
		});
		Image img6=new ImageIcon(this.getClass().getResource("/facebook.png")).getImage();
		
		JLabel lblNewLabel_4 = new JLabel("PLEASE ENTER YOUR DETAILS");
		lblNewLabel_4.setForeground(new Color(0, 32, 96));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(112, 96, 241, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(null);
		panel.setBounds(447, 21, 326, 455);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(new Color(232, 244, 241));
		textField.setBounds(30, 149, 264, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(232, 244, 241));
		passwordField.setBounds(30, 220, 264, 36);
		panel.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("YOUR CARD NUMBER");
		lblNewLabel_5.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_5.setBounds(30, 135, 123, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("YOUR PASSWORD");
		lblNewLabel_5_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(30, 207, 123, 14);
		panel.add(lblNewLabel_5_1);
		

		
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(0, 32, 96));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().isEmpty() || passwordField.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Enter username or password");
				else 
				{
									
					String Query ="select * from accounttb where AccNum='"+textField.getText()+"' and PIN="+passwordField.getText()+"";
					
					try {
						Conn conn = new Conn();
						conn.St.executeQuery(Query);
						ResultSet Rs=conn.St.executeQuery(Query);
						String Acc=textField.getText();
					
						if(Rs.next()) {
							frame.dispose();
							new Dashboard(Acc).frame.setVisible(true);
							
							
						}
						else {
							JOptionPane.showMessageDialog(null, "Enter right username or password");
						}
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
				}
			}});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 32, 96));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 16));
		btnNewButton.setBounds(30, 286, 264, 44);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("________________");
		lblNewLabel_6.setBounds(30, 329, 123, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("________________");
		lblNewLabel_6_1.setBounds(184, 329, 114, 29);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("OR");
		lblNewLabel_7.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_7.setBounds(157, 334, 25, 36);
		panel.add(lblNewLabel_7);
		
		JButton btnChangePassword = new JButton("EXIT");
		btnChangePassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChangePassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnChangePassword.setBackground(new Color(109, 109, 109));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnChangePassword.setBackground(new Color(7, 103, 243));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnChangePassword.setForeground(Color.WHITE);
		btnChangePassword.setFont(new Font("Calibri", Font.BOLD, 16));
		btnChangePassword.setBorder(null);
		btnChangePassword.setBackground(new Color(7, 103, 243));
		btnChangePassword.setBounds(30, 365, 264, 44);
		panel.add(btnChangePassword);
		
		JLabel lblNewLabel_8 = new JLabel("PRIVACY  -  TERMS  -  ABOUT");
		lblNewLabel_8.setForeground(new Color(0, 32, 96));
		lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_8.setBounds(95, 430, 157, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(73, 0, 198, 124);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(img3));
		
		JLabel lblNewLabel_12 = new JLabel("CONNECT WITH US ON:");
		lblNewLabel_12.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_12.setForeground(new Color(0, 32, 96));
		lblNewLabel_12.setBounds(39, 418, 194, 14);
		frame.getContentPane().add(lblNewLabel_12);
		lblNewLabel_11.setIcon(new ImageIcon(img6));
		lblNewLabel_11.setBounds(261, 443, 46, 33);
		frame.getContentPane().add(lblNewLabel_11);
		lblNewLabel_10.setIcon(new ImageIcon(img5));
		lblNewLabel_10.setBounds(107, 443, 46, 33);
		frame.getContentPane().add(lblNewLabel_10);
		lblNewLabel_9.setIcon(new ImageIcon(img4));
		lblNewLabel_9.setBounds(187, 443, 46, 33);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to United Banking!");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Eras Demi ITC", Font.BOLD, 28));
		lblNewLabel_2.setBounds(29, 21, 414, 74);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(29, 121, 400, 290);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 890, 500);
		frame.getContentPane().add(lblNewLabel);
		Image img2=new ImageIcon(this.getClass().getResource("/loggg.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));

		

	}
}
