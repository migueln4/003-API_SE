package com.cice.ejercicios.ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;

public class VersionMenor {

    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros = introducirNumeros(listaNumeros);
        imprimirDatos(listaNumeros);
    }

    public static void imprimirDatos(ArrayList<Integer> listaNumeros) {
        System.out.println("Esta es la lista de números introducida: ");
        for(int i=0;i<listaNumeros.size();i++) {
            System.out.println("· "+listaNumeros.get(i));
        }
        System.out.println("El mayor de todos es: "+maxNum(listaNumeros));
        System.out.println("El menor de todos es: "+minNum(listaNumeros));
        System.out.println("La media es: "+calcularMedia(listaNumeros));

    }

    public static double calcularMedia (ArrayList<Integer> enteros) {
        double suma = 0;
        for(int i=0;i<enteros.size();i++) {
            suma += enteros.get(i);
        }
        return suma/enteros.size();
    }

    private static int maxNum(ArrayList<Integer> enteros) {
        int aux = enteros.get(0);
        for(int i=1;i<enteros.size();i++) {
            if(aux < enteros.get(i)) {
                aux = enteros.get(i);
            }
        }
        return aux;
    }

    private static int minNum(ArrayList<Integer> enteros) {
        int aux = enteros.get(0);
        for(int i=1;i<enteros.size();i++) {
            if(aux > enteros.get(i)) {
                aux = enteros.get(i);
            }
        }
        return aux;
    }

    private static ArrayList<Integer> introducirNumeros(ArrayList<Integer> listaNumeros) {
        for(int i=0;i<5;i++) {
            System.out.print("Introduce el número de la posición "+(i+1)+" ");
            listaNumeros.add(leerEntero());
        }
        return listaNumeros;
    }

    private static int leerEntero() {
        return leerConsola.nextInt();
    }
}
