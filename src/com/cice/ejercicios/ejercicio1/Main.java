package com.cice.ejercicios.ejercicio1;
import java.util.Scanner;

//Crear un programa que de todas las cadenas de caracteres suministradas desde la línea de comandos al iniciar la ejecución del programa, nos muestre la cadena de mayor longitud.

public class Main {
    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Indica cuántas cadenas de caracteres vas a introducir: ");
        int nCadenas = leerEntero();
        String cadenas[] = leerCadenasIntroducidas(nCadenas);
        int m = mayorCadena(cadenas);
        System.out.println("La mayor ha sido la cadena número "+(1+m)+"\n\""+cadenas[m]+"\"");

    }

    private static String leerCadena() {
        return leerConsola.nextLine();
    }

    private static int leerEntero() {
        int salida = leerConsola.nextInt();
        leerConsola.nextLine();
        return salida;
    }

    private static String[] leerCadenasIntroducidas(int tamano) {
        String[] salida = new String[tamano];
        for(int i=0; i<tamano; i++) {
            System.out.print("Por favor, introduce el valor de la posición "+(i+1)+": ");
            salida[i] = leerCadena();
            System.out.println();
        }
        return salida;
    }

    private static int mayorCadena (String[] cadenas) {
        int aux = cadenas[0].length();
        int salida = 0;
        for(int i=1; i<cadenas.length; i++) {
            if (aux < cadenas[i].length()) {
                aux = cadenas[i].length();
                salida = i;
            }
        }
        return salida;
    }

    //Alternativa con foreach visto en clase

    private static String mayorCadenaAlt (String[] cadenas) {
        String salida = "";
        int longitud = 0;
        for(String cadena : cadenas) {
            if (longitud < cadena.length()) {
                salida = cadena;
                longitud = cadena.length();
            }
        }
        return salida;
    }
}
