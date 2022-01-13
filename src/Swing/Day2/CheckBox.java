package Swing.Day2;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CheckBox extends JFrame{
	public void jlable(String tittle, int x ,int y , int width ,int height) {
		JLabel jLabel =new JLabel(tittle);
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
	public CheckBox() {
		setTitle("Texas Form");
		setBounds(15,10,500,500);
		setLayout(null);
		//userName
		jlable("Username", 15, 15,70, 20);
		txtField(90,15, 100,20);
		//Password
		jlable("Password", 15,40,70, 20);
		jPasswordField(90,40, 100,20);
		
		JCheckBox box =new JCheckBox("Save password");
		box.setBounds(55,70,150,20);
		
		JButton button= new JButton("Login");
		button.setBounds(75, 100, 80, 20);
		add(button);
		add(box);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		CheckBox box=new CheckBox();
	}

}
