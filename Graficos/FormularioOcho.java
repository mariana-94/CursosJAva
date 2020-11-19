package Graficos;

import javax.swing.*;


public class FormularioOcho extends JFrame{
	
	private JTextField t1;
	private JScrollPane p1;
	private JTextArea j1;
	
	
	public FormularioOcho() {
		
		setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(10,10,200,30);
		add(t1);
		
		j1 = new JTextArea();
		p1 = new JScrollPane(j1); //meter el textArea dentro del JScrollPane
		
		p1.setBounds(10,50,400,300);
		add(p1);//diseno del JScrollPane porque contiene el textArea
		
		
	}

	public static void main(String[] args) {
		FormularioOcho f1 = new FormularioOcho();
		
		f1.setBounds(0,0,425,400);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);

	}

}
