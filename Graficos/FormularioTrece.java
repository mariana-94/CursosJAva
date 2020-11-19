package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioTrece extends JFrame implements ActionListener {

	private JMenuBar barra;
	private JMenu menu;
	private JMenuItem rojo,verde,azul;
	
	
	public FormularioTrece() {
		setLayout(null);
		
		
		barra = new JMenuBar();//inicializar
		setJMenuBar(barra);// ponemos una barra
		
		menu = new JMenu("Opciones");
		barra.add(menu);//agregamos el menu a la barra
		
		rojo = new JMenuItem("Rojo");
		rojo.addActionListener(this);///sabe que realizara una accion
		menu.add(rojo);//agregamos la opcion rojo al menu opciones
		
		
		verde = new JMenuItem("Verde");
		verde.addActionListener(this);
		menu.add(verde);
		
		
		azul = new JMenuItem("Azul");
		azul.addActionListener(this);
		menu.add(azul);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Container fondo = this.getContentPane();//guarda toda dimensiones y caracteristicas de la interfaz y se las  da a fondo
		
		if(e.getSource() == rojo) {
			fondo.setBackground(new Color(255,0,0));
		}
		if(e.getSource() == verde) {
			fondo.setBackground(new Color(0,255,0));
		}
		if(e.getSource() == azul) {
			fondo.setBackground(new Color(0,0,255));
		}
		
		
	}
	
	
	public static void main(String args[]) {
		FormularioTrece f1 = new FormularioTrece();
		f1.setBounds(0,0,400,300);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
	}
}
