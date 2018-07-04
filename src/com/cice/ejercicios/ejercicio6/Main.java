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
import java.util.Set;

public class Main {
    static final Scanner LEER_CONSOLA = new Scanner(System.in);
    static final int[] OPCIONES = {1, 2, 3, 4};
    static final Hashtable<Dni,String> LISTA_CONTACTOS = new Hashtable<>();


    public static void main(String[] args) {
        inicio();
    }

    private static void inicio() {
        abrirMenu();
        int opcion = Integer.parseInt(leerString());
        while (!opcionValida(opcion)) {
            abrirMenu();
            opcion = Integer.parseInt(leerString());
        }
        ejecutarMenu(opcion);
    }

    private static void ejecutarMenu(int opcion) {
        switch (opcion) {
            case 1:
                anadirContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarContactos();
                break;
            case 4:
                break;
            default:
                inicio();
                break;
        }
    }

    private static void mostrarContactos() {
        if (LISTA_CONTACTOS.size() > 0) {
            System.out.println("A continuación, se van a mostrar todos los contactos almacenados: ");
            Set<Dni> keySetContactos = LISTA_CONTACTOS.keySet();
            int i = 1;
            for (Dni clave : keySetContactos) {
                System.out.println("Contacto #" + i);
                System.out.println("\tDNI: " + clave.getNumero());
                System.out.println("\tNombre: " + LISTA_CONTACTOS.get(clave));
                i++;
            }
        }
        else {
            System.out.println("La lista está vacía actualmente.");
        }
        inicio();
    }

    private static void eliminarContacto() {
        System.out.print("Por favor, introduce el DNI del contacto que quieras eliminar: ");
        String dni = leerString();
        Dni quieroBorrar = new Dni(dni);
        if(quieroBorrar.dniValido() && LISTA_CONTACTOS.containsKey(dni))
            LISTA_CONTACTOS.remove(dni);
        else
            System.out.println("El DNI introducido no existe en el sistema.");
        inicio();
    }

    private static void anadirContacto() {
        System.out.print("Introduce el DNI del nuevo contacto: ");
        String dni = leerString();
        Dni nif = new Dni(dni);
        while(!nif.dniValido()) {
            System.out.println("Por favor, el DNI introducido no es válido o ya existe. Vuelva a intentarlo: ");
            dni = leerString();
            nif.setNumero(dni);
        }
        System.out.print("Introduce ahora el nombre de la persona: ");
        String nombre = leerString();
        LISTA_CONTACTOS.put(nif,nombre);
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

    private static String leerString() {
        return LEER_CONSOLA.next();
    }

}
