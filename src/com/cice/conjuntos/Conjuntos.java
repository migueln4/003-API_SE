package com.cice.conjuntos;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos {

    public static void main(String[] args) {

        HashSet<String> lista = new HashSet<>();

        lista.add("Plastidécor");
        lista.add("Toporrrrr");
        lista.add("Serresiete");
        lista.add("Bunny Tsukino");

        for (String palabra : lista) {
            System.out.println(palabra);
        }

        System.out.println("---------------------");

        Iterator<String> iterator = lista.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
