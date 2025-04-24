package src.com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Arithmetic {
	public static void main(String[] args) {
		
		//frame
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setTitle("Calculator");
		frame.setLayout(null);
		
		//addition
		//"addition" Label
		JLabel addlbl = new JLabel("Addition");
		addlbl.setSize(50, 30);
		addlbl.setLocation(30, 25);
		frame.add(addlbl);
		
		//first text field
		JTextField txtValadd1 = new JTextField();
		txtValadd1.setSize(100, 20);
		txtValadd1.setLocation(30, 50);
		frame.add(txtValadd1);
		
		// + sign
		JLabel lblNameadd1 = new JLabel("+");
		lblNameadd1.setSize(30, 30);
		lblNameadd1.setLocation(150, 45);
		frame.add(lblNameadd1);
		
		
		//second text field 
		JTextField txtValadd2 = new JTextField();
		txtValadd2.setSize(100, 20);
		txtValadd2.setLocation(180, 50);
		frame.add(txtValadd2);
		
		//add result text field
		JTextField txtResadd= new JTextField();
		txtResadd.setSize(100, 20);
		txtResadd.setLocation(380, 50);
		txtResadd.setEditable(false);
		frame.add(txtResadd);
				
		//int sum = Integer.BYTES;
		// = sign button\
		JButton buttonadd = new JButton("=");
		buttonadd.setSize(50, 20);
		buttonadd.setLocation(305, 50);
		frame.add(buttonadd);
		buttonadd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(txtValadd1.getText());
				int y = Integer.valueOf(txtValadd2.getText());
				int sum = x+y;
				txtResadd.setText(String.valueOf(sum));
				
			}
		});
		
		
		
		//subtraction
		//"sub" Label
		JLabel sublbl = new JLabel("Subtraction");
		sublbl.setSize(70, 30);
		sublbl.setLocation(30, 75);
		frame.add(sublbl);
		
		//first text field
		JTextField txtValsub1 = new JTextField();
		txtValsub1.setSize(100, 20);
		txtValsub1.setLocation(30, 100);
		frame.add(txtValsub1);
		
		// + sign
		JLabel lblNamesub = new JLabel("-");
		lblNamesub.setSize(30, 30);
		lblNamesub.setLocation(150, 95);
		frame.add(lblNamesub);
		
		//second text field 
		JTextField txtValsub2 = new JTextField();
		txtValsub2.setSize(100, 20);
		txtValsub2.setLocation(180, 100);
		frame.add(txtValsub2);
		
		//subtraction result text field
		JTextField txtRessub= new JTextField();
		txtRessub.setSize(100, 20);
		txtRessub.setLocation(380, 100);
		txtRessub.setEditable(false);
		frame.add(txtRessub);
		
		// = sign button
		JButton buttonsub = new JButton("=");
		buttonsub.setSize(50, 20);
		buttonsub.setLocation(305, 100);
		frame.add(buttonsub);
		buttonsub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(txtValsub1.getText());
				int y = Integer.valueOf(txtValsub2.getText());
				int sub = x-y;
				txtRessub.setText(String.valueOf(sub));
				
			}
		});
		
		
		//multiplication
		//multiplication Label
		JLabel mullbl = new JLabel("Multiplication");
		mullbl.setSize(80, 30);
		mullbl.setLocation(30, 125);
		frame.add(mullbl);
		
		//first text field
		JTextField txtValmul1 = new JTextField();
		txtValmul1.setSize(100, 20);
		txtValmul1.setLocation(30, 150);
		frame.add(txtValmul1);
		
		// + sign
		JLabel lblNamemul = new JLabel("*");
		lblNamemul.setSize(30, 30);
		lblNamemul.setLocation(150, 145);
		frame.add(lblNamemul);
		
		//second text field 
		JTextField txtValmul2 = new JTextField();
		txtValmul2.setSize(100, 20);
		txtValmul2.setLocation(180, 150);
		frame.add(txtValmul2);
		
		//multiplication result text field
		JTextField txtResmul= new JTextField();
		txtResmul.setSize(100, 20);
		txtResmul.setLocation(380, 150);
		txtResmul.setEditable(false);
		frame.add(txtResmul);
		
		// = sign button
		JButton buttonmul = new JButton("=");
		buttonmul.setSize(50, 20);
		buttonmul.setLocation(305, 150);
		frame.add(buttonmul);
		buttonmul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(txtValmul1.getText());
				int y = Integer.valueOf(txtValmul2.getText());
				int mul = x*y;
				txtResmul.setText(String.valueOf(mul));
				
			}
		});
		
		
		
		//divide
		//"divide" Label
		JLabel divlbl = new JLabel("Divide");
		divlbl.setSize(70, 30);
		divlbl.setLocation(30, 175);
		frame.add(divlbl);
		
		//first text field
		JTextField txtValdiv1 = new JTextField();
		txtValdiv1.setSize(100, 20);
		txtValdiv1.setLocation(30, 200);
		frame.add(txtValdiv1);
		
		// + sign
		JLabel lblNamediv = new JLabel("/");
		lblNamediv.setSize(30, 30);
		lblNamediv.setLocation(150, 195);
		frame.add(lblNamediv);
		
		//second text field 
		JTextField txtValdiv2 = new JTextField();
		txtValdiv2.setSize(100, 20);
		txtValdiv2.setLocation(180, 200);
		frame.add(txtValdiv2);
		
		
		//result text field
		JTextField txtResdiv = new JTextField();
		txtResdiv.setSize(100, 20);
		txtResdiv.setLocation(380, 200);
		txtResdiv.setEditable(false);
		frame.add(txtResdiv);
		
		// = sign button
		JButton buttondiv = new JButton("=");
		buttondiv.setSize(50, 20);
		buttondiv.setLocation(305, 200);
		frame.add(buttondiv);
		buttondiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(txtValdiv1.getText());
				int y = Integer.valueOf(txtValdiv2.getText());
				int div = x/y;
				txtResdiv.setText(String.valueOf(div));
				
			}
		});
		
		//modulo
		//"modulo" Label
		JLabel modlbl = new JLabel("Modulo");
		modlbl.setSize(70, 30);
		modlbl.setLocation(30, 225);
		frame.add(modlbl);
		
		//first text field
		JTextField txtValmod1 = new JTextField();
		txtValmod1.setSize(100, 20);
		txtValmod1.setLocation(30, 250);
		frame.add(txtValmod1);
		
		// + sign
		JLabel lblNamemod = new JLabel("%");
		lblNamemod.setSize(30, 30);
		lblNamemod.setLocation(150, 245);
		frame.add(lblNamemod);
		
		//second text field 
		JTextField txtValmod2 = new JTextField();
		txtValmod2.setSize(100, 20);
		txtValmod2.setLocation(180, 250);
		frame.add(txtValmod2);
		
		//result text field
		JTextField txtResmod = new JTextField();
		txtResmod.setSize(100, 20);
		txtResmod.setLocation(380, 250);
		txtResmod.setEditable(false);
		frame.add(txtResmod);
		
		// = sign button
		JButton buttonmod = new JButton("=");
		buttonmod.setSize(50, 20);
		buttonmod.setLocation(305, 250);
		frame.add(buttonmod);
		buttonmod.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = Integer.valueOf(txtValmod1.getText());
				int y = Integer.valueOf(txtValmod2.getText());
				int mod = x%y;
				txtResmod.setText(String.valueOf(mod));
				
			}
		});
		
		//clear button
		JButton buttonClear = new JButton("Clear");
		buttonClear.setSize(70, 20);
		buttonClear.setLocation(100, 300);
		frame.add(buttonClear);
		buttonClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtValadd1.setText("");
				txtValadd2.setText("");
				txtResadd.setText("");
				txtValsub1.setText("");
				txtValsub2.setText("");
				txtRessub.setText("");
				txtValmul1.setText("");
				txtValmul2.setText("");
				txtResmul.setText("");
				txtValdiv1.setText("");
				txtValdiv2.setText("");
				txtResdiv.setText("");
				txtValmod1.setText("");
				txtValmod2.setText("");
				txtResmod.setText("");
				
			}
		});
		
		
		JButton buttonSolve = new JButton("Solve");
		buttonSolve.setSize(70, 20);
		buttonSolve.setLocation(300, 300);
		frame.add(buttonSolve);
		buttonSolve.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int sum = Integer.valueOf(txtValadd1.getText()) + Integer.valueOf(txtValadd2.getText());
				txtResadd.setText(String.valueOf(sum));
				int sub = Integer.valueOf(txtValsub1.getText()) - Integer.valueOf(txtValsub2.getText());
				txtRessub.setText(String.valueOf(sub));
				int mul = Integer.valueOf(txtValmul1.getText()) * Integer.valueOf(txtValmul2.getText());
				txtResmul.setText(String.valueOf(mul));
				int div = Integer.valueOf(txtValdiv1.getText()) / Integer.valueOf(txtValdiv2.getText());
				txtResdiv.setText(String.valueOf(div));
				int mod = Integer.valueOf(txtValmod1.getText()) % Integer.valueOf(txtValmod2.getText());
				txtResmod.setText(String.valueOf(mod));
			}
		});
		
		
		
		//exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
