package Basicos;
public class Promedio{
 public static void main(String args[]){
   
   int matematicas=5,biologia=5,quimica=5,promedio=0;

    promedio=(matematicas+biologia+quimica)/3;

    if(promedio>=6){
      System.out.println("El alumno aprobo y su promedio es "+promedio);
    }else{
      System.out.println("El alumno reprobo y su promedio es "+promedio);
    }

    
   
  

 }
}