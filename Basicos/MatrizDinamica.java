package Basicos;
import java.util.Scanner;


public class MatrizDinamica{
  public static void main(String args[]){
		
	   int contador = 1, filas = 0, columnas = 0 ;
	   Scanner entrada = new Scanner(System.in);

	   System.out.print("Numero de filas: ");
	   filas= entrada.nextInt();
		
	   System.out.print("Numero de columnas: ");
	   columnas= entrada.nextInt();
	
	   System.out.println("");

	    int numeros[][] = new int [filas][columnas];
	

	   for(int j=0; j < filas; j++){
	     
             for(int i=0; i < columnas; i++){

		numeros[j][i] = contador;

		contador++;

		System.out.print("[" + numeros[j][i] + "]");
             }
		System.out.println("");		
           
	   }

  }
}