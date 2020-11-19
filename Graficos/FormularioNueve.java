package Graficos;

import javax.swing.*;
import java.awt.event.*;

public class FormularioNueve extends JFrame implements ActionListener {
	
	private JTextField t1;
	private JButton b1;
	private JTextArea a1;
	private JScrollPane p1;
	
	String texto = "";
	

	public FormularioNueve() {
		setLayout(null);
		t1 = new JTextField();
		t1.setBounds(10, 10, 200, 30);
		add(t1);
		
		b1 = new JButton("Agregar");
		b1.setBounds(250,10,100,30);
		add(b1);
		b1.addActionListener(this);
		
		a1 = new JTextArea();
		p1 = new JScrollPane(a1);
		
		p1.setBounds(10,50,400,300);
		add(p1);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			texto += t1.getText() + "\n" ;
			a1.setText(texto);
			t1.setText("");
			
		}
	}
	
	public static void main(String args[]) {
		FormularioNueve f = new FormularioNueve();
		
		f.setBounds(0,0,425,400);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
	}

}
