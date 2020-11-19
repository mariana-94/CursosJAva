package Basicos;

import java.util.Scanner;

public class Cadena{
  public static void main(String args[]){

	String cadena_original = "",cadena_substraccion = "";
	int num_caracteres = 0, desde =0, hasta = 0;

	@SuppressWarnings("resource")
	Scanner entrada = new Scanner(System.in);

	System.out.print("Introdue una cadena de caracteteres: ");
	cadena_original = entrada.nextLine();

	num_caracteres =  cadena_original.length();

	System.out.println("La cadena de caracteres " + cadena_original + " posee " +
			    num_caracteres + " caracteres.");

	System.out.print("Desde que caracter deseas obtener la nueva cadena: ");
	desde = entrada.nextInt();
 	System.out.print("Hasta que caracter deseas obtener la nueva cadena: ");
	hasta =  entrada.nextInt();


	cadena_substraccion =  cadena_original.substring(desde,hasta);

	System.out.println("La nueva cadena es: " + cadena_substraccion  );

	
	
	
	
  }
  
}