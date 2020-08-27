package Graficos;

import javax.swing.*;
import javax.swing.event.*;

public class FomularioDiecisiere  extends JFrame implements ChangeListener {
	
	private JRadioButton radio1,radio2,radio3;
	private ButtonGroup grupo;
	
	
	 public FomularioDiecisiere() {
		 
		 setLayout(null);
		 
		 grupo = new ButtonGroup();
		 
		 radio1 = new JRadioButton("640*480");
		 radio1.setBounds(10,20,100,30);
		 radio1.addChangeListener(this);
		 add(radio1);
		 grupo.add(radio1);
		 
		 
		 radio2 = new JRadioButton("800*600");
		 radio2.setBounds(10,70,100,30);
		 radio2.addChangeListener(this);
		 add(radio2);
		 grupo.add(radio2);
		 
		 
		 radio3 = new JRadioButton("1024*768");
		 radio3.setBounds(10,120,100,30);
		 radio3.addChangeListener(this);
		 add(radio3);
		 grupo.add(radio3);
		  
	 }
	 
	 public void stateChanged(ChangeEvent e) {
		 
		 if(radio1.isSelected()) {
			 setSize(640,480);
		 }
		 
		 if(radio2.isSelected()) {
			 setSize(800,600);
		 }
		 
		 if(radio3.isSelected()) {
			 setSize(1024,768);
		 }
 
	 }
	 
	 
	 public static void main(String args[]) {
		 FomularioDiecisiere f1 = new FomularioDiecisiere();
		 
		 f1.setBounds(0,0,350,230);
		 f1.setVisible(true);
		 f1.setResizable(false);
		 
	 }
	 
	
}
