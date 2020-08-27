package Graficos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class FormularioDieciseis extends JFrame implements ActionListener,ChangeListener {
	
	private JLabel label1;
	private JCheckBox combo1;
	private JButton boton1;
	
	public FormularioDieciseis() {
		setLayout(null);
		
		label1 = new JLabel("Aceptar terminos y condiciones");
		label1.setBounds(10, 10, 400, 30);
		add(label1);
		
		combo1 = new JCheckBox("Acepto");
		combo1.setBounds(10,50,100,30);
		combo1.addChangeListener(this);
		add(combo1);
		
		boton1 = new JButton("Continuar");
		boton1.setBounds(10,100,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
	}
	
	public void stateChanged(ChangeEvent e) {
		if(combo1.isSelected() == true) {
			boton1.setEnabled(true);
		}else {
			boton1.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		FormularioDieciseis f1 = new FormularioDieciseis();
		
		f1.setBounds(0,0,350,200);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
		
	}

}
