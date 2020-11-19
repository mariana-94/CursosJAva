
package test;

import domain.Persona;

public class TestJavaBean {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        
        persona.setNombre("Kilian David");
        persona.setApellido("San Jose Jimenez");
        
        System.out.println("Persona = " + persona);
        
        System.out.println("Persona nombre: " + persona.getNombre());
        System.out.println("Persona apellido: " + persona.getApellido());
        
        
    }
}
