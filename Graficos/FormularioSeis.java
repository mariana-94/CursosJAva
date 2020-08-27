package Graficos;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FormularioSeis extends JFrame implements ActionListener {
	
	private JTextField t1;
	private JLabel l1;
	private JButton b1;
	
	
	FormularioSeis(){
		
		setLayout(null);
		l1 = new JLabel("Usuario:");
		l1.setBounds(10,10,100,30);
		add(l1);
		
		t1 = new JTextField();
		t1.setBounds(120,17,150,20);
		add(t1);
		
		
		b1 = new JButton("Aceptar");
		b1.setBounds(10,80,100,30);
		add(b1);
		b1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1 ) {
			String texto = t1.getText();
			setTitle(texto);
		}
	}

	public static void main(String[] args) {

		FormularioSeis f1 = new  FormularioSeis();
		f1.setBounds(0,0,300,150);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);
		

	}

}
