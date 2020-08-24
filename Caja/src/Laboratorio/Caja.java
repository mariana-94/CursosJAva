
package Laboratorio;

public class Caja {
    
    int ancho,alto,profundo;
    
    
    public Caja(){
        System.out.println("Constructor vacio");
    }
    
    public Caja(int ancho,int alto,int profundo){
        
        System.out.println("Ejecutando Constructor con Argumentos");
        
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        
    }
   
    public int calcularVolumen(){

        return this.ancho * this.alto * this.profundo;
    }
    
    public int calcularVolumenArgumentos(int ancho,int alto,int profundo){
     
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        
        return this.calcularVolumen();
    }
}
