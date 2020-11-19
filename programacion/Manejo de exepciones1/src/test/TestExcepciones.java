
package test;

import static atitmecica.Aritmetica.division;

import exepciones.OperacionExepcion;

public class TestExcepciones {
    
    public static void main(String[] args) {
        int resultado = 0;
        
         try{
//              resultado = 10/0;
             resultado =division(10, 0);
         }
         catch(OperacionExepcion e){
        	 System.out.println("Ocurrio un error de tipo OperacionExepcion");
        	  System.out.println(e.getMessage());
         }
         catch(Exception e){
             System.out.println("Ocurrio un erorr de tipo Exception");
             //e.printStackTrace(System.out);
             System.out.println(e.getMessage());
         }
         finally {
        	 System.out.println("se reviso la division entre cero");
         }
       
        System.out.println("Resultado: " + resultado);
    }
}