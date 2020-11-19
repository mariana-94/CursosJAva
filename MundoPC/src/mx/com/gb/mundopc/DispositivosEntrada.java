
package mx.com.gb.mundopc;

public class DispositivosEntrada {
    
    protected String tipoEntrada;
    protected String marca;
    
    public DispositivosEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivosEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
    
    
}
