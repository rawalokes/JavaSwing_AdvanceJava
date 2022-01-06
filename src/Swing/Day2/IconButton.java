	package Swing.Day2;

	import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;

public class IconButton extends JFrame{
		public void jlable(ImageIcon i, int x ,int y , int width ,int height) {
			JLabel jLabel =new JLabel(i);
			jLabel.setBounds(x,y, width,height);
			add(jLabel);		
		}
		public void txtField(int x,int y, int width,int height) {
			JTextField txtUsername =new JTextField();
			txtUsername.setBounds(x,y,width,height);	
			add(txtUsername);
		}
		public void jPasswordField(int x,int y ,int width, int height) {
			JPasswordField jpassfield = new JPasswordField();
			jpassfield.setBounds(x, y, width, height);
			add(jpassfield);
		}
		public IconButton() {
			ImageIcon user= new ImageIcon("E:\\AdvanceJAva\\Demo\\src\\Swing\\images\\user.png");
			ImageIcon key= new ImageIcon("E:\\AdvanceJAva\\Demo\\src\\Swing\\images\\key.png");
			ImageIcon login= new ImageIcon("E:\\AdvanceJAva\\Demo\\src\\Swing\\images\\login.png");
			
			setTitle("Texas Form");
			setBounds(15,10,500,500);
			setLayout(null);
			//userName
			jlable(user,15,15,70, 30);
			txtField(90,25,100,20);
			//Password
			jlable(key,15,50,70,30);
			jPasswordField(90,55, 100,20);
			
			JCheckBox box =new JCheckBox("Save password");
			box.setBounds(55,80,150,30);
			
			JButton button= new JButton(login);
			button.setBounds(75, 110, 80, 30);
			button.setBackground(Color.WHITE);
			add(button);
			add(box);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			
		}
		public static void main(String[] args) {
			IconButton button= new IconButton();
		}


}
