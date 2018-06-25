package com.cice.envoltorios;
import java.util.Scanner;

public class Main {
    static Scanner leerConsola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        String a = leerCadena();
        System.out.print("Ahora, introduce el segundo número: ");
        String b = leerCadena();
        int numero = Integer.parseInt(a);
        int numero2 = Integer.parseInt(b);
        System.out.println("-------------------\nSUMAMOS\n"+a+" + "+b+" = "+(numero+numero2));
        varianteDouble(a,b);
    }

    private static void varianteDouble(String a, String b) {
        double n = Double.parseDouble(a);
        double m = Double.parseDouble(b);
        System.out.println("-------------------\nSUMA DE NÚMEROS REALES\n"+n+" + "+m+" = "+(n+m));
    }

    private static String leerCadena() {
        return leerConsola.nextLine();
    }
}
