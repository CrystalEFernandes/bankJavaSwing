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
import javax.swing.border.LineBorder;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Deposit {
	int AccN;
	String Acc;
	public Deposit(String Acc) {
		this.Acc=Acc;
		AccN=Integer.valueOf(Acc);
		GetBalance();
		initialize();
	}
	public JFrame frame;
	public JTextField textField;

	/**
	 * Launch the application.
	 */
	int OldBalance=0;
	public void GetBalance()
	{
		String Query ="select * from accounttb where AccNum='"+Acc+"'";
		
		try {
			Conn conn = new Conn();
			ResultSet Rs=conn.St.executeQuery(Query);
			Rs.next();
			OldBalance=Rs.getInt("Balance");
			
			}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, e1);
		}

	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit window = new Deposit("");
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


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JLabel lblNewLabel_6_1_1 = new JLabel("TRANSFER");
		lblNewLabel_6_1_1.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel_6_1_1.setBounds(28, 79, 102, 14);
		panel_4_1_1_1_1.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/transfersmall.png")).getImage();
		lblNewLabel_9.setIcon(new ImageIcon(img5));
		
		lblNewLabel_9.setBounds(28, 11, 58, 57);
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
				frame.dispose();
				new Dashboard(Acc).frame.setVisible(true);
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
		panel_1.setBounds(248, 94, 337, 293);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(new Color(232, 244, 241));
		textField.setBounds(54, 71, 239, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER  AMOUNT  TO  DEPOSIT");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(0, 0, 64));
		lblNewLabel_2.setBounds(54, 46, 207, 26);
		panel_1.add(lblNewLabel_2);
		
		JButton DepositButton = new JButton("DEPOSIT");
		DepositButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		DepositButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Enter a valid amount");
				}
				else {
					try {
						String Query="Update accounttb set Balance=? where AccNum=?";
						Conn conn = new Conn();
						PreparedStatement ps=conn.Con.prepareStatement(Query);
						ps.setInt(1, OldBalance+Integer.valueOf(textField.getText()));
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
			}
		});
		DepositButton.setFont(new Font("Calibri", Font.BOLD, 16));
		DepositButton.setForeground(new Color(255, 255, 255));
		DepositButton.setBorder(null);
		DepositButton.setBackground(new Color(0, 32, 96));
		DepositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DepositButton.setBounds(54, 134, 239, 39);
		panel_1.add(DepositButton);
		
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
		btnCancelTrans.setBounds(54, 205, 239, 39);
		panel_1.add(btnCancelTrans);
		
		JLabel lblNewLabel_4 = new JLabel("_______________________________________");
		lblNewLabel_4.setForeground(new Color(0, 32, 96));
		lblNewLabel_4.setBounds(31, 180, 276, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(0, 338, 260, 162);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 821, 138);
		panel.setBackground(new Color(0, 32, 96));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DEPOSIT");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(24, 93, 217, 34);
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
		Image img1=new ImageIcon(this.getClass().getResource("/loggg1.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 70, 890, 430);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(img));

		

	}
}
