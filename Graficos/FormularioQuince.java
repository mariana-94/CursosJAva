package Graficos;

import javax.swing.*;
import javax.swing.event.*;

public class FormularioQuince extends JFrame implements ChangeListener {
	
	private JCheckBox combo1,combo2,combo3;
	
	public FormularioQuince() {
		
		setLayout(null);
		
		combo1 = new JCheckBox("Ingles");
		combo1.setBounds(10,10,150,30);
		combo1.addChangeListener(this);
		add(combo1);
		
		
		combo2 = new JCheckBox("Frances");
		combo2.setBounds(10,50,150,30);
		combo2.addChangeListener(this);
		add(combo2);
		
		
		combo3 = new JCheckBox("Aleman");
		combo3.setBounds(10,90,150,30);
		combo3.addChangeListener(this);
		add(combo3);
	}
	
	
	public void stateChanged(ChangeEvent e) {
		String cad= "";
		
		if(combo1.isSelected() == true) {
			cad = cad + "Ingles-";
		}
		
		if(combo2.isSelected() == true) {
			cad = cad + "Frances-";
		}
		
		if(combo3.isSelected() == true) {
			cad = cad + "Aleman-";
		}
		
		setTitle(cad);
	}
	
	public static void main(String args[]) {
		
		FormularioQuince f1 = new FormularioQuince();
		f1.setBounds(0,0,350,200);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
	}

}
