package com.test;

import javax.swing.*;

public class TestUI {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Calculator");
		frame.setLayout(null);
		
		// enter your name label
		JLabel lblName = new JLabel("Enter Your Name");
		lblName.setSize(150, 30);
		lblName.setLocation(50, 50);
		frame.add(lblName);
		
		//test field
		JTextField txtName = new JTextField();
		txtName.setSize(100, 30);
		txtName.setLocation(230, 50);
		frame.add(txtName);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
