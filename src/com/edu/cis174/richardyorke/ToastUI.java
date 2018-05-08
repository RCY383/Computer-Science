package com.edu.cis174.richardyorke;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


//Richard Yorke
//CIS 174
//Spring semester
//Michael Bourgeois

// Toast Systems is an Android based User Interface that deals with orders in a restaurant setting. 
// I wanted to try to make it similar based from my work at Smitty's Cinema with the servers take orders from customers. 

// These are the requirements that Toast Systems must have
// 1. Build an UI that is similar to taking an order.
// 2. It must a Login System to log into Toast that include your Username and Password. 
// 3. The TheatreSetup have to have all the tables label with numbers.
// 4. The menu items must include at least a few things that are offered on the menu.

public class ToastUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToastUI window = new ToastUI();
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
	public ToastUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 400, 600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane txtpnWelcomeToToast = new JTextPane();
		txtpnWelcomeToToast.setFont(new Font("Dialog", Font.PLAIN, 34));
		txtpnWelcomeToToast.setText("Welcome to Toast Systems! \n Please login using your Username and Password.");
		txtpnWelcomeToToast.setBounds(41, 12, 523, 215);
		frame.getContentPane().add(txtpnWelcomeToToast);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 260, 574, 32);
		frame.getContentPane().add(separator);

		JLabel Username = new JLabel("Username");
		Username.setFont(new Font("Dialog", Font.BOLD, 14));
		Username.setBounds(41, 358, 96, 15);
		frame.getContentPane().add(Username);

		textField = new JTextField();
		textField.setBounds(193, 350, 360, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(45, 436, 70, 15);
		frame.getContentPane().add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(193, 422, 360, 44);
		frame.getContentPane().add(passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent arg0) {
				String uname =Username.getText();
				String pad=passwordField.getText();

				if(uname.equals("RCY383") && pad.equals("SonicForces"))
				{
					JOptionPane.showMessageDialog(frame, " You are login successfully");
				}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid login information! Please try again!");
				}


			}

		});
		btnLogin.setBounds(272, 504, 117, 25);
		frame.getContentPane().add(btnLogin);


	}
}
