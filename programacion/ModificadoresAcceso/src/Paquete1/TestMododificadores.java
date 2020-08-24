
package Paquete1;

import Paquete1.Clase1;
import Paquete1.ClaseHija;



public class TestMododificadores {
    
    public static void main(String[] args) {
        
//        Clase1 cla1 = new Clase1();
//        System.out.println("clase 1 =" +cla1.atributoPublico);
//        cla1.MetodoPublico();

          //Clase1 cla1 = new Clase1("Publico");
          //System.out.println("clase 1 =" +cla1.);
          //        cla1.MetodoPublico();
          
//          ClaseHija clah = new ClaseHija();
//          System.out.println("Clase1= " + clah);


        Clase1 cla1 = new Clase1("publico");
        cla1.setAtributPrivado("Cambio");
        System.out.println("clase =1" +  cla1.getAtributPrivado());
       
//        cla1.atributoDefault = "cambio desde la prueba";
//        System.out.println("clase 1 atributo default = " + cla1.atributoDefault);
//        cla1.MetodoDefault();
        
        

    }
}
