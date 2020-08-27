package Graficos;

import javax.swing.*;

public class FormularioSiete extends JFrame {
	
	private JTextField t1;
	private JTextArea j1;
	
	
	public FormularioSiete() {
		
		setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(10,10,200,30);
		add(t1);
		
		
		j1 = new JTextArea();
		j1.setBounds(10,50,400,300);
		add(j1);
		
	}

	public static void main(String[] args) {
		
		FormularioSiete f1 = new FormularioSiete();
		
		f1.setBounds(0,0,430,400);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);

	}

}
