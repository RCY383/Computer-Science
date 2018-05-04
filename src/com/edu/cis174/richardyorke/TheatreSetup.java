package com.edu.cis174.richardyorke;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(600, 600, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(30, 101, 117, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(184, 208, 117, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(328, 208, 117, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(30, 362, 117, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(469, 208, 117, 25);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(30, 208, 117, 25);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(184, 362, 117, 25);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(328, 362, 117, 25);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBounds(469, 362, 117, 25);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBounds(184, 508, 117, 25);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setBounds(317, 508, 117, 25);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setBounds(469, 508, 117, 25);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		btnNewButton_12.setBounds(30, 508, 117, 25);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		btnNewButton_13.setBounds(184, 101, 117, 25);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(328, 101, 117, 25);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(469, 101, 117, 25);
		contentPane.add(btnNewButton_15);
	}
}
