package com.cice.ejercicios.ejercicio1;
import java.util.Scanner;

//Igual que antes, pero lo que hace es coger una cadena de caracteres, separarla por los espacios y ver cuál es la palabra más larga

public class Variante {
    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce tu cadena de caracteres ");
        String[] cadena = leerCadena().split(" ");
        int m = mayorCadena(cadena);
        System.out.println("La palabra más larga introducida es la de la posición "+(m+1)+"\n\""+cadena[m]+"\"");
    }

    private static int mayorCadena(String[] cadena) {
        int aux = 0;
        for (int i=1; i<cadena.length; i++) {
            if (cadena[aux].length() < cadena[i].length()) {
                aux = i;
            }
        }
        return aux;
    }

    private static String leerCadena() {
        return leerConsola.nextLine();
    }
}
