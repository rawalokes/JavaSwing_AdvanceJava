package Swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FromThree extends JFrame{
	
	public void lblField(ImageIcon i,int x ,int y , int width, int height) {
		JLabel jLabel = new JLabel(i);
		jLabel.setBounds(x, y, width, height);
		add(jLabel);		
	}
	public void txtField(int x,int y ,int width, int height) {
		JTextField field = new JTextField();
		field.setBounds(x, y, width, height);
		add(field);
	}
	public void jPasswordField(int x,int y ,int width, int height) {
		JPasswordField jpassfield = new JPasswordField();
		jpassfield.setBounds(x, y, width, height);
		add(jpassfield);
	}
	
	public  FromThree() {
		String pad="                                                    ";
		
		setTitle(pad +"Registration");	
		setBounds(10,10,500,500);
		setLayout(null);
		ImageIcon user= new ImageIcon("E:\\AdvanceJAva\\Demo\\src\\Swing\\images\\user.png");
		ImageIcon key= new ImageIcon("E:\\AdvanceJAva\\Demo\\src\\Swing\\images\\key.png");
		//usernameIcon
		lblField(user,30,30,30,30);
		//txtfield
		
		
		txtField(80,30,100,30);
		//passwordIcon
		lblField(key,30,80,30,30);
		//password
		jPasswordField(80,80,100,30);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		FromThree ft = new FromThree();
		
	}

}
