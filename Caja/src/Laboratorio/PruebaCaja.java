
package Laboratorio;

public class PruebaCaja {
    
    public static void main(String args[]){
        
        Caja caja1 = new Caja();
        
        caja1.ancho = 1;
        caja1.alto = 2;
        caja1.profundo = 3;
        
     
        int resultado = caja1.calcularVolumenArgumentos(3, 2, 6);
        System.out.println("Resultado 1 Objeto = " + resultado);
        
        
        Caja caja2 = new Caja(4,5,6);
        resultado = caja2.calcularVolumen();
        System.out.println("Resultado 2 Objeto = " + resultado);
        
    }
}
