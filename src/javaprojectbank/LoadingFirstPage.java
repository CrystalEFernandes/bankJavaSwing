package javaprojectbank;

import java.awt.EventQueue;

import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.Timer;


public class LoadingFirstPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoadingFirstPage window = new LoadingFirstPage();
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
	public LoadingFirstPage() {
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
		Image img=new ImageIcon(this.getClass().getResource("/grad.png")).getImage();
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		Image img2=new ImageIcon(this.getClass().getResource("/officialbank.png")).getImage();
		
		JLabel LoadPic = new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/loaddd.gif")).getImage();
		LoadPic.setIcon(new ImageIcon(img4));
		LoadPic.setBounds(368, 365, 118, 135);
		frame.getContentPane().add(LoadPic);
		
		JLabel lblNewLabel_4 = new JLabel("THE BANK THAT STARTS WITH 'U'");
		lblNewLabel_4.setForeground(new Color(0, 32, 96));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(286, 353, 275, 14);
		frame.getContentPane().add(lblNewLabel_4);
			
		JLabel lblNewLabel_1 = new JLabel("PLEASE WAIT WHILE WE SET THINGS UP...");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 475, 332, 14);
		frame.getContentPane().add(lblNewLabel_1);
		

		JLabel lblNewLabel_3 = new JLabel("UNITED BANKING");
		lblNewLabel_3.setFont(new Font("Eras Demi ITC", Font.BOLD, 40));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(229, 312, 375, 41);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(92, 49, 612, 252);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 890, 500);
		frame.getContentPane().add(lblNewLabel);

		new Timer(06_000, (e)->{frame.setVisible(false); frame.dispose();} ).start();
		new Login().frame.setVisible(true);

	}
}
