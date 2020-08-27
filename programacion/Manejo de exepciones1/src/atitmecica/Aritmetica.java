
package atitmecica;

import exepciones.OperacionExepcion;

public class Aritmetica {
    
    public static int division(int numerador, int denominador)
            throws OperacionExepcion{
        if(denominador == 0){
            throw new OperacionExepcion("Division entre cero");         
        }
        return numerador/denominador;
    }
    
}
