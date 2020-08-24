
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        
       /*
        LAS CLASES ABSTRACTAS NO SE INTANCEAN 
        SINO SU CLASES HIJAS PORQUE SE OCUPA
        HERENCIA
        
        POLIFORFIMO SE ADAPTA A LA ULTIMA INTANCIA DAD
        
        UN HIJO SE PUEDE ADAPTAR AL PADRE
        UPCASTING 
            
        */
       
       FiguraGeometrica figura = new Rectangulo("Rectangulo");
       figura.dibujar();
    }
   
}
