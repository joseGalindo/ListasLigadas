package mx.unam.fciencias;

import java.util.Comparator;
import mx.unam.fciencias.definition.Lista;

/**
 *
 * @author José Cruz Galindo Martínez
 * @param <T> El tipo de datos con el que trabajará la lista.
 */
public class ListaLigada<T> implements Lista<T> {

    private Celda<T> inicio;
    private int tamano;

    public ListaLigada() {
        inicio = null;
        tamano = 0;
    }

    public ListaLigada(Comparator<T> unComparador) {
        inicio = null;
        tamano = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int longitud() {
        return tamano;
    }

    public void eliminar(T elemento) {
        Celda<T> tmp = inicio;
        Celda<T> precedente = inicio;
        boolean hecho = false;
        if (inicio.getValor().equals(elemento)) {
            inicio = inicio.getSiguiente();
            hecho = true;
            tamano--;
        } else {
            tmp = tmp.getSiguiente();
            while (tmp != null) {
                if (tmp.getValor().equals(elemento)) {
                    precedente.setSiguiente(tmp.getSiguiente());
                    hecho = true;
                    tamano--;
                    break;
                }
                precedente = tmp;
                tmp = tmp.getSiguiente();
            }
        }
        if (!hecho) {
            System.out.println("No se elimino nada.");
        } 
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

    public void agregarInicio(T elemento) {
        Celda<T> nuevaCelda = new Celda<T>(elemento);
        nuevaCelda.setSiguiente(inicio);
        inicio = nuevaCelda;
        tamano++;
    }
    
    

    public boolean contiene(T elemento) {
        Celda<T> tmp = inicio;
        while (tmp != null) {
            if (tmp.getValor().equals(elemento)) {
                return true;
            }
        }
        return false;
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
    }

    public void limpiar() {
        inicio = null;
    }

    @Override
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
        sb.append(" ]");
        return sb.toString();
    }

}
