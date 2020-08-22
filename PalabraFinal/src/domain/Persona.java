
package domain;

public  class Persona {
    
    public final static int MI_COSNTANTE = 1;//se define una constante
    
    private String nombre;
    
   

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public final void imprimir(){
        System.out.println("Metodo imprimir");
    }
    
}
