package Graficos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia  extends JFrame implements ActionListener,ChangeListener{

		private JLabel label1,label2;
		private JCheckBox combo;
		private JButton boton1,boton2;
		private JScrollPane panel;
		private JTextArea area;
		String nombre = "";
		
		public Licencia() {
			
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setTitle("Licencia de uso");
			setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
			
			Bienvenida  ventanaBienvenida = new Bienvenida();
			nombre = ventanaBienvenida.texto;
			
			label1 = new JLabel("TERMINOS Y CONDICIONES");
			label1.setBounds(215,5,200,30);
			label1.setFont(new Font("Andale Mono",1,14));
			label1.setForeground(new Color(0,0,0));//color negro
			add(label1);
			
			
			area = new JTextArea();
			area.setEditable(false);
			area.setFont(new Font("Andale Mono",0,9));
			area.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE MARIANA RIVERA." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (MARIANA RIVERA), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/mar");
			panel = new JScrollPane(area);
			panel.setBounds(10,40,575,200);
			add(panel);
			
			
			combo = new JCheckBox("Yo " + nombre + " Acepto");
			combo.setBounds(10,250,300,30);
			combo.addChangeListener(this);
			add(combo);
			
			
			boton1 = new JButton("Continuar");
			boton1.setBounds(10,290,100,30);
			boton1.addActionListener(this);
			boton1.setEnabled(false);
			add(boton1);
			
			
			boton2 = new JButton("No Acepto");
			boton2.setBounds(120,290,100,30);
			boton2.addActionListener(this);
			boton2.setEnabled(true);
			add(boton2);
			
			
			
			ImageIcon imagen = new ImageIcon("images/coca-cola.png");
			label2 = new JLabel(imagen);
			label2.setBounds(315,135,300,300);
			add(label2);
			
				
			
		}

	
		public void stateChanged(ChangeEvent e) {
			
			if(combo.isSelected() == true) {
				boton1.setEnabled(true);
				boton2.setEnabled(false);
			}
			else
			{
				boton1.setEnabled(false);
				boton2.setEnabled(true);
			}
			
		}

	
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == boton1) {
				
				Principal p = new Principal();
				p.setBounds(0,0,640,535);
				p.setVisible(true);
				p.setResizable(false);
				p.setLocationRelativeTo(null);
				
				this.setVisible(false);
				
			}else if(e.getSource() == boton2) {
				Bienvenida  b = new Bienvenida();
				b.setBounds(0,0,350,450);
				b.setVisible(true);
				b.setResizable(false);
				b.setLocationRelativeTo(null);
				
				this.setVisible(false);

			}
			
		}
		
		
		public static void main(String args[]) {
			
			Licencia l = new Licencia();
			l.setBounds(0,0,600,360);
			l.setVisible(true);
			l.setResizable(false);
			l.setLocationRelativeTo(null);
		}
}
