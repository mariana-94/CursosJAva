
package test;

import java.util.*;

public class TestColecciones {
    //set y listas mantienen el orden y no se necesita decir el numero de datos que debe contener
    public static void main(String[] args) {
        List milista = new ArrayList();
        
        milista.add("1");
        milista.add(2);
        milista.add(3);
         //elemento repetido
         milista.add(3);
         
//         imprimir(milista);
         
         Set miSet = new HashSet();
         miSet.add("100");
         miSet.add("200");
         miSet.add("300");
         //elemento duplicado no se agrega 
         miSet.add("300");
//         imprimir(miSet);

        Map miMapa = new HashMap();
        ///a diferencia de una lista maneja el concepto de llave valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "David");
        miMapa.put("valor3", "Niss");
        //elemento duplicado sustituye al valor agregado previamente
        miMapa.put("valor3", "Po");
        //imprimimos las llaves
        imprimir(miMapa.keySet());
        //imprimimos los valores
        imprimir(miMapa.values());
        //imprimir un  valor asociado a una llave
        System.out.println(miMapa.get("valor3"));  
      
    }
    
    private static void imprimir (Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemnto: " + elemento);
        }
        System.out.println("");
    }
}
