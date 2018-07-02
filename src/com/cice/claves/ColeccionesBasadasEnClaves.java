package com.cice.claves;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class ColeccionesBasadasEnClaves {

    /*BASADAS EN CLAVES:
    1) HASHTABLE
    2) HASHMAP
     */

    public static void main(String[] args) {
        //1)
        Hashtable<String, String> listaPersonas = new Hashtable<>();

        //Introduzco los datos
        listaPersonas.put("Profesor","Seymour Skinner");
        listaPersonas.put("Alumno","Nobita Noara");
        listaPersonas.put("Alumna","Pepper Ann");
        listaPersonas.put("Ladrón","Lupin III");

        //Voy a sacar un dato.
        String profe = listaPersonas.get("Profesor"); //Esto va a devolver un String porque he declarado que los valores son un String

        System.out.println(profe);

        int cuantasPersonas = listaPersonas.size(); //Esto me dice cuántos objetos tiene en su interior la colección

        System.out.println(cuantasPersonas);

        boolean existeGustavo = listaPersonas.contains("Gustavo"); //Ojo, que diferencia mayúsculas de minúsculas

        System.out.println(existeGustavo);

        boolean existeProfe = listaPersonas.containsKey("Profesor");

        System.out.println(existeProfe);

        listaPersonas.remove("Ladrón");

        System.out.println(listaPersonas.size());

        System.out.println("---------------------------------");

        //Accediendo a todo lo que tiene esto:

        for (String clave : listaPersonas.keySet()) {
            System.out.println("Clave:"+clave);
            System.out.println("Valor:"+listaPersonas.get(clave));
            System.out.println("--------------------------");
        }

        listaPersonas.put("Alumno","Bart Simpson"); //Esto lo que hace es machacar el valor que había anteriormente en la clave "Alumno".

        System.out.println(listaPersonas.get("Alumno"));

        System.out.println("******************************");

        for (String clave : listaPersonas.keySet()) {
            System.out.println("Clave:"+clave);
            System.out.println("Valor:"+listaPersonas.get(clave));
            System.out.println("--------------------------");
        }


        System.out.println("%%%%%%%%%%Trabajando con HashMap%%%%%%%%%%%%%%");

        //2)
        HashMap<String, String> listaNombres = new HashMap<>();

        listaNombres.put("Portero","Luis Manóplez");
        listaNombres.put("Defensa","Bruce Harper");
        listaNombres.put("Medio","Guti Hernández");
        listaNombres.put("Delantero","Roberto Sedinho");

        String portero = listaNombres.get("Portero");

        System.out.println(portero);

        //No exite el método CONTAINS en HashMap.

        boolean existeDefensa = listaNombres.containsKey("Defensa");
        boolean existeOliver = listaNombres.containsValue("Oliver Atom");

        System.out.println(existeDefensa+"\t"+existeOliver);

        Set<String> keySetNombres = listaNombres.keySet();

        for(String claveDeHashMap : keySetNombres) {
            System.out.println("Clave:"+claveDeHashMap);
            System.out.println("Valor:"+listaNombres.get(claveDeHashMap));
            System.out.println("--------------------------");
        }

    }

}
