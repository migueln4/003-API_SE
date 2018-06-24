package com.cice.ejercicios.ejercicio3;
import java.util.Scanner;

//Dada una determinada cadena de caracteres, se inserta una barra / adicional entre palabras. Además, hay que buscar las posiciones donde se encuentran los espacios para insercar el espacio adicional.

public class Main {

    static Scanner leerConsola = new Scanner(System.in);
    static int[] numeros = new int[1000]; //Un array auxiliar donde guardar las posiciones de los espacios

    public static void main(String[] args) {
        System.out.print("Por favor, escribe una cadena: ");
        StringBuilder str = new StringBuilder(leerCadena());
        buscarEspacios(str,0,0);
        imprimirArray();
        StringBuilder aux = insertarBarras(str);
        System.out.println(aux.toString());
    }

    /**
     * Una vez que se tienen las posiciones donde hay espacios, se ponen las barras en este método. Las posiciones se obtienen del array auxiliar estático de arriba.
     * @param e -> Es un StringBuilder con la cadena que se ha leído de línea de comandos
     * @return e -> El StringBuilder con las barras ya metidas.
     */

    public static StringBuilder insertarBarras (StringBuilder e) {
        for (int i=0;numeros[i] > 0;i++) {
            e.insert(numeros[i]+i,"/"); //Tengo que sumar i porque al añadir una barra con cada vuelta, aumenta también el tamaño del string y se "mueve" el espacio.
        }
        return e;
    }

    private static void imprimirArray () {
        int indice = 0;
        do {
            System.out.println("· "+numeros[indice]);
            indice++;
        } while(numeros[indice] > 0); //así controlo que no me imprima todos los ceros
    }

    /**
     * Este método recursivo es el que se encarga de meter los valores de las posiciones donde encuentra espacios en la cadena que se le ha pasado.
     * @param e -> Es el StringBuilder con el que se trabaja.
     * @param indice -> Es el índice que se va autoincrementando para ir rellenando el array estático.
     * @param posicion -> Es la posición absoluta en la que está cada espacio en el String completo
     */

    private static void buscarEspacios(StringBuilder e, int indice, int posicion) {
        if(e.indexOf(" ") > -1) { //Controlo que no haga nada si ya no encuentra espacios
            int espacio = e.indexOf(" "); //Dónde está el espacio de la cadena que le he pasado
            numeros[indice] = espacio+posicion; //Guardo el dato del espacio de la cadena que le he pasado más todas las posiciones anteriores que le he quitado a la cadena
            indice++;
            StringBuilder f = new StringBuilder(e.substring(1+espacio)); //Creo una nueva cadena a la que le quito lo que ya he leído
            buscarEspacios(f,indice,espacio+posicion+1);
        }
    }

    private static String leerCadena() {
        return leerConsola.nextLine();
    }
}
