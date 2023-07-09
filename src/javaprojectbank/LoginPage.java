package javaprojectbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage {

	private JFrame frame;
	private JPasswordField pwdPinNumber;
	private JTextField txtCardNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(26, 147, 111));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		panel.setBackground(Color.WHITE);
		panel.setBounds(201, 79, 229, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtCardNumber = new JTextField();
		txtCardNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCardNumber.setText("CARD NUMBER");
		txtCardNumber.setBounds(10, 11, 200, 20);
		panel.add(txtCardNumber);
		txtCardNumber.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 3));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(201, 124, 229, 35);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		pwdPinNumber = new JPasswordField();
		pwdPinNumber.setDisabledTextColor(Color.WHITE);
		pwdPinNumber.setText("PIN NUMBER");
		pwdPinNumber.setBounds(10, 11, 209, 20);
		panel_1.add(pwdPinNumber);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(0, 69, 189, 231);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("WELCOME TO BANK ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(20, 11, 169, 115);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/bank.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(61, 106, 69, 76);
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(234, 0, 216, 35);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER YOUR DETAILS");
		lblNewLabel_2.setBounds(48, 11, 168, 19);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		panel_4.add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String PIN = pwdPinNumber.getText();
				String CardNumber= txtCardNumber.getText();
				
				if(PIN.contains("1234")&& CardNumber.contains("9321591032"))
				{
					txtCardNumber.setText(null);
					pwdPinNumber.setText(null);		
					MainMenu info = new MainMenu();
					MainMenu.main(null);
				}
				else 
				{
					txtCardNumber.setText("Enter Correct Card Number");
					pwdPinNumber.setText("Enter PIN");
					JOptionPane.showMessageDialog(null,"Invalid Details","Login Error", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(249, 197, 113, 35);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/key.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(201, -15, 75, 68);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(381, 230, 81, 70);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Do you really want to exit?","EXIT",JOptionPane.YES_OPTION);
					System.exit(0);
				
			}
		});
		Image img3=new ImageIcon(this.getClass().getResource("/close.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img3));
		lblNewLabel_5.setBounds(0, 0, 54, 39);
		frame.getContentPane().add(lblNewLabel_5);
		

	}
}
