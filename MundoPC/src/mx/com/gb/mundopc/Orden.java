
package mx.com.gb.mundopc;

public class Orden {
    
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAXCOMPUTADORAS= 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAXCOMPUTADORAS];
    }
    
    
    public void agregarComputadoras(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAXCOMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Excede del numero de elementos");
        }
    }
    
    public void mostrarORden(){
        System.out.println("Numero orden: " + this.idOrden);
        System.out.println("Computadoras");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
    
    
    
    
    
}
