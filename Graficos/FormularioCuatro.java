package Graficos;

import javax.swing.*;
import java.awt.event.*;

public class FormularioCuatro extends JFrame implements ActionListener  {
	
	JButton boton1;
	
	public FormularioCuatro() { //constructor
		setLayout(null);//permite agregar elementos dentro de tu interfaz grafica
		boton1 = new  JButton("Cerrar");
		boton1.setBounds(300,250,100,30);
		add(boton1);
		boton1.addActionListener(this);//este boton va tener un evento
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boton1 ) {
			System.exit(0);
			
		}
	}

	public static void main(String[] args) {
		 
		FormularioCuatro formulario = new FormularioCuatro();
		formulario.setBounds(0, 0, 400, 350);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);

	}

}
