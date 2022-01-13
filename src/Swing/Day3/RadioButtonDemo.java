package Swing.Day3;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame{
	
	public void radioBtn(String title,int x,int y ,int width , int height) {
	
		
	}
	

	public static void main(String[] args) {
		RadioButtonDemo buttonDemo= new RadioButtonDemo();
	}
	public  RadioButtonDemo() {
		setTitle("JRadio Button");
		setBounds(0,0, 500, 500);
		setLayout(null);
//		radioBtn("Male", );
//		radioBtn("Female", 120,10,100,30);
		JRadioButton button= new JRadioButton("Male");
		button.setBounds(10,10,100,30);	
		
		JRadioButton buttonf= new JRadioButton("Female");
		buttonf.setBounds(120,10,100,30);	
		
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(button);
		buttonGroup.add(buttonf);
		
		
		
		
		
		
		
		add(button);
		add(buttonf);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
}
