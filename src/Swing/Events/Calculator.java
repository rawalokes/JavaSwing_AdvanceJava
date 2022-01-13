package Swing.Events;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class Calculator extends JFrame{
	public Calculator()
	{
		setTitle("Calculator");
		setBounds(0, 0,500,500);
		setLayout(null);
		
		//First no input Field 
		JLabel lblFirstInput= new JLabel("Number 1");
		lblFirstInput.setBounds(10, 10, 100, 20);
		
		JTextField txtfirstInput = new JTextField();
		txtfirstInput.setBounds(10,35,70,20);		
		
		
		//second no input Field 
		JLabel lblSecondInput= new JLabel("Number 2");
		lblSecondInput.setBounds(10,60, 100, 20);		
		JTextField txtSecondInput = new JTextField();
		txtSecondInput.setBounds(10,85,70,20);		
		
		//buttons 
		
		//add
		JButton btnSum = new JButton("+");
		btnSum.setBounds(10, 115, 50, 20);
		
		//subtract
		JButton btnSub = new JButton("-");
		btnSub.setBounds(70, 115, 50, 20);
		
		//Multiply
		JButton btnMul = new JButton("*");
		btnMul.setBounds(130, 115, 50, 20);
		
		//Divison
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(190, 115, 50, 20);
		
		//for output
		JLabel lblOutput= new JLabel("Output");
		lblOutput.setBounds(10,140, 100, 20);		
		JTextField txtOutput = new JTextField();
		txtOutput.setBounds(10,160,70,20);	
		add(lblOutput);
		add(txtOutput);
		add(btnSub);
		add(btnMul);
		add(btnDiv);
		add(btnSum);
		
		add(lblFirstInput);
		add(txtfirstInput);
		add(lblSecondInput);
		add(txtSecondInput);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
	}

}
