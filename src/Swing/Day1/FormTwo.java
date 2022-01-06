package Swing.Day1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormTwo extends JFrame{
	
	public void lblField(String title,int x ,int y , int width, int height) {
		JLabel jLabel = new JLabel(title);
		jLabel.setBounds(x, y, width, height);
		add(jLabel);		
	}
	public void txtField(int x,int y ,int width, int height) {
		JTextField field = new JTextField();
		field.setBounds(x, y, width, height);
		add(field);
	}
	
	
	public  FormTwo() {
		String pad="                                                    ";
		setTitle(pad +"Registration");	
		setBounds(10,10,500,500);
		setLayout(null);
		//fname
		lblField("Fname",15,10,100,20);
		//fnametxt field
		txtField(15, 30, 100, 20);
		//Mname
		lblField("Mname",15,50,100,20);
		//Mnametxt field
		txtField(15, 70, 100, 20);
		
		//Lname
		lblField("Lname",15,90,100,20);
		//Lnametxt field
		txtField(15, 110, 100, 20);
		
		//address
		lblField("Address",15,130,100,20);
		//Addresstxt field
		txtField(15, 150, 200, 20);		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		FormTwo formTwo = new FormTwo();
		
	}

}
