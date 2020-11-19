import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class Bienvenida  extends JFrame implements ActionListener {
	
	private JTextField texto1;
	private JLabel label1,label2,label3,label4;
	private JButton boton1;
	public static String texto = "";
	
	public Bienvenida() {
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color (255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");

		label1 = new JLabel(imagen);
		label1.setBounds(25,15,300,150);
		add(label1);
		
		
		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono",3,18));//tipo de letra,cursiva-negrita y tamano de letra
		label2.setForeground(new Color (255,255,255));//color blanco la letra
		add(label2);
		
		

		label3 = new JLabel("Ingrese su nombre");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Andale Mono",1,12));//tipo de letra,cursiva-negrita y tamano de letra
		label3.setForeground(new Color (255,255,255));//color blanco la leta
		add(label3);
		
		
		
		label4 = new JLabel("@2020 The Coca-Cola Company");
		label4.setBounds(85,375,300,30);
		label4.setFont(new Font("Andale Mono",1,12));//tipo de letra,cursiva-negrita y tamano de letra
		label4.setForeground(new Color (255,255,255));//color blanco la letra
		add(label4);
		
		
		texto1 = new JTextField();
		texto1.setBounds(45,240,255,25);
		texto1.setBackground(new Color(224,224,224));//agregar color al cuadro de texto
		texto1.setFont(new Font("Andale Mono",1,14));//tipo de letra,cursiva-negrita y tamano de letra
		texto1.setForeground(new Color (255,0,0));//color rojo la letra
		add(texto1);
		
		
		boton1 = new JButton("Ingresar");
		boton1.setBounds(125,280,100,30);
		boton1.setBackground(new Color(255,255,255));//agregar color al cuadro de texto
		boton1.setFont(new Font("Andale Mono",1,14));//tipo de letra,cursiva-negrita y tamano de letra
		boton1.setForeground(new Color (255,0,0));//color rojo la letra
		boton1.addActionListener(this);
		add(boton1);
	
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			texto = texto1.getText().trim();
			
			if(texto.equals("")) {
				JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
			}else {
				Licencia l = new Licencia();
				l.setBounds(0,0,600,360);
				l.setVisible(true);
				l.setResizable(false);
				l.setLocationRelativeTo(null);
				
				this.setVisible(false);
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		Bienvenida  b = new Bienvenida();
		b.setBounds(0,0,350,450);
		b.setVisible(true);
		b.setResizable(false);
		b.setLocationRelativeTo(null);
	}
	
}