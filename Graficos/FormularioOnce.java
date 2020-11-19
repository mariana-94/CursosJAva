package Graficos;

import javax.swing.*;
import java.awt.event.*;

public class FormularioOnce extends JFrame implements ItemListener {
	
	private JComboBox combo;
	
	public FormularioOnce() {
		setLayout(null);
		
		combo = new JComboBox();
		combo.setBounds(10,10,80,20);
		add(combo);
		
		combo.addItem("rojo");
		combo.addItem("verde");
		combo.addItem("azul");
		combo.addItem("amarillo");
		combo.addItem("negro");
	
		
		combo.addItemListener(this);
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == combo) {
			String seleccion  = combo.getSelectedItem().toString();
			setTitle(seleccion);
		}
	}
	
	public static void main(String args[]) {
		FormularioOnce f1 = new FormularioOnce();
		f1.setBounds(0,0,200,100);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
	}

}
