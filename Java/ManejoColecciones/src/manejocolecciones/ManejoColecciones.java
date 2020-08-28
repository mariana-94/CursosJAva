
package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    
    public static void main(String[] args) {
        List milista = new ArrayList();
        
        milista.add("1");
        milista.add(2);
        milista.add(3);
         //elemento repetido
         milista.add(3);
         
         imprimir(milista);
         
         Set miSet = new HashSet();
         
         
         
         
    }
    
    private static void imprimir (Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemnto: " + elemento);
        }
        System.out.println("");
    }
}
