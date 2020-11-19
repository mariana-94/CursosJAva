
package domain;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersona;
    
    static{//es lo prirmero que se ejecutara de la clase y que sea estatico y antes del constructor,solo 
        //una vez se ejecuta
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }
    
    {//contexto dinamamico,se ejecuta antes del contructor
        //se ejecuta cada vez que se crea un onjeto
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del contuctor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

   
    
    
    
}
