import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Principal extends JFrame implements ActionListener{

	private JMenuBar menu;
	private JMenu menuOpciones,menuCalcular,menuAcerca,menuColor;
	private JMenuItem miCalculo,miRojo,miNegro,miMorado,miCreador,miSalir,miNuevo;
	private JLabel labelLogo,labelBienvenido,labelTitle,
	labelNombre,labelPaterno,LabelMaterno,labelDepartamento,labelAntiguedad,labelResultado,labelFooter;
	private JTextField txtNombre,txtPaterno,txtMaterno;
	private JComboBox comboDepartamento,comboAntiguedad;
	private JScrollPane panel;
	private JTextArea area;
	String nombreAdministrador = "";
	
	
	
	
	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("Pantalla Prinncipal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		
		Bienvenida  ventanaBienvenida = new Bienvenida();
		nombreAdministrador = ventanaBienvenida.texto;
		
		
		menu = new JMenuBar();
		menu.setBackground(new Color(255,0,0));
		setJMenuBar(menu);
		
		
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono",1,14));
		menuOpciones.setForeground(new Color (255,255,255));
		menu.add(menuOpciones);
		
		
		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono",1,14));
		menuCalcular.setForeground(new Color (255,255,255));
		menu.add(menuCalcular);
		
		
		menuAcerca = new JMenu("Acerca de");
		menuAcerca.setBackground(new Color(255,0,0));
		menuAcerca.setFont(new Font("Andale Mono",1,14));
		menuAcerca.setForeground(new Color (255,255,255));
		menu.add(menuAcerca);
		
		//submenu de opciones
		menuColor = new JMenu("Color de Fondo");
		menuColor.setFont(new Font("Andale Mono",1,14));
		menuColor.setForeground(new Color (255,0,0));
		menuOpciones.add(menuColor);

		
		//items de color de fondo
		miRojo = new JMenuItem("Rojo");
		miRojo.setFont(new Font ("Andale Mono",1, 14));
		miRojo.setForeground(new Color(255,0,0));
		menuColor.add(miRojo);
		miRojo.addActionListener(this);
		
		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font ("Andale Mono",1, 14));
		miNegro.setForeground(new Color(255,0,0));
		menuColor.add(miNegro);
		miNegro.addActionListener(this);
		
		miMorado = new JMenuItem("Morado");
		miMorado.setFont(new Font ("Andale Mono",1, 14));
		miMorado.setForeground(new Color(255,0,0));
		menuColor.add(miMorado);
		miMorado.addActionListener(this);
		
		
		//items de opciones
		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font ("Andale Mono",1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);
		
		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font ("Andale Mono",1, 14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);
		
		
		// items de calcular
		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font ("Andale Mono",1, 14));
		miCalculo.setForeground(new Color(255,0,0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);
		
		// items de acerca de 
		miCreador = new JMenuItem("Acerca de");
		miCreador.setFont(new Font ("Andale Mono",1, 14));
		miCreador.setForeground(new Color(255,0,0));
		menuAcerca.add(miCreador);
		miCreador.addActionListener(this);
		
		
		//labels
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);
		
		
		labelBienvenido = new JLabel("Bienvenido " +nombreAdministrador);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Andale Mono",1,32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);
		
		
		labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Andale Mono",0,24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);
		
		
		//label y textfield
		

		labelNombre = new JLabel("Nombre Completo");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Andale Mono",1,12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(25,213,150,25);
		txtNombre.setBackground(new java.awt.Color(224,224,224));
		txtNombre.setFont(new java.awt.Font("Andale Mono",1,14));
		txtNombre.setForeground(new java.awt.Color(255,0,0));
		add(txtNombre);
		
		
		
		labelPaterno = new JLabel("Apellido Paterno");
		labelPaterno.setBounds(25,248,180,25);
		labelPaterno.setFont(new Font("Andale Mono",1,12));
		labelPaterno.setForeground(new Color(255,255,255));
		add(labelPaterno);
		
		txtPaterno = new JTextField();
		txtPaterno.setBounds(25,273,150,25);
		txtPaterno.setBackground(new java.awt.Color(224,224,224));
		txtPaterno.setFont(new java.awt.Font("Andale Mono",1,14));
		txtPaterno.setForeground(new java.awt.Color(255,0,0));
		add(txtPaterno);
		
		
		
		
		LabelMaterno = new JLabel("Apellido Materno");
		LabelMaterno.setBounds(25,308,180,25);
		LabelMaterno.setFont(new Font("Andale Mono",1,12));
		LabelMaterno.setForeground(new Color(255,255,255));
		add(LabelMaterno);
		
		txtMaterno = new JTextField();
		txtMaterno.setBounds(25,334,150,25);
		txtMaterno.setBackground(new java.awt.Color(224,224,224));
		txtMaterno.setFont(new java.awt.Font("Andale Mono",1,14));
		txtMaterno.setForeground(new java.awt.Color(255,0,0));
		add(txtMaterno);
		
		
		
		
		//label y jcombos
		
		
		labelDepartamento = new JLabel("Selecciona el Departamento");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Andale Mono",1,12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);
		
		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new java.awt.Color(224,224,224));
		comboDepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
		comboDepartamento.setForeground(new java.awt.Color(255,0,0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al Cliente");
		comboDepartamento.addItem("Departamento de Logistica");
		comboDepartamento.addItem("Departamento de Gerencia");
		
		
		
		labelAntiguedad = new JLabel("Selecciona la Antiguedad");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono",1,12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
		comboAntiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
		comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 Año de Servcio");
		comboAntiguedad.addItem("2 a 6 años de Servicio");
		comboAntiguedad.addItem("7 años o mas de Servicio");
		
		
		
		//label y tex area
		

		labelResultado = new JLabel("Resultado del Calculo");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Andale Mono",1,12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(new Color(224,224,224));
		area.setFont(new Font("Andale Mono",1,11));
		area.setForeground(new Color(255,0,0));
		area.setText("\n     Aqui aparecera el resultado del calculo de las vacaciones");
		panel = new JScrollPane(area);
		panel.setBounds(220,333,385,90);
		add(panel);
		
		
		//label final
		
		labelFooter = new JLabel("@ 2017 The Coca-Cola Company | Todos los derechos reservador");
		labelFooter.setBounds(135,445,500,30);
		labelFooter.setFont(new java.awt.Font("Andale Mono",1,12));
		labelFooter.setForeground(new java.awt.Color(255,255,255));
		add(labelFooter);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == miCalculo) {
			String nombreTrabajador = txtNombre.getText();
			String AP = txtPaterno.getText();
			String AM = txtMaterno.getText();
			String Departamento = comboDepartamento.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();
			
			String MensajeFinal = "\n    El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
				                  "\n    quien labora en " + Departamento + " con " + Antiguedad +
				                  "\n    recibe ";
			
			if(nombreTrabajador.equals("")  || AP.equals("")  || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")) {
				JOptionPane.showInternalMessageDialog(null, "Debes de llenar todos los campos.");
			}else {
				
				//atencion al cliente
				if(Departamento.equals("Atencion al Cliente")) {
					
					if(Antiguedad.equals("1 Año de Servcio")) {
						area.setText(MensajeFinal + "6 dias de vacaciones." );
					}
					if(Antiguedad.equals("2 a 6 años de Servicio")) {
						area.setText(MensajeFinal + "14 dias de vacaciones." );
					}
					if(Antiguedad.equals("7 años o mas de Servicio")) {
						area.setText(MensajeFinal + "20 dias de vacaciones." );
					}
				}
				
				//Departamento de Logistica
				if(Departamento.equals("Departamento de Logistica")) {
					
					if(Antiguedad.equals("1 Año de Servcio")) {
						area.setText(MensajeFinal + "7 dias de vacaciones." );
					}
					if(Antiguedad.equals("2 a 6 años de Servicio")) {
					}
					if(Antiguedad.equals("7 años o mas de Servicio")) {
						area.setText(MensajeFinal + "22 dias de vacaciones." );
					}
				}
				
				
				//Departamento de Gerencia
				if(Departamento.equals("Departamento de Gerencia")) {
					
					if(Antiguedad.equals("1 Año de Servcio")) {
						area.setText(MensajeFinal + "10 dias de vacaciones." );
					}
					if(Antiguedad.equals("2 a 6 años de Servicio")) {
						area.setText(MensajeFinal + "20 dias de vacaciones." );
					}
					if(Antiguedad.equals("7 años o mas de Servicio")) {
						area.setText(MensajeFinal + "30 dias de vacaciones." );
					}
				}
				
				
			}
			
		    
		}
		if(e.getSource() == miRojo) {
			getContentPane().setBackground(new Color(255,0,0));
		}
		if(e.getSource() == miNegro) {
			getContentPane().setBackground(new Color(0,0,0));
		}
		if(e.getSource() == miMorado) {
			getContentPane().setBackground(new Color(51,0,51));
		}
		if(e.getSource() == miNuevo) {
			 txtNombre.setText("");
			 txtPaterno.setText("");
			 txtMaterno.setText("");
			 comboDepartamento.setSelectedIndex(0);
			 comboAntiguedad.setSelectedIndex(0);
			 area.setText("\n     Aqui aparecera el resultado del calculo de las vacaciones");
			 area.setEditable(false);
		}
		if(e.getSource() == miSalir) {
			
			Bienvenida  b = new Bienvenida();
			b.setBounds(0,0,350,450);
			b.setVisible(true);
			b.setResizable(false);
			b.setLocationRelativeTo(null);
			
			this.setVisible(false);
		}
		if(e.getSource() == miCreador) {
			JOptionPane.showMessageDialog(null, "Desarrollado por Mariana Rivera");
		}
	}
	
	
	public static void main(String[] args) {
		
		Principal p = new Principal();
		p.setBounds(0,0,640,535);
		p.setVisible(true);
		p.setResizable(false);
		p.setLocationRelativeTo(null);

	}


}
