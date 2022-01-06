package Swing.Day1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormOne extends JFrame{
	
	public void lblField(String title,int x,int y, int width,int height) {
		JLabel jLabel=new JLabel(title+" :");
		jLabel.setBounds(x,y,width,height);		
		add(jLabel);
	}
	public void txtField(int x,int y, int width,int height) {
		JTextField txtUsername =new JTextField();
		txtUsername.setBounds(x,y,width,height);	
		add(txtUsername);
	}
	
	

	public FormOne() {
		String pad="                                          ";
		setTitle(pad  +"Registration");
		setBounds(10, 10,500,500);
		
		setLayout(null);
		//for username
		lblField("Username",15,10,100,20);
		txtField(120,10,100,20);
		//for Mname
		lblField("Mname",15,40,100,20);
		txtField(120,40,100,20);	
		//for last name

		lblField("Lname",15,70,100,20);
		txtField(120,70,100,20);
		//for address
		lblField("TextArea",15,100,100,20);
//		txtField(120,100,200,20);	
		//commets sections
		
//		JTextArea area = new JTextArea("comments");
//		area.setBounds(120,100, 100,100);
//		area.setLineWrap(true);
//		add(area);
//		
		JButton button=new JButton("Login");
		button.setBounds(150,100, 150,50);
		
		
		add(button);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
	FormOne frmone =new FormOne();
	
}
}
