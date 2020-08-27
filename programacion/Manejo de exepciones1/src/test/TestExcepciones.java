
package test;

import static atitmecica.Aritmetica.division;

public class TestExcepciones {
    
    public static void main(String[] args) {
        int resultado = 0;
        
         try{
//              resultado = 10/0;
             resultado =division(10, 0);
         }catch(Exception e){
             System.out.println("Ocurrio un erorr:");
             //e.printStackTrace(System.out);
             System.out.println(e.getMessage());
         }
       
        System.out.println("Resultado: " + resultado);
    }
}
