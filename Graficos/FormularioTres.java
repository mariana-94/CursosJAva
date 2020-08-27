package Graficos;

import javax.swing.*;


public class FormularioTres extends JFrame{
	
	private JLabel label1,label2;
	
	
public FormularioTres() {
	setLayout(null);
	label1 = new JLabel("Interfaz Grafica");
	label1.setBounds(10, 20, 300, 30);
	add(label1);
	
	label2 = new JLabel("Versio 1.0");
	label2.setBounds(10, 100, 100, 30);
	add(label2);
}
	
	
	

	public static void main(String[] args) {
		
		FormularioTres formulario = new FormularioTres();
		formulario.setBounds(0, 0, 300, 200);
		formulario.setResizable(false);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		

	}

}
