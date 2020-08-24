
package domain;

public class Rectangulo extends FiguraGeometrica {
    
   public Rectangulo(String tipoFigura){
       super(tipoFigura);
   }
   
   
  
   @Override
   public void dibujar(){
       System.out.println("Se impirme un:" + this.getClass().getSimpleName());  
   }
}
