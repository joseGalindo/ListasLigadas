package mx.unam.fciencias;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        
        ListaLigada<String> lista = new ListaLigada();
        System.out.println("Tamano inicial: " + lista.longitud());
        lista.agregar("Uno");
        System.out.println("Tamano de la lista: " + lista.longitud());
        lista.agregar("Dos");
        System.out.println("Tamano de la lista: " + lista.longitud());
        lista.agregar("Tres");
        System.out.println("Tamano de la lista: " + lista.longitud());
        lista.agregar("Cuatro");
        System.out.println("Tamano de la lista: " + lista.longitud());
        
        System.out.println(lista.obtener(3));
        System.out.println(lista.obtener(4));
        
    }
}
