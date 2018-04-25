package com.yccc.edu.richardyorke;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.Box;
import java.awt.Canvas;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

public class ToastUI {

	private JFrame frame;

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
		frame.setBounds(100, 100, 765, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
