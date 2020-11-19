
package test;

import domain.*;

public class TestIntanceOf {
    
    public static void main(String[] args) {
  
    
       Empleado empleado = new Empleado("Kilian",5000);
      //empleado = new Gerente("David",1000,"Sistemas");
       determinarTipo(empleado);
      
    }
  
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente ){
            System.out.println("Es de tipo Gerente");
            System.out.println(((Gerente) empleado).getDepartamento());//una linea
                Gerente gerente = (Gerente)empleado;
                System.out.println("Gerente= " + gerente.getDepartamento());
        }
        else if( empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado =" + empleado.getNombre());
        }
        else if( empleado instanceof Object){
            System.out.println("Es un Objeto");
            
        }
    }
    
    
    
}
