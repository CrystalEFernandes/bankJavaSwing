package javaprojectbank;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 452, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 223, 78));
		panel.setBounds(0, 0, 452, 139);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(225, 5, 1, 1);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.DARK_GRAY);
		panel.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER YOUR DETAILS");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(48, 11, 168, 19);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.DARK_GRAY);
		panel_4_1.setBounds(236, 56, 216, 35);
		panel.add(panel_4_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("MAIN MENU");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(117, 11, 89, 19);
		panel_4_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		Image img=new ImageIcon(this.getClass().getResource("/close.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 50, 35);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(244, 223, 78), 3, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(46, 158, 103, 83);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FAST CASH");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 58, 83, 14);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(244, 223, 78), 4));
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(159, 158, 103, 83);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("DEPOSIT");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(21, 58, 55, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(244, 223, 78), 4));
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(272, 158, 103, 83);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("BALANCE\r\n");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(25, 58, 68, 14);
		panel_1_2.add(lblNewLabel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_3.setBackground(new Color(255, 255, 255));
			}
		});
		panel_1_3.setBorder(new LineBorder(new Color(244, 223, 78), 4));
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(46, 252, 103, 83);
		frame.getContentPane().add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("STATEMENTS");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 58, 93, 14);
		panel_1_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/table.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		lblNewLabel_4.setBounds(26, 11, 47, 46);
		panel_1_3.add(lblNewLabel_4);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBorder(new LineBorder(new Color(244, 223, 78), 4));
		panel_1_3_1.setBackground(Color.WHITE);
		panel_1_3_1.setBounds(159, 252, 103, 83);
		frame.getContentPane().add(panel_1_3_1);
		panel_1_3_1.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("CONTACT US");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 58, 83, 14);
		panel_1_3_1.add(lblNewLabel_1_4);

				
		JPanel panel_1_3_1_1 = new JPanel();
		panel_1_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_3_1_1.setBackground(new Color(244, 223, 78));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_3_1_1.setBackground(new Color(255, 255, 255));
			}
		});
		panel_1_3_1_1.setBorder(new LineBorder(new Color(244, 223, 78), 4));
		panel_1_3_1_1.setBackground(Color.WHITE);
		panel_1_3_1_1.setBounds(272, 252, 103, 83);
		frame.getContentPane().add(panel_1_3_1_1);
		panel_1_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_5 = new JLabel("LOGOUT");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_5.setBounds(25, 58, 55, 14);
		panel_1_3_1_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(34, 11, 46, 48);
		panel_1_3_1_1.add(lblNewLabel_3);
	}
}
