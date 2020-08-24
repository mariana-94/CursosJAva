
package Paquete1;

 class Clase1 {
    
//    public String atributoPublico = "valor atributo publico
//    protected String atributoProtected = "valor atributo protected";
//         String atributoDefault = "valor atributo default";
     String atributPrivado = "valor atributo privado";
    
  
//    public Clase1(){
//        System.out.println("Contructor publico");
//    }
    
//        protected Clase1(){
//        System.out.println("Contructor protected");
//    }
         
//        Clase1(){
//        System.out.println("Contructor Default");
//    }
     
       private  Clase1(){
        System.out.println("Contructor Default");
    }
       public Clase1(String arg){
        this();
         System.out.println("Contructor publico");
    }
        
//        
//         public Clase1(String arg){
//        System.out.println("Contructor protectedddd");
//    }
    
//    public void MetodoPublico(){
//        System.out.println("Metodo publico");
//    }
        
//        public void MetodoProtected(){
//        System.out.println("Metodo protected");
//    }
                 
//         void MetodoDefault(){
//        System.out.println("Metodo Default");
//    }
          
          private void MetodoDefault(){
        System.out.println("Metodo Default");
    }

    public String getAtributPrivado() {
        return this.atributPrivado;
    }

    public void setAtributPrivado(String atributPrivado) {
        this.atributPrivado = atributPrivado;
    }
          
    
}
