package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Exception.BibliotecaException;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Models.Libro;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<LibroP> inventario = new ArrayList<>();
    private RepoPrestamo repoPrestamo;

    public Biblioteca() {
        this.inventario = new ArrayList<LibroP>();
        this.repoPrestamo = new RepoPrestamo();
    }

    public void agregarLibro(LibroP l) {
        if (!inventario.contains(l)) {
            inventario.add(l);
        }
    }

    public void prestarPres(LibroP l, Usuario u, RepoPrestamo rp){
        System.out.println("Generando prestamos...");
        Prestamo p1 = new Prestamo(l, u);
        System.out.println("Agregando prestamos...");
        rp.agregarPres(p1);
        System.out.println("Prestamo agregado");
    }

    public void prestarLibro(LibroP libro, Usuario usuario, RepoPrestamo repo) {
        try {
            if (!inventario.contains(libro)) {
                throw new BibliotecaException("El libro no está en el inventario");
            }

            libro.prestar();

            Prestamo p = new Prestamo(libro, usuario);
            repo.agregarPres(p);

            System.out.println("Préstamo realizado correctamente");

        } catch (BibliotecaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void devolverLibro(Prestamo p, RepoPrestamo repo) {
        try {
            repo.devolverPrestamo(p);
            System.out.println("Libro devuelto correctamente");

        } catch (BibliotecaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void mostrarInventario() {
        for (LibroP l : inventario) {
            System.out.println(l);
        }
    }
}