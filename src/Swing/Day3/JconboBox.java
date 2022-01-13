package Swing.Day3;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JconboBox extends JFrame{
	public static void main(String[] args) {
		String names[] = {"Ram","Shyam","Hari"};
		
		JconboBox box=new JconboBox(names);
		
	}
	public JconboBox(String [] arr) {
			setTitle("JRadio Button");
		setBounds(0,0, 500, 500);
		setLayout(null);
		
		JComboBox< String> box =new JComboBox<String>(arr);
		box.setBounds(10,10,100, 50);
		add(box);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}



