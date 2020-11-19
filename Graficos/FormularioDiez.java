package Graficos;

import javax.swing.*;
import java.awt.event.*;

public class FormularioDiez extends JFrame implements ActionListener {
	
	private JTextField t1,t2;
	private JLabel l1,l2,l3;
	private JButton b1;
	
	
	public FormularioDiez() {
		
		setLayout(null);
		l1 = new JLabel("Valor 1:");
		l1.setBounds(50,5,100,30);
		add(l1);
		
		l1 = new JLabel("Valor 2:");
		l1.setBounds(50,35,100,30);
		add(l1);
		
		l3 = new JLabel("Resultado:");
		l3.setBounds(120,80,100,30);
		add(l3);
		
		t1 = new JTextField();
		t1.setBounds(120,10,150,20);
		add(t1);
		
		t2 = new JTextField();
		t2.setBounds(120,40,150,20);
		add(t2);
		
		b1 = new JButton("Sumar");
		b1.setBounds(10,80,100,30);
		add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			int valor1 = 0, valor2 = 0, resultado = 0;
			valor1 = Integer.parseInt (t1.getText());
			valor2 = Integer.parseInt (t2.getText());
			
			resultado = valor1 + valor2;
			
			l3.setText("Resultado: " + resultado);
			
		}
	}
	
	public static void main(String args[]) {
		
		FormularioDiez f1 = new FormularioDiez();
		f1.setBounds(0,0,300,150);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
	}
	
	

}
