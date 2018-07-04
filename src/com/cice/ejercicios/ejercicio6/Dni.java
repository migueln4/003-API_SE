package com.cice.ejercicios.ejercicio6;

import java.util.Objects;
import java.util.Random;

public class Dni {
    private String numero;
    static final char[] LETRAS_DNI = {'t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};

    public Dni(String numero) {
        this.numero = numero;
    }

    public Dni() {
        super();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dni)) return false;
        Dni dni = (Dni) o;
        return this.numero.equals(dni.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumero());
    }

    public boolean dniValido() {
        String letra;
        boolean respuesta;
        if(this.numero.length() != 9 || !Character.isLetter(this.numero.charAt(8)))
            respuesta = false;
        else {

            letra = (this.numero.substring(8)).toUpperCase();

            if (numerosValidos() && letraDni().equals(letra)) {
                respuesta = true;
                corregirDNI();
            } else
                respuesta = false;
        }
        return respuesta;
    }

    private void corregirDNI() {
        String letraAMayusculas = (this.numero.substring(8)).toUpperCase();
        StringBuilder nuevaCadena = new StringBuilder(this.numero);
        nuevaCadena.replace(8,9,letraAMayusculas);
        setNumero(nuevaCadena.toString());
    }

    private boolean numerosValidos() {
        boolean respuesta;
        String n = "";
        String dni = "";
        String[] todosNumeros = {"0","1","2","3","4","5","6","7","8","9"};
        for (int i = 0; i<this.numero.length()-1;i++) {
            n = this.numero.substring(i,i+1);
            for(int j = 0; j<todosNumeros.length; j++) {
                if(n.equals(todosNumeros[j]))
                    dni += todosNumeros[j];
            }
        }
        if(dni.length() != 8)
            respuesta = false;
        else
            respuesta = true;
        return respuesta;
    }

    private String letraDni() {
        int dni = Integer.parseInt(this.numero.substring(0,8));
        int resto = dni % 23;
        String letra = (Character.toString(LETRAS_DNI[resto])).toUpperCase();
        return letra;
    }

    public void dniAleatorio() {
        Random r = new Random();
        String nuevoDni = "";
        for(int i = 0; i<9;i++)
            nuevoDni += Integer.toString(r.nextInt(10));
        char letra = obtenerLetra(Integer.parseInt(nuevoDni));
        String letraString = Character.toString(letra);
        nuevoDni += letraString.toUpperCase();
        setNumero(nuevoDni);
    }

    private static char obtenerLetra(int n) {
        int resto = n%23;
        return LETRAS_DNI[resto];
    }
}
