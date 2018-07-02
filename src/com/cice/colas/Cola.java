package com.cice.colas;
import java.util.PriorityQueue;

public class Cola {
    public static void main(String[] args) {
        PriorityQueue<Integer> listaNumeros = new PriorityQueue<>();

        listaNumeros.add(15);
        listaNumeros.add(50);
        listaNumeros.add(-1);
        listaNumeros.add(7);
        listaNumeros.add(90);

        for(int n : listaNumeros) {
            System.out.println(n);
        }

        PriorityQueue<String> listaPalabras = new PriorityQueue<>();

        listaPalabras.add("Perro");
        listaPalabras.add("Ratón");
        listaPalabras.add("Conejo");
        listaPalabras.add("Oso");
        listaPalabras.add("XXXX");
        listaPalabras.add("Avestruz");
        listaPalabras.add("AAAA");
        listaPalabras.add("CCCC");


        for(String p : listaPalabras) {
            System.out.println(p);
        }

        while(listaNumeros.size()>0) {
            System.out.println(listaNumeros.poll());
        }

        for(int i = 0; listaPalabras.size()>i;) {
            System.out.println(listaPalabras.poll());
        }
    }
}
