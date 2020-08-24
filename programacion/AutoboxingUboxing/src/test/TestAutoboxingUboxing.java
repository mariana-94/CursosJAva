
package test;

public class TestAutoboxingUboxing {
    public static void main(String[] args) {
        
       //Clases envolventes de tipos primitivos
       /*
            int-integer
            long- long
            float-Float
            double-Double
            boolean-Boolen
            byte-Byte
            char-Character
            short-Short
            
       */
       
       //AUTOBOXING
       /*
            la literal de tipo primitiva se convierte
            en un tipo objeto
       */
       
       Integer  entero = 10;
       System.out.println("entero = " + entero);
       System.out.println("entero double = " + entero.doubleValue());
       
       //UBOXING
       /*
            la literal que se extrae del onjeto se puede asignar 
            a un tipo primitivo
       */
       
       int entero2 = entero;
       
       
        
    }
    
}
