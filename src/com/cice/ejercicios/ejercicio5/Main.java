package com.cice.ejercicios.ejercicio5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//Al iniciarse el programa debe mostrar el siguiente menú en el que el usuario debe elegir una opción.

/*
1. Nuevo número
2. Media
3. Máximo
4. Mínimo
5. Mostrar lista completa
6. Salir

 */

public abstract class Main {

    static Scanner leerConsola = new Scanner(System.in);
    static int[] opciones = {1, 2, 3, 4, 5, 6};
    static ArrayList<Double> listaNumeros = new ArrayList<>();
    static DecimalFormat df = new DecimalFormat("#,##0.00"); //Este es el formato para que salga: 5,50

    public static void main(String[] args) {
        inicio();
    }

    private static void inicio() {
        int opcion = abrirMenu();
        while (!opcionValida(opcion)) {
            opcion = abrirMenu();
        }
        ejecutarMenu(opcion);
    }

    private static void ejecutarMenu(int opcion) {
        switch (opcion) {
            case 1:
                anadirNumeroALista();
                break;
            case 2:
                calcularMedia();
                break;
            case 3:
                maxNum();
                break;
            case 4:
                minNum();
                break;
            case 5:
                imprimirLista();
                break;
            case 6:
                break;
            default:
                inicio();
                break;
        }
    }

    private static void imprimirLista() {
        if (listaNumeros.size()>0) {
            System.out.println("A continuación, se muestra la lista de números que hay guardados en la lista.");
            for (double n : listaNumeros) {
                System.out.println("· "+df.format(n));
            }
        } else {
            System.out.println("La lista está vacía.");
        }
        inicio();
    }

    private static void minNum() {
        double aux = listaNumeros.get(0);
        for (int i = 1; i < listaNumeros.size(); i++) {
            if (aux > listaNumeros.get(i)) {
                aux = listaNumeros.get(i);
            }
        }
        System.out.println("El menor de todos los números guardados es el " + df.format(aux));
        inicio();
    }

    private static void maxNum() {
        double aux = listaNumeros.get(0);
        for (int i = 1; i < listaNumeros.size(); i++) {
            if (aux < listaNumeros.get(i)) {
                aux = listaNumeros.get(i);
            }
        }
        System.out.println("El mayor de todos los números guardados es el " + df.format(aux));
        inicio();
    }

    private static void calcularMedia() {
        double suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }
        System.out.println("La media de todos los números introducidos es: " + df.format(suma / listaNumeros.size()));
        inicio();
    }

    private static void anadirNumeroALista() {
        System.out.print("Introduce el número que quieres añadir a la lista: ");
        listaNumeros.add(leerDouble());
        System.out.println("La lista tiene ahora " + listaNumeros.size() + " elementos.");
        inicio();
    }

    private static boolean opcionValida(int n) {
        boolean salida = false;
        for (int dato : opciones) {
            if (dato == n) {
                salida = true;
            }
        }
        return salida;
    }

    private static int abrirMenu() {
        System.out.println("\nPor favor, selecciona una opción:\n" +
                "\t1. Nuevo número\n" +
                "\t2. Media\n" +
                "\t3. Máximo\n" +
                "\t4. Mínimo\n" +
                "\t5. Mostrar lista completa\n" +
                "\t6. Salir");
        return leerEntero();
    }

    private static int leerEntero() {
        return leerConsola.nextInt();
    }

    private static double leerDouble() {
        return leerConsola.nextDouble();
    }

}
