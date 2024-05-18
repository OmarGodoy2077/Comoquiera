package org.example.Pilas;

import java.util.ArrayList;
import java.util.List;

public class PilaVector {
    private static final int TAMPILA = 49; // Tamaño de la pila.

    private int cima; // valor del elemento en la cima
    private List<Object> listaPila; // Array de objetos que representan la pila.

    public PilaVector() {
        cima = -1;
        listaPila = new ArrayList<>(TAMPILA);
    }
    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()){
            throw new Exception("Pila llena, no se pueden insertar elementos, stackOverflow");

        }
        cima++;
        listaPila.add(elemento);
    }

    public Object quitar() throws Exception {
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila Vacia (Underflow)");
        }
        aux = listaPila.remove(cima);
        cima --;
        return aux;
    }
    public boolean pilaLlena(){
        return cima == TAMPILA - 1;
    }

    public boolean pilaVacia(){
        return cima == -1;

    }
    public void limpiarPila() throws Exception {
        while (!pilaVacia())quitar();
        }

}
