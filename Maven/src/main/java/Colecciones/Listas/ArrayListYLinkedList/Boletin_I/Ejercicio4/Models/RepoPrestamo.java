package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Exception.BibliotecaException;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RepoPrestamo {
    LinkedHashSet<Prestamo> prestamos;

    public RepoPrestamo() {
        this.prestamos = new LinkedHashSet<Prestamo>();
    }

    public LinkedHashSet<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedHashSet<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void agregarPres(Prestamo p) throws BibliotecaException{
        System.out.println("Agregando prestamo al repositorio...");
        if (!prestamos.contains(p)){
            prestamos.add(p);

            System.out.println("Prestamo agregado correctamente.");
        }else {
            throw new BibliotecaException("No es posible realizar el prestamo del libro");
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }

    public LinkedHashSet<Prestamo> buscarPorLibro(String titulo, String autor) {
        LinkedHashSet<Prestamo> prestamoFiltrado = new LinkedHashSet<Prestamo>();
        for (Prestamo p : prestamos) {
            if (p.getLibro().getTitulo().equalsIgnoreCase(titulo) && p.getLibro().getAutor().equalsIgnoreCase(autor)) {
                System.out.println(p);
                prestamoFiltrado.add(p);
            }
        }
        return prestamoFiltrado;
    }

    public Prestamo buscarPrestamo(LibroP libro, Usuario usuario) {

        Iterator<Prestamo> it = prestamos.iterator();
        Prestamo encontrado = null;
        boolean encontradoList = false;
        while (it.hasNext() && !encontradoList) {
            Prestamo p = it.next();
            if (p.getLibro().getTitulo().equalsIgnoreCase(libro.getTitulo()) &&
                    p.getLibro().getAutor().equalsIgnoreCase(libro.getAutor()) &&
                    p.getUsuario().equals(usuario)) {

                encontrado = p;
                encontradoList = true;
            }
        }

        return encontrado;
    }

    public void devolverPrestamo(Prestamo p) throws BibliotecaException {
        if (!prestamos.contains(p)) {
            throw new BibliotecaException("El préstamo no existe");
        }

        prestamos.remove(p);
        p.getLibro().devolver();
    }
}
