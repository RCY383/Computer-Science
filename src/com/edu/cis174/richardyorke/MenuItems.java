package com.edu.cis174.richardyorke;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuItems extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuItems frame = new MenuItems();
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
	public MenuItems() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 400, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnPleaseSelectA = new JTextPane();
		txtpnPleaseSelectA.setFont(new Font("Dialog", Font.PLAIN, 30));
		txtpnPleaseSelectA.setText("Please select a Meal with a drink if necessary per customer Request!");
		txtpnPleaseSelectA.setBounds(46, 25, 519, 182);
		contentPane.add(txtpnPleaseSelectA);
		
		JButton btnChickenTenderMeal = new JButton("Chicken Tender Meal");
		btnChickenTenderMeal.setBounds(57, 277, 229, 62);
		contentPane.add(btnChickenTenderMeal);
		
		JButton btnSodas = new JButton("Sodas");
		btnSodas.setBounds(359, 366, 186, 103);
		contentPane.add(btnSodas);
		
		JButton btnNewButton = new JButton("Garden Salad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(131, 426, 186, 114);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Burger");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(375, 263, 170, 76);
		contentPane.add(btnNewButton_1);
	}
}
