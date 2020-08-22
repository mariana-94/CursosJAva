
package mx.com.gm.ventas;

public class Orden {
    
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAXPRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto [Orden.MAXPRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAXPRODUCTOS){
            this.productos[contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAXPRODUCTOS);
        }    
    }
    
    public double calcularTotal(){
        
        double total = 0;
        
        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];//producto que estamos iterando en este momento
//            total += producto.getPrecio();
             total += this.productos[i].getPrecio();     
        }
         return total;     
    }//total 
    
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden : $ " + totalOrden);
        System.out.println("Productos de la Orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        
    }
    
    
    
}
