package mx.unam.fciencias;

/**
 *
 * @author José Cruz Galindo Martínez
 */
public class ListaLigada<T> implements Lista<T> {

    private Celda<T> inicio;
    private int tamano;

    public ListaLigada() {
        inicio = null;
        tamano = 0;
    }

    public boolean esVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int longitud() {
        return tamano;
    }

    public void eliminar(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregar(T elemento) {
        // Verificamos si es el primero
        if (inicio == null) {
            inicio = new Celda<T>(elemento);
        } else {
            Celda<T> tmp = inicio;
            while (tmp.getSiguiente() != null) {
                tmp = tmp.getSiguiente();
            }
            Celda<T> nuevaCelda = new Celda<T>(elemento);
            tmp.setSiguiente(nuevaCelda);
        }
        ++tamano;
    }

    public boolean contiene(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public T obtener(int posicion) throws IndexOutOfBoundsException {
        if (posicion < tamano) {
            int indice = 0;
            Celda<T> tmp = inicio;
            while (tmp.getSiguiente() != null) {
                if (indice == posicion) {
                    break;
                } else {
                    indice++;
                    tmp = tmp.getSiguiente();
                }
            }
            // Estoy en la ultima posicion
            return tmp.getValor();
        }
        
        throw new IndexOutOfBoundsException("La lista no es tan larga");
//        return null;
    }

    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(" ");
        Celda<T> tmp = inicio;
        while (tmp.getSiguiente() != null) {
            sb.append(tmp.getValor());
            sb.append(", ");
            tmp = tmp.getSiguiente();
        }
        sb.append(tmp.getValor());
        sb.append("]");
        return sb.toString();
    }

}
