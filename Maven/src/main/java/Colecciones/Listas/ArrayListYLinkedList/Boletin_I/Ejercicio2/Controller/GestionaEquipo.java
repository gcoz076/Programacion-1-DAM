package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Controller;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Models.*;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Exception.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GestionaEquipo {
    public static void main(String[] args) {

        try {
            Alumno a1 = new Alumno("Juan", "111");
            Alumno a2 = new Alumno("Ana", "222");
            Alumno a3 = new Alumno("Luis", "333");

            Equipo futbol = new Equipo("Futbol");
            Equipo basket = new Equipo("Basket");

            futbol.aniadirAlumno(a1);
            futbol.aniadirAlumno(a2);

            basket.aniadirAlumno(a2);
            basket.aniadirAlumno(a3);

            System.out.println("Equipo Futbol:");
            futbol.muestraAlumnos();

            System.out.println("\nEquipo Basket:");
            basket.muestraAlumnos();

            System.out.println("\nUnion:");
            Equipo union = futbol.unionEquipo(basket);
            union.muestraAlumnos();

            System.out.println("\nIntersección:");
            Equipo inter = futbol.interseccionEquipo(basket);
            inter.muestraAlumnos();

        } catch (DeportesException e) {
            System.out.println(e.getMessage());
        }
    }
}
