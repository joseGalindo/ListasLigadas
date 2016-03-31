package mx.unam.fciencias;

/**
 *
 * @author José Cruz Galindo Martínez
 */
public interface Lista<T> {
    
    public boolean esVacia();
    public int longitud();
    public void eliminar(T elemento);
    public void agregar(T elemento);
    public boolean contiene(T elemento);
    public T obtener(int posicion);
    public void limpiar();
    
}
