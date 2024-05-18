package org.example;

import org.example.Pilas.Palindromo;
import org.example.Pilas.PilaLista;
import org.example.Pilas.PilasLineal;

public class Main {
    public static void main(String[] args) {
        String palabra = "Aérea";
        if (Palindromo.esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }
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


