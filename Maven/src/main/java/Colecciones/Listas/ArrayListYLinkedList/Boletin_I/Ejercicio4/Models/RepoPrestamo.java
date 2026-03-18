package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Exception.BibliotecaException;

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
}
