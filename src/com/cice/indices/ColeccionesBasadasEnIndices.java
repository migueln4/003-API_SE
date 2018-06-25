package com.cice.indices;
import java.util.ArrayList;

public class ColeccionesBasadasEnIndices {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Plastidécor");
        nombres.add("Miguel");
        nombres.add("Serresiete");
        nombres.add("Pluto");
        nombres.add("Son Goku");
        //Lo siguiente da error porque todo va ordenado en base a índice.
        //nombres.add(10,"Batista");

        String nom = nombres.get(0);

        System.out.println("El primer nombre almacenado es "+nom);
        System.out.println("\n=============FOR=============");

        for(int i=0;i<nombres.size();i++) {
            System.out.println("· "+nombres.get(i));
        }

        System.out.println("\n=============FOREACH==========");

        for(String n : nombres) {
            System.out.println("- "+n);
        }

        System.out.println("\n=============QUITO EL PRIMERO=============");

        nombres.remove(0);
        System.out.println("Ahora, el primer nombres almacenado es "+nombres.get(0));

        System.out.println("\n=============METO UNO POR OTRO================");

        nombres.set(2,"Perro Muchacho");
        for(String n : nombres) {
            System.out.println("¨ "+n);
        }
    }
}