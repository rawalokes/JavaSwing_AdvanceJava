package Swing.Day3;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JmenusDemo extends JFrame{
	
	public static void main(String[] args) {
		JmenusDemo demo= new JmenusDemo();
	}
	
	public JmenusDemo() {
			setTitle("JRadio Button");
		setBounds(0,0, 500, 500);
		setLayout(null);
		
		JMenuBar menu = new JMenuBar();
		menu.setBounds(0,0,700, 50);
		
		JMenu ecmenu= new JMenu("Ecllipse");
		
		
		JMenu file= new JMenu("file");
		
		menu.add(ecmenu);
		menu.add(file);
		add(menu);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}	

}

