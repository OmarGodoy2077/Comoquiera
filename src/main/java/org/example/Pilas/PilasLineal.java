package org.example.Pilas;

public class PilasLineal {
    private static final int TAMPILA = 49; // Tamaño de la pila.

    private int cima; // valor del elemento en la cima
    private Object[] listaPila; // Array de objetos que representan la pila.

    public PilasLineal() {
        cima = -1;
        listaPila = new Object[TAMPILA];
    }
    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()){
            throw new Exception("Pila llena, no se pueden insertar elementos, stackOverflow");

        }
        //cima++;
        listaPila[++cima] = elemento;
    }

    public Object quitar() throws Exception {
        Object aux;
        if(pilaVacia()){
            throw new Exception("Pila Vacia (Underflow)");
        }
        aux = listaPila[cima];
        cima --;
        return aux;
    }
    public boolean pilaLlena(){
        return cima == TAMPILA - 1;
    }

    public boolean pilaVacia(){
        return cima == -1;

    }
    public void limpiarPila(){
        cima = -1;
    }
}
