
package test;

import java.util.*;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        //System.out.println("elemento: " +elemento);
        
        //imprimir(miLista);
        
         Set<String> miSet = new HashSet<>();
         miSet.add("Lunes");
         miSet.add("Martes");
         miSet.add("Miercoles");
         miSet.add("Jueves");
         miSet.add("Viernes");
         miSet.add("Viernes");
         
         //imprimir(miSet);
        
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "David");
        miMapa.put("valor3", "Niss");
        miMapa.put("valor3", "Po");//modifica el valor no lo agrega porque las llaves son set  que no aceptan duplicados
        
        String elementoMapa = miMapa.get("valor3");
        //System.out.println("elementoMapa: " +elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    private static void imprimir (Collection<String> coleccion){
        for(String elemento: coleccion){
            System.out.println("elemnto: " + elemento);
        }
        System.out.println("");
    }
}
