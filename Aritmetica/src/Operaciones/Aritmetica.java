
package Operaciones;

public class Aritmetica {
    //atributos
    int a,b;
    
    // constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }
    
    public Aritmetica(int a,int b){
        System.out.println("Ejecutando Constructor con Argumentos");
        this.a = a;
        this.b = b;
        
    }
    
    //metodos
    
    public void Sumar(){
        
       int resultado = this.a + this.b;
        
        System.out.println("resultado = " + resultado);
    }
       
    //REGRESA UN VALOR
    public int SumarConRetorno(){
//        int resultado = a + b;
//        return resultado;

           return this.a + this.b;
    }
    
    public int SumarConArgumento(int a,int b){
     
        this.a = a;//el argumento a se asigna al atributo this.a
        this.b = b;//el argumento b se asigna al atributo this.b
        
        //return a + b;
        return this.SumarConRetorno();
    }
            
}
