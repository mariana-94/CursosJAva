
package mx.com.gb.mundopc.test;
import mx.com.gb.mundopc.*;

public class TestMundoPC {
    
    public static void main(String[] args) {
        
        Raton raton = new Raton("raton","DELL");
        Teclado teclado = new Teclado("teclado","HP");
        Monitor monitor = new Monitor("Asus",13.5);
        Computadora comptadora = new Computadora("HUAWEI",monitor,teclado,raton);
        
        
        Raton raton2 = new Raton("raton2","DELL2");
        Teclado teclado2 = new Teclado("teclado2","HP2");
        Monitor monitor2 = new Monitor("Asus2",17);
        Computadora comptadora2 = new Computadora("HUAWEI2",monitor2,teclado2,raton2);
        
        
        Raton raton3 = new Raton("raton3","DELL3");
        Teclado teclado3 = new Teclado("teclad3o","HP3");
        Monitor monitor3 = new Monitor("Asus3",13.5);
        Computadora comptadora3 = new Computadora("HUAWEI3",monitor3,teclado3,raton3);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadoras(comptadora);
        orden1.agregarComputadoras(comptadora2);
        orden1.agregarComputadoras(comptadora3);
        
        orden1.mostrarORden();
        
    }
}
