
package Operaciones;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
//        Aritmetica aritmetica1 = new Aritmetica();
//        
//        aritmetica1.a = 3 ;
//        aritmetica1.b = 2 ;
//        
//        aritmetica1.Sumar();
//        
//        //regresa un valor
//        var resultado = aritmetica1.SumarConRetorno();
//        System.out.println("resultado desde la prueba= " + resultado);
//        
//        resultado =aritmetica1.SumarConArgumento(5, 8);
//        System.out.println("resultado usando argumentos= " + resultado);
//        
//         aritmetica1.Sumar();

            //variables locales
             int a = 10, b = 2;
             
             miMetodo();
             
            Aritmetica aritmetica1 = new Aritmetica();
            System.out.println("aritmetica1 a :" + aritmetica1.a);
            System.out.println("aritmetica1 b :" + aritmetica1.b);
        
            Aritmetica aritmetica2 = new Aritmetica(5,8);
            System.out.println("aritmetica2 a :" + aritmetica2.a);
            System.out.println("aritmetica2 b :" + aritmetica2.b);
        


         
         
    }//main
    
    public static void miMetodo(){
        //la variable esta fuera del alcanze donde fue definido
        //a = 10; // es variable local de main
        System.out.println("otro metodo");
    }
    
    
}
