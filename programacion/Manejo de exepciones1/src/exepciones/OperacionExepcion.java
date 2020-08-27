
package exepciones;

//public class OperacionExepcion extends Exception{// clase padre
public class OperacionExepcion extends RuntimeException{ // clase hijo
    public OperacionExepcion(String mensaje){
        super(mensaje);
    }
}
