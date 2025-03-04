package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Largest_number {
	public static void main(String[] args) {
		//UI frame
		JFrame large = new JFrame();
		large.setSize(450, 300);
		large.setTitle("Largest Number UI");
		large.setLayout(null);
		
		//first label
		JLabel lbl1 = new JLabel("Enter values");
		lbl1.setSize(100, 20);
		lbl1.setLocation(50,25);
		large.add(lbl1);
		
		//second label		
		JLabel lbl2 = new JLabel("first Value : ");
		lbl2.setSize(100, 20);
		lbl2.setLocation(50, 50);
		large.add(lbl2);
		
		//third label		
		JLabel lbl3 = new JLabel("second Value : ");
		lbl3.setSize(100, 20);
		lbl3.setLocation(50, 75);
		large.add(lbl3);
		
		//fourth label		
		JLabel lbl4 = new JLabel("third Value : ");
		lbl4.setSize(100, 20);
		lbl4.setLocation(50, 100);
		large.add(lbl4);
		
		//fifth label		
		JLabel lbl5 = new JLabel("fourth Value : ");
		lbl5.setSize(100, 20);
		lbl5.setLocation(50, 125);
		large.add(lbl5);
		
		//first text field
		JTextField txtval1 = new JTextField();
		txtval1.setSize(100, 20);
		txtval1.setLocation(150, 50);
		large.add(txtval1);
		
		//second text field
		JTextField txtval2 = new JTextField();
		txtval2.setSize(100, 20);
		txtval2.setLocation(150, 75);
		large.add(txtval2);
		
		//third text field
		JTextField txtval3 = new JTextField();
		txtval3.setSize(100, 20);
		txtval3.setLocation(150, 100);
		large.add(txtval3);
		
		//fourth text field
		JTextField txtval4 = new JTextField();
		txtval4.setSize(100, 20);
		txtval4.setLocation(150, 125);
		large.add(txtval4);
		
		//result text field
		JTextField txtval5 = new JTextField();
		txtval5.setSize(150, 30);
		txtval5.setLocation(200, 175);
		large.add(txtval5);
		
		//button
		JButton button = new JButton("Find largest no.");
		button.setSize(125, 30);
		button.setLocation(50, 175);
		large.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int first = Integer.valueOf(txtval1.getText());
				int sec = Integer.valueOf(txtval2.getText());
				int third = Integer.valueOf(txtval3.getText());
				int fourth = Integer.valueOf(txtval4.getText());
				int res = first>sec&&first>third&&first>fourth ? 
						first : (sec>third&&sec>fourth ? sec : (third>fourth ? third : fourth));
				txtval5.setText(String.valueOf(res));
			}
		});
		
		
		JButton buttonClear = new JButton("Clear") ;
		buttonClear.setSize(100, 25);
		buttonClear.setLocation(300, 90);
		large.add(buttonClear);
		buttonClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtval1.setText("");
				txtval2.setText("");
				txtval3.setText("");
				txtval4.setText("");
			}
		});
		
		// terminate the window UI on close click
		large.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		large.setVisible(true);
		
	}

}
