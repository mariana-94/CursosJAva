
package accesodatos;

public interface IAccesoDatos {
    
    int MAX_REGISTROS = 10;//se asigna un valor en intefaces porque no tiene constructores
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
