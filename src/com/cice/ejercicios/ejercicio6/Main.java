package com.cice.ejercicios.ejercicio6;

//Al iniciarse el programa debe mostrar el siguiente menú en el que el usuario debe elegir una opción.

/*
1. Añadir contacto
2. Eliminar contacto
3. Mostrar contactos
4. Salir
 */

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    static final Scanner LEER_CONSOLA = new Scanner(System.in);
    static final int[] OPCIONES = {1, 2, 3, 4};
    static final Hashtable<String,String> LISTA_CONTACTOS = new Hashtable<>();


    public static void main(String[] args) {
        inicio();
    }

    private static void inicio() {
        abrirMenu();
        int opcion = leerEntero();
        while (!opcionValida(opcion)) {
            abrirMenu();
            opcion = leerEntero();
        }
        ejecutarMenu(opcion);
    }

    private static void ejecutarMenu(int opcion) {
        switch (opcion) {
            case 1:
                anadirContacto();
                break;
            case 2:
                //Eliminar contacto
                break;
            case 3:
                //Mostrar contactos
                break;
            case 4:
                //Salir
                break;
            default:
                inicio();
                break;
        }
    }

    private static void anadirContacto() {
        System.out.print("Introduce el DNI del nuevo contacto: ");
        String dni = leerString();//Estaría guay hacer un dniValido, por ejemplo. --> ¿También compruebo que ya esté?
        System.out.print("Introduce ahora el nombre de la persona: ");
        String nombre = leerString();
        LISTA_CONTACTOS.put(dni,nombre);
        System.out.println("La lista tiene ahora "+LISTA_CONTACTOS.size()+" elementos.");
        inicio();
    }

    private static boolean opcionValida(int n) {
        boolean salida = false;
        for (int dato : OPCIONES) {
            if (dato == n) {
                salida = true;
            }
        }
        return salida;
    }

    private static void abrirMenu() {
        System.out.println("Por favor, introduce la opción que quieras hacer:\n"+
                "\t1. Añadir contacto\n"+
                "\t2. Eliminar contacto\n"+
                "\t3. Mostrar contactos\n"+
                "\t4. Salir\n");
    }

    private static int leerEntero() {
        int n = LEER_CONSOLA.nextInt();
        LEER_CONSOLA.nextLine();//Tiene que ser así para que lea el salto de línea que se introduce cuando se lee un entero.
        return n;
    }

    private static String leerString() {
        return LEER_CONSOLA.next();
    }

}
