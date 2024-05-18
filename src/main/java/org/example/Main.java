package org.example;

import org.example.Pilas.PilaLista;
import org.example.Pilas.PilasLineal;

public class Main {

    public static void palindromo() {
        PilasLineal pila = new PilasLineal();
        String palabra = "anita lava la tina";
        String palabraInvertida = "";

        //creamos la pila con la palabra
        for (int i = 0; i < palabra.length(); i++) {
            try {
                pila.insertar(palabra.charAt(i));
            } catch (Exception e) {
                System.out.println("valio mi tibio" + e.getMessage());
            }
        }

        while (!pila.pilaVacia()) {
            try {
                palabraInvertida += pila.quitar();
            } catch (Exception e) {
                System.out.println("valio mi tibio" + e.getMessage());
            }
        }
    if (palabraInvertida.equals(palabra)){
        System.out.println("Es palindromo");
    } else {
        System.out.println("No es palindromo");

    }

        }
        public static void main(String[] args) {
            palindromo();
        }




//    public static void main(String[] args) {
//        PilasLineal pila = new PilasLineal();
//
//        try{
//            pila.insertar("fuck the world");
//            pila.insertar("esta ");
//            pila.insertar("es una");
//            pila.insertar("pila");
//            while(!pila.pilaLlena()){
//                System.out.println("Elemento saliente: "+ pila.quitar());
//
//            }
//
//        } catch (Exception e){
//            System.out.println("valio mi tibio"+ e.getMessage());
//        }
//
//    }

    }
