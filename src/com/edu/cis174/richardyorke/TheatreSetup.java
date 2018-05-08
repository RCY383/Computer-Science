package com.edu.cis174.richardyorke;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class TheatreSetup extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheatreSetup frame = new TheatreSetup();
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
	public TheatreSetup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 400, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(300, 300, 600, 600));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheatreSetup = new JLabel("Theatre 4 Setup of Tables ");
		lblTheatreSetup.setFont(new Font("DejaVu Math TeX Gyre", Font.BOLD, 20));
		lblTheatreSetup.setBounds(134, 24, 302, 59);
		contentPane.add(lblTheatreSetup);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 81, 559, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 363, 574, 12);
		contentPane.add(separator_1);
		
		JButton button = new JButton("4112");
		button.setBounds(22, 387, 117, 48);
		contentPane.add(button);
		
		JButton button_1 = new JButton("4212");
		button_1.setBounds(170, 387, 117, 48);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4312");
		button_2.setBounds(312, 387, 117, 48);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4412");
		button_3.setBounds(456, 387, 117, 48);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("4113");
		button_4.setBounds(22, 489, 117, 69);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4213");
		button_5.setBounds(170, 489, 117, 69);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("4313");
		button_6.setBounds(312, 489, 117, 68);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("4413");
		button_7.setBounds(456, 489, 117, 69);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("411");
		button_8.setBounds(27, 109, 117, 108);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("421");
		button_9.setBounds(170, 109, 117, 108);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("431");
		button_10.setBounds(312, 109, 117, 108);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("441");
		button_11.setBounds(456, 109, 117, 108);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("416");
		button_12.setBounds(27, 262, 117, 98);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("426");
		button_13.setBounds(170, 262, 117, 98);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("436");
		button_14.setBounds(312, 262, 117, 98);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("446");
		button_15.setBounds(456, 262, 117, 98);
		contentPane.add(button_15);
	}
}
