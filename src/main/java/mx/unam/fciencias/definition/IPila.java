package mx.unam.fciencias.definition;

/**
 *
 * @author José Cruz Galindo Martínez
 */
public interface IPila<T> {
    
    public boolean esVacia();
    public T peek();
    public T pop();
    public void push(T elemento);
    
}
