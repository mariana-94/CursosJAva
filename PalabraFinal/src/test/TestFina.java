
package test;

import domain.Persona;

public class TestFina {
    
    public static void main(String[] args) {
        
        final int miVariable = 10;
        
        System.out.println("miVariable = " + miVariable);
        
        //miVariable = 12;
        
        //Persona.MI_COSNTANTE;
        System.out.println("MI CONSTANTE: " + Persona.MI_COSNTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("Pedro");
        System.out.println("perosna1 nombre = " + persona1.getNombre());
        persona1.setNombre("Juan");
        System.out.println("perosna1 nombre = " + persona1.getNombre());
        System.out.println("Este es el cambio desde gitKraken");
    }
}
