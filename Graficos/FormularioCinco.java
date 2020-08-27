package Graficos;

import javax.swing.*;
import java.awt.event.*;


public class FormularioCinco  extends JFrame implements ActionListener{
	
	private JButton b1,b2,b3;
	private JLabel l1;
	
	public FormularioCinco() {
		
		setLayout(null);
		
		b1 = new JButton("1");
		b1.setBounds(10, 100, 90, 30);
		add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("2");
		b2.setBounds(110, 100, 90, 30);
		add(b2);
		b2.addActionListener(this);
		
		
		b3 = new JButton("3");
		b3.setBounds(210, 100, 90, 30);
		add(b3);
		b3.addActionListener(this);
		
		l1 = new JLabel("En espera"); 
		l1.setBounds(10,10,300,30);
		add(l1);
	}
	
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			l1.setText("Has presionado el boton 1");
		}
		
		if(e.getSource() == b2) {
			l1.setText("Has presionado el boton 2");
		}
		
		if(e.getSource() == b3) {
			l1.setText("Has presionado el boton 3");
		}
		
		
	}
	

	public static void main(String[] args) {
		
		FormularioCinco formulario = new FormularioCinco();
		
		formulario.setBounds(0,0,317,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);

	}

}
