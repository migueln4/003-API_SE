package com.cice.ejercicios.ejercicio4;
import static java.lang.Math.*;
import java.security.SecureRandom;

//Crear un programa que muestre la suma de todos los números enteros comprendidos entre dos números aleatorios generados por el propio programa. Los números aleatorios deben ser mayores de 0 y menores de 100.

public class Main {
    public static void main(String[] args) {
        int a = (int) round(random()*100);
        int b = (int) round(random()*100);
        System.out.println(a+"\t"+b);
        System.out.println(sumaIntermedios(a,b));
        alternativa();//Usando SecureRandom.
    }

    private static int sumaIntermedios(int a, int b) {
        int suma = 0;
        for (int i=min(a,b);i<=max(a,b);i++) {
            suma += i;
        }
        return suma;
    }

    private static void alternativa() {
        SecureRandom sr = new SecureRandom();
        int a = sr.nextInt(101);
        int b = sr.nextInt(101);
        System.out.println(a+"\t"+b);
        System.out.println(sumaIntermedios(a,b));
    }
}