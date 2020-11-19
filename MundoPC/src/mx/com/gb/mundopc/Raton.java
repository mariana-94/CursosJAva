
package mx.com.gb.mundopc;

public class Raton extends DispositivosEntrada {
    
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada,String marca){
        super(tipoEntrada,marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return this.idRaton;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}' + super.toString();
    }

    
}
