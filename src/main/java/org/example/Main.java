package org.example;

import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> palabras = new LinkedList<>();

        // Agregar 15 palabras a la cola
        palabras.add("Aérea");
        palabras.add("Anita lava la tina");
        palabras.add("A man, a plan, a canal, Panama");
        palabras.add("No 'x' in Nixon");
        palabras.add("12321");
        palabras.add("¿Acaso hubo búhos acá?");
        palabras.add("La ruta natural");
        palabras.add("Somos o no somos");
        palabras.add("Se van sus naves");
        palabras.add("Dábale arroz a la zorra el abad");
        palabras.add("Yo hago yoga hoy");
        palabras.add("A ti no, bonita");
        palabras.add("Isaac no ronca así");
        palabras.add("Saoko de casas; sacas de Ko a Sa");
        palabras.add("Amó la paloma");

        // Verificar cada palabra si es un palíndromo
        while (!palabras.isEmpty()) {
            String palabra = palabras.poll();
            if (Palindromo.esPalindromo(palabra)) {
                System.out.println(palabra + " es un palíndromo");
            } else {
                System.out.println(palabra + " no es un palíndromo");
            }
        }
    }
}

class Palindromo {
    public static boolean esPalindromo(String palabra) {
        // Normalizar palabra: eliminar acentos y convertir a minúsculas
        String normalized = Normalizer.normalize(palabra, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Comprobar si la palabra es un palíndromo
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
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


