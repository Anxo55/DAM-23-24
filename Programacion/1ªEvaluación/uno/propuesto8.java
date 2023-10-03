package uno;

import java.util.Random;

// (Ejercicio de dificultad alta) Realiza un programa que genere letras aleatoriamente y determine si son vocales o 
// consonantes

import java.util.Scanner;


public class propuesto8 {
    /**
     * The main function generates random letters and determines if they are vowels or consonants, then
     * calculates and prints the percentage of vowels.
     */
    public static void main(String[] args) {
        int cantidadLetras = 1000;
        int cantidadVocales = 0; 
        
        for (int i = 0; i < cantidadLetras; i++) {
            char letra = generarLetraAleatoria();
            String tipo = determinarTipo(letra);
            
            if (tipo.equals("vocal")) {
                cantidadVocales++;
            }
            System.out.println("Letra: " + letra + " es " + tipo);
        }
        
        double porcentajeVocales = (double) cantidadVocales / cantidadLetras * 100;
        System.out.println("El porcentaje de vocales es: " + porcentajeVocales + "%");
    }

    /**
     * The function generates a random lowercase letter.
     * 
     * @return The method is returning a randomly generated lowercase letter.
     */
    public static char generarLetraAleatoria() {
        Random random = new Random();
        char letra;
        int numeroAleatorio = random.nextInt(26) + 97;
        letra = (char) numeroAleatorio;

        return letra;
    }

    /**
     * The function determines whether a given character is a vowel or a consonant.
     * 
     * @param letra The parameter "letra" is of type char and represents a single letter.
     * @return The method is returning a String that indicates whether the given character is a vowel
     * or a consonant.
     */
    public static String determinarTipo(char letra) {
        String vocales = "aeiou";

        if (vocales.contains(String.valueOf(letra))) {
            return "vocal";
        } else {
            return "consonante";
        }
    }
}