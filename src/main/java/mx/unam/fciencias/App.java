package mx.unam.fciencias;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        
//        ListaLigada<String> lista = new ListaLigada();
//        System.out.println("Tamano inicial: " + lista.longitud());
//        lista.agregar("Uno");
//        System.out.println("Tamano de la lista: " + lista.longitud());
//        lista.agregar("Dos");
//        System.out.println("Tamano de la lista: " + lista.longitud());
//        lista.agregar("Tres");
//        System.out.println("Tamano de la lista: " + lista.longitud());
//        lista.agregar("Cuatro");
//        System.out.println("Tamano de la lista: " + lista.longitud());
//        
//        System.out.println(lista.obtener(3));
//        
//        lista.eliminar("Uno");
//        System.out.println("Tamano de la lista: " + lista.longitud());
//        
//        System.out.println(lista.toString());
//        
//        lista.agregarInicio("Principio");
//        System.out.println(lista.toString());

        Pila<String> pila = new Pila<String>();
        pila.push("cuatro");
        pila.push("tres");
        pila.push("dos");
        pila.push("uno");
        
        System.out.println(pila.toString());
        
    }
}
