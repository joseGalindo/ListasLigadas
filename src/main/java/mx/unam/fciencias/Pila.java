/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.fciencias;

import mx.unam.fciencias.definition.IPila;

/**
 *
 * @author grupojaque
 */
public class Pila<T> implements IPila<T> {
    
    private final ListaLigada<T> root;
    
    public Pila() {
        root = new ListaLigada<T>();
    }

    public boolean esVacia() {
        return root.esVacia();
    }

    public T peek() {
        if (!root.esVacia()) {
            return root.obtener(0);
        }
        return null;
    }

    public T pop() {
        if (!root.esVacia()) {
            T elemen = root.obtener(0);
            root.eliminar(elemen);
            return elemen;
        }
        return null;
    }

    public void push(T elemento) {
        root.agregarInicio(elemento);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < root.longitud(); i++) {
            sb.append(root.obtener(i));
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
}
