
package test;

import domain.*;

public class TestSobreEscritura {
    public static void main(String[] args) {
        //SOBREESCRITURA
//        Gerente ge1 = new Gerente("David",15000,"Ventas");
//        System.out.println("Gerente1 = " + ge1.ObtenerDetalles());
    
        Empleado em1 = new Empleado("Kilian",5000);
        imprimir(em1);
        //System.out.println("Empleado 1: " + em1.ObtenerDetalles());
        
//        Gerente ge1 = new Gerente("David",1000,"Sistemas");
        em1 = new Gerente("David",1000,"Sistemas");
        //System.out.println("Gerente 1: " + ge1.ObtenerDetalles());
        imprimir(em1);
       
      

    }
  
    public static void imprimir(Empleado emple){
        String detalles = emple.ObtenerDetalles();
        System.out.println("Empleado: " + detalles);
    }
    
    
    
}
