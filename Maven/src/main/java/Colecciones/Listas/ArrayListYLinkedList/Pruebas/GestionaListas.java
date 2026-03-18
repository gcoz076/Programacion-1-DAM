package Colecciones.Listas.ArrayListYLinkedList.Pruebas;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Models.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestionaListas {
    public static void main(String[] args) {
        //Crear
        List<String> ListaArray = new ArrayList<String>();

        //Añadir
        ListaArray.add("Barcelona");
        ListaArray.add("Huelva");
        ListaArray.add("Madrid");

        //Ver si madrid está en la lista
        ListaArray.contains("Madrid");
        ListaArray.contains("Sevilla");

        //Validacion si esta, si no está lo agrega
        String cadena = "Sevilla";
        ListaArray.add(cadena);
        if (!ListaArray.contains(cadena)){
            ListaArray.add(cadena);
        } else {
            System.out.println("YA ESTÁ");
        }

        //Recorrer por elemento
        for (String elemento : ListaArray){
            System.out.println(elemento);
        }

        //Eliminar
        ListaArray.remove("Huelva");

        //Recorrer por posicion
        for (int i = 0; i < ListaArray.size(); i++) {
            System.out.println(ListaArray.get(i));
        }

        //Recorrer con iteradores
        Iterator<String> iterador = ListaArray.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }

        List<Alumno> pruebaColection = new ArrayList<Alumno>();
        Alumno ap1 = new Alumno("Sanpito", "12421351L");
        Alumno ap2 = new Alumno("Sanpeto", "23421651J");
        Alumno ap3 = new Alumno("Sanpato", "65421351F");
        Alumno ap4 = new Alumno("Sanpoto", "91516901X");

        pruebaColection.add(ap1);
        pruebaColection.add(ap2);
        pruebaColection.add(ap3);
        pruebaColection.add(ap4);

        for (Alumno a: pruebaColection){
            System.out.println(a);
        }

        List<String> cadenas = new ArrayList<String>();
        cadenas.add("Hola");
        cadenas.add("Adios");
        cadenas.add("Me Voy");

        Collections.sort(cadenas);
        System.out.println(cadenas);
    }
}
