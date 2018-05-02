package com.edu.cis174.richardyorke;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ToastUI {

	
	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

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
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(300, 300, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(69, 152, 90, 15);
		frame.getContentPane().add(lblUsername);
		
		JLabel label = new JLabel("Password");
		label.setBounds(69, 205, 83, 15);
		frame.getContentPane().add(label);
		
		username = new JTextField();
		username.setBounds(182, 146, 205, 28);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(182, 199, 205, 28);
		frame.getContentPane().add(password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname =username.getText ();
				String pad=password.getText();
				
				if(uname.contains("RCY383") && pad.contains("SonicForces"))
					username.setText(null);
					password.setText(null);
				}
			{
					JOptionPane.showMessageDialog(null, "Invalid username or password");
				}
			
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(448, 200, 117, 25);
		frame.getContentPane().add(btnLogin);
		
		
			
		JSeparator separator = new JSeparator();
		separator.setBounds(70, 165, 484, 2);
		frame.getContentPane().add(separator);
		
		JTextPane txtpnWelcomeToToast = new JTextPane();
		txtpnWelcomeToToast.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtpnWelcomeToToast.setText("          Welcome to Toast Systems! \n Please login using your Username and password. ");
		txtpnWelcomeToToast.setBounds(50, 12, 485, 128);
		
		frame.getContentPane().add(txtpnWelcomeToToast);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(69, 232, 70, 15);
		frame.getContentPane().add(label_1);
			}
		}
		 
