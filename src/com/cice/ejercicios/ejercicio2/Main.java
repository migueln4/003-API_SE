package com.cice.ejercicios.ejercicio2;

//Crear un programa que nos muestre el número de vocales existentes en una cadena de caracteres dada.

public class Main {

    public static void main(String[] args) {
        String cadena = "Esta es una cadena de ejemplo que tiene muchas vocales";

        System.out.println("La cadena introducida tiene "+contarVocales(cadena)+" vocales.");
    }

    private static int contarVocales (String cadena) {
        int salida = 0;
        for (int i=0; i<cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    salida++;
                    break;
            }
        }
        return salida;
    }
}
