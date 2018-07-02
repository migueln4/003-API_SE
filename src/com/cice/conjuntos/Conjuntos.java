package com.cice.conjuntos;

import java.util.HashSet;

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



    }
}
