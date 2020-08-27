package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioDoce extends JFrame implements ActionListener {
	
	private JLabel  l1,l2,l3;
	private JComboBox c1,c2,c3;
	private JButton b1;
	
	public FormularioDoce() {
		
		setLayout(null);
		
		l1 = new JLabel("Rojo:");
		l1.setBounds(10,10,100,10);
		add(l1);
		
		c1 = new JComboBox();
		c1.setBounds(120,20,50,30);
	
		for(int i = 0; i <= 255; i++) {
			c1.addItem( String.valueOf(i) );
		}
		add(c1);
		
		
		
		
		l2 = new JLabel("Verde:");
		l2.setBounds(10,50,100,10);
		add(l2);
		
		c2 = new JComboBox();
		c2.setBounds(120,50,50,30);
	
		for(int i = 0; i <= 255; i++) {
			c2.addItem( String.valueOf(i) );
		}
		add(c2);
		
		
		
		
		
		l3 = new JLabel("Azul:");
		l3.setBounds(10,90,100,10);
		add(l3);
		
		c3 = new JComboBox();
		c3.setBounds(120,90,50,30);
	
		for(int i = 0; i <= 255; i++) {
			c3.addItem( String.valueOf(i) );
		}
		add(c3);
		
		
		
		b1 = new JButton("Fijar Color");
		b1.setBounds(10,130,100,30);
		add(b1);
		b1.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			String cad1 = c1.getSelectedItem().toString();
			String cad2 = c1.getSelectedItem().toString();
			String cad3 = c1.getSelectedItem().toString();
			
			int rojo = Integer.parseInt(cad1);
			int verde = Integer.parseInt(cad2);
			int azul = Integer.parseInt(cad3);
			
			Color color1 = new Color(rojo,verde,azul);
			
			b1.setBackground(color1);
		}
	}
	
	
	public static void main(String args[]) {
		FormularioDoce f1 = new FormularioDoce();
		
		f1.setBounds(0,0,190,200);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
	}

}
