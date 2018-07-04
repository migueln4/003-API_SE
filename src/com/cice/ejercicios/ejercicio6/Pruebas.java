package com.cice.ejercicios.ejercicio6;

import java.util.Hashtable;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dni nif = new Dni();
        nif.dniAleatorio();
        System.out.println("El DNI aleatorio generado es: "+nif.getNumero());
        System.out.print("Mete el mismo DNI: ");
        String entrada = sc.nextLine();
        Dni nif2 = new Dni(entrada);
        System.out.println("El DNI copiado es: "+nif2.getNumero());

        Hashtable<Dni,String> lista = new Hashtable<>();

        lista.put(nif,"Uno");
        //lista.put(nif2,"Dos");

        System.out.println(lista.containsKey(nif2));
    }

}
