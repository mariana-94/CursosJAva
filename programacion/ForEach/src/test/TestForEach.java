
package test;

import domain.Persona;

public class TestForEach {
    
    public static void main(String[] args) {
        
        int edades[] = {5,6,8,9};
        int suma = 0;
//        for (int i = 0; i < edades.length; i++) {
//            System.out.println(" edad = " + edades[i]);
//        }
        for(int edad: edades){
            System.out.println(" edad = " + edad);
            suma += edad;
        }
        System.out.println("suma: " + suma);
        
        Persona per[] = {new Persona("David"),new Persona("Kilian"),new Persona("Pedro")};
        
        for(Persona pe: per){
            System.out.println("Persona = " + pe);
        }
        
    }
}
