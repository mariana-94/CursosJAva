
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        
        int edades[][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0]= 5;
        edades[0][1]= 7;
        edades[1][0]= 8;
        edades[1][1]= 4;
        edades[2][0]= 9;
        edades[2][1]=10;
        
        
        System.out.println("edades 0-0 = " + edades [0][0]);
        System.out.println("edades 0-1 = " + edades [0][1]);
        
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                
                System.out.println("edades" + "[" +ren + "]" + "[" +col + "]" +":" + edades[ren][col]);
            }
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora"},{"Mora"}};
        imprimir(frutas);
//        for (int ren = 0; ren < frutas.length; ren++) {
//            for (int col = 0; col < frutas[ren].length; col++) {
//                System.out.println("frutas" + "[" +ren + "]" + "[" +col + "]" +":" + frutas[ren][col]);
//            }
//        }
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2]= new Persona("Pepe");
        
        personas[1][0]= new Persona("Pedro");
        personas[1][1]= new Persona("David");
        personas[1][2]= new Persona("Kilian");
        
        imprimir(personas);
        
    }//main
    
    public static void imprimir(Object matriz[][]){
        
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz" + "[" +ren + "]" + "[" +col + "]" +":" + matriz[ren][col]);
            }
        }
        
    }
    
}//class
