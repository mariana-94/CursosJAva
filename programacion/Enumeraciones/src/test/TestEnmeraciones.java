
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnmeraciones {
 
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        indicarDiaSemana(Dias.MIERCOLES);
        indicarDiaSemana(Dias.JUEVES);
        
        System.out.println("Continente no. 4:" + Continentes.AMERICA);
        System.out.println("No. paises en el 4to continene: " 
                + Continentes.AMERICA.getPaises());
        
         System.out.println("Continente no. 1:" + Continentes.AFRICA);
        System.out.println("No. paises en el 1er continene: " 
                + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
            break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
            break;
            
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
            break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
            break;
            
            case VIERNES:
                System.out.println("Quinto dia de la semana");
            break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
            break;
            
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
            break;
            
        }
    }
}
