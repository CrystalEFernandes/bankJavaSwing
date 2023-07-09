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

import javax.swing.border.LineBorder;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class FAQ {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAQ window = new FAQ("");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	String Acc;
	public FAQ(String Acc){
		this.Acc=Acc;
		initialize();
	}
	public JFrame frame;



	private void initialize() {
		frame = new JFrame();
		frame.setBounds(250, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		Image img=new ImageIcon(this.getClass().getResource("/grad.png")).getImage();
		frame.getContentPane().setLayout(null);
		
		
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
		panel_4_1_1.setBounds(678, 406, 112, 83);
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
		panel_4_1_1_1.setBounds(678, 110, 112, 83);
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
		panel_1.setBounds(25, 159, 617, 306);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Contact the bank's customer service department\nAs this may happen due to internet connection,power failure or server issue");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground(new Color(97,190,195));	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(new Color(240,240,240));
			}
		});
		panel_2.setBounds(29, 21, 563, 31);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("How to handle failed ATM transaction?");
		lblNewLabel_2.setBounds(10, 11, 235, 18);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Corbel", Font.BOLD, 14));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "1. Go to DASHBOARD\n2. Select WITHDRAW option\n3. Enter amount to be withdrawn\n4. Click on Withdraw ");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1.setBackground(new Color(97,190,195));	
			};
			public void mouseExited(MouseEvent e) {
				panel_2_1.setBackground(new Color(240,240,240));
			}
			
		});
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(29, 78, 563, 31);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("How to withdraw money?");
		lblNewLabel_2_1.setFont(new Font("Corbel", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(10, 11, 235, 18);
		panel_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "1. Go to Sign Up page\n2. Click on CHANGE PASSWORD\n3.Enter the new password\n4.Confirm the new password");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1_1.setBackground(new Color(97, 190, 195));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1_1.setBackground(new Color(240, 240, 240));
			}
		});
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(29, 130, 563, 31);
		panel_1.add(panel_2_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("How to change ATM pin?");
		lblNewLabel_2_1_1.setFont(new Font("Corbel", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(10, 11, 235, 18);
		panel_2_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "1. Go to DASHBOARD\n2. Select DEPOSIT option\n3. Enter the amount to be deposited\n4. Click on DEPOSIT  ");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1_1_1.setBackground(new Color(97, 190, 195));
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1_1_1.setBackground(new Color(240, 240, 240));
			}
		});
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(29, 185, 563, 31);
		panel_1.add(panel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("How to deposit money?");
		lblNewLabel_2_1_1_1.setFont(new Font("Corbel", Font.BOLD, 14));
		lblNewLabel_2_1_1_1.setBounds(10, 11, 235, 18);
		panel_2_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "1. Go to DASHBOARD\n2. Select MINI STATEMENT option");	
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2_1_1_1_1.setBackground(new Color(97, 190, 195));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2_1_1_1_1.setBackground(new Color(240, 240, 240));
			}
			
		});
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(29, 237, 563, 31);
		panel_1.add(panel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("How to check your transaction history?");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Corbel", Font.BOLD, 14));
		lblNewLabel_2_1_1_1_1.setBounds(10, 11, 235, 18);
		panel_2_1_1_1_1.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 821, 138);
		panel.setBackground(new Color(0, 32, 96));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FAQ - Frequently Asked Questions");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(24, 93, 579, 34);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 32));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ans=JOptionPane.showConfirmDialog(null, "Do you really want to exit?","EXIT MESSAGE",JOptionPane.YES_NO_OPTION);
				if(ans==JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		Image img13=new ImageIcon(this.getClass().getResource("/close.png")).getImage();
		lblNewLabel_8.setIcon(new ImageIcon(img13));
		lblNewLabel_8.setBounds(735, 11, 55, 40);	
		panel.add(lblNewLabel_8);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 70, 890, 430);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));

		

	}
}
