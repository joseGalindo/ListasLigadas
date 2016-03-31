package mx.unam.fciencias;

/**
 *
 * @author José Cruz Galindo Martínez
 */
public class Celda<T> {
    
    private T valor;
    private Celda siguiente;
    private Celda anterior;

    public Celda(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Celda getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Celda siguiente) {
        this.siguiente = siguiente;
    }

    public Celda getAnterior() {
        return anterior;
    }

    public void setAnterior(Celda anterior) {
        this.anterior = anterior;
    }
    
    
}
