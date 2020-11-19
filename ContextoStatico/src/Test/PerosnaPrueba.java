
package Test;

import domain.Persona;

public class PerosnaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan");
        //System.out.println("Perosna1 = " + persona1);
        
        
        Persona persona2 = new Persona("Karla");
        //System.out.println("Perosna2 = " + persona2);
        
        
        imprimir(persona1);
        imprimir(persona2);
    }
    
    
    public static void  imprimir (Persona persona1){
        System.out.println("Persona = " + persona1);
    }
    
    public int getContador(){
        imprimir(new Persona("Karla"));
        
        return this.contador;
    }
}
