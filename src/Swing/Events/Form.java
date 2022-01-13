package Swing.Events;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Form extends JFrame{
	public Form() {
		setBounds(0,0,700, 500);
		setLayout(null);
		JPanel panelName=new JPanel();
		panelName.setBounds(45, 10,600, 100);
//		panelName.setBackground(Color.BLUE);
		
		//
		JLabel lblfname = new JLabel("FName");
		JTextArea txtfname=new JTextArea();
		panelName.add(lblfname);
		panelName.add(txtfname);
		
		add(panelName);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Form form = new Form();
	}

}
