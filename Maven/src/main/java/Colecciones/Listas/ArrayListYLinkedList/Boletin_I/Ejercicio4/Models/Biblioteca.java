package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Exception.BibliotecaException;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Models.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> inventario = new ArrayList<>();

    public Biblioteca() {
    }

    public List<Libro> getInventario() {
        return inventario;
    }

    public void agregarLibro(Libro l) {
        System.out.println("Agregando libro al inventario...");

        if (!inventario.contains(l)) {
            inventario.add(l);
            System.out.println("Libro agregado correctamente");
        } else {
            System.out.println("El libro ya está registrado en el inventario");
        }
    }

    public void prestarEjemplar(Libro l) throws BibliotecaException {

        if (!inventario.contains(l)) {
            throw new BibliotecaException("El libro no está en el inventario");
        }

        System.out.println("Prestando libro...");
        l.prestar();
        System.out.println("Préstamo realizado");
    }

    public void devolverEjemplar(Libro l) throws BibliotecaException {

        if (!inventario.contains(l)) {
            throw new BibliotecaException("El libro no está en el inventario");
        }

        System.out.println("Devolviendo libro...");
        l.devolver();
        System.out.println("Devolución realizada");
    }

    public void prestarPres(LibroP l, Usuario u, RepoPrestamo rp){
        System.out.println("Generando prestamos...");
        Prestamo p1 = new Prestamo(l, u);
        System.out.println("Agregando prestamos...");
        rp.agregarPres(p1);
        System.out.println("Prestamo agregado");
    }

    public void mostrarInventario() {
        for (Libro l : inventario) {
            System.out.println(l);
        }
    }

    public void buscarLibro(String texto) {
        for (Libro l : inventario) {
            if (l.getTitulo().toLowerCase().contains(texto.toLowerCase()) ||
                    l.getAutor().toLowerCase().contains(texto.toLowerCase())) {

                System.out.println(l);
            }
        }
    }

    public void mostrarDetalle(Libro l) throws BibliotecaException {
        if (!inventario.contains(l)) {
            throw new BibliotecaException("El libro no está en el inventario");
        }

        System.out.println(l.infoCompleta());
    }
}