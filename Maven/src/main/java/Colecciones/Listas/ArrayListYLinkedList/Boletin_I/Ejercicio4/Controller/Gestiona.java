import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Exception.BibliotecaException;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models.*;

public class Gestiona {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        RepoPrestamo repo = new RepoPrestamo();

        Usuario u1 = new Usuario("Juan", "123A");
        Usuario u2 = new Usuario("Ana", "456B");

        LibroP l1 = new LibroP("Java Básico", "Autor1", "Programación", 2020, 2);
        LibroP l2 = new LibroP("Python Avanzado", "Autor2", "Programación", 2021, 1);

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);

        System.out.println("\n--- INVENTARIO ---");
        biblioteca.mostrarInventario();

        System.out.println("\n--- PRÉSTAMOS ---");

        // Usas tu método
        biblioteca.prestarPres(l1, u1, repo);
        biblioteca.prestarPres(l1, u2, repo);
        biblioteca.prestarPres(l2, u1, repo);

        System.out.println("\n--- LISTA DE PRÉSTAMOS ---");
        repo.mostrarPrestamos();

        System.out.println("\n--- BUSCAR PRÉSTAMO ---");

        Prestamo p = repo.buscarPrestamo(l1, u1);

        if (p != null) {
            System.out.println("Encontrado: " + p);
        } else {
            System.out.println("No encontrado");
        }

        System.out.println("\n--- DEVOLUCIÓN ---");

        try {
            repo.devolverPrestamo(p);
        } catch (BibliotecaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- PRÉSTAMOS DESPUÉS ---");
        repo.mostrarPrestamos();

        System.out.println("\n--- INVENTARIO FINAL ---");
        biblioteca.mostrarInventario();
    }
}