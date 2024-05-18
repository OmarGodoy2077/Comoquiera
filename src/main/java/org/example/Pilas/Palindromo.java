package org.example.Pilas;
import java.text.Normalizer;
import java.util.Stack;

public class Palindromo {
    private static String normalizar(String cadena) {
        // Convertir a minúsculas
        String temp = cadena.toLowerCase();
        // Eliminar espacios
        temp = temp.replaceAll("\\s", "");
        // Eliminar acentos y tildes
        temp = Normalizer.normalize(temp, Normalizer.Form.NFD);
        temp = temp.replaceAll("[^\\p{ASCII}]", "");
        return temp;
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaNormalizada = normalizar(cadena);
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadenaNormalizada.length(); i++) {
            pila.push(cadenaNormalizada.charAt(i));
        }

        String cadenaInvertida = "";
        while (!pila.isEmpty()) {
            cadenaInvertida += pila.pop();
        }

        return cadenaInvertida.equals(cadenaNormalizada);
    }
}