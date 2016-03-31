package mx.unam.fciencias;

/**
 *
 * @author José Cruz Galindo Martínez
 */
public interface Lista<T> {
    
    public boolean esVacia();
    
    public int longitud();
    
    public void eliminar(T elemento);
    
    /**
     * Agrega un elemento al final de la lista;
     * @param elemento El elemento que deseamos agregar.
     */
    public void agregar(T elemento);
    
    public boolean contiene(T elemento);
    public T obtener(int posicion);
    public void limpiar();
    
}
