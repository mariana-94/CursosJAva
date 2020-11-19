
package test;

import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("juan",5000.00,false);
        System.out.println(" persona nombre  = " + persona1.getNombre());
        
        System.out.println("Persona: " + persona1);
        persona1.setNombre("Juan Carlos");
        
//        System.out.println(" persona nombre con cambio = " + persona1.getNombre());
//        System.out.println("persona sueldo = " + persona1.getSueldo());
//        System.out.println("perosna eliminado = " + persona1.isEliminado());

        System.out.println("Persona: " + persona1.toString());
    }
}
