package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Controller;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Models.*;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Exception.*;

import java.util.Scanner;

public class GestionaBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--- MENÚ BIBLIOTECA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Mostrar detalle de un libro");
            System.out.println("6. Buscar libro");
            System.out.println("7. Salir");

            try {
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Género: ");
                        String genero = sc.nextLine();

                        System.out.print("Año: ");
                        int anio = sc.nextInt();

                        System.out.print("Número de ejemplares: ");
                        int ejemplares = sc.nextInt();
                        sc.nextLine();

                        Libro libro = new Libro(titulo, autor, genero, anio, ejemplares);
                        biblioteca.agregarLibro(libro);
                        break;

                    case 2:
                        System.out.print("Título del libro a prestar: ");
                        String tPrestar = sc.nextLine();

                        Libro libroPrestar = buscarPorTitulo(biblioteca, tPrestar);
                        biblioteca.prestarEjemplar(libroPrestar);
                        break;

                    case 3:
                        System.out.print("Título del libro a devolver: ");
                        String tDevolver = sc.nextLine();

                        Libro libroDevolver = buscarPorTitulo(biblioteca, tDevolver);
                        biblioteca.devolverEjemplar(libroDevolver);
                        break;

                    case 4:
                        biblioteca.mostrarInventario();
                        break;

                    case 5:
                        System.out.print("Título del libro: ");
                        String tDetalle = sc.nextLine();

                        Libro libroDetalle = buscarPorTitulo(biblioteca, tDetalle);
                        biblioteca.mostrarDetalle(libroDetalle);
                        break;

                    case 6:
                        System.out.print("Buscar por título o autor: ");
                        String texto = sc.nextLine();

                        biblioteca.buscarLibro(texto);
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } catch (BibliotecaException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida");
                sc.nextLine(); // limpiar buffer
                opcion = 0;
            }

        } while (opcion != 7);
    }

    private static Libro buscarPorTitulo(Biblioteca b, String titulo) throws BibliotecaException {
        for (Libro l : b.getInventario()) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        throw new BibliotecaException("El libro no está en el inventario");
    }
}
