package Repaso;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libreria libreria = new Libreria();

        int cantidad = 0;
        String[][] libros = new String[10][10];
        libreria.menu(sc, libreria, libros, cantidad);
    }

    void menu(Scanner sc, Libreria libreria, String[][] libros, int cantidad) {
        System.out.println("==========");
        System.out.println("R. Registrar Libros");
        System.out.println("%. Mostrar libros por sexo del autor");
        System.out.println("P. Mostrar libro más barato y más caro");
        System.out.println("V. Mostrar libro más vendido");
        System.out.println("S. Salir");
        System.out.println("==========");

        System.out.println("Dime la opción: ");
        String opcion = sc.next().toUpperCase();

        while (!opcion.equals("S")) {
            switch (opcion) {
                case "R":
                    cantidad = libreria.registrarLibros(libros, sc);
                    break;
                case "%":
                    libreria.mostrarPorGenero(libros, cantidad);
                    break;
            }
            System.out.println("==========");
            System.out.println("R. Registrar Libros");
            System.out.println("%. Mostrar libros por sexo del autor");
            System.out.println("P. Mostrar libro más barato y más caro");
            System.out.println("V. Mostrar libro más vendido");
            System.out.println("S. Salir");
            System.out.println("==========");

            System.out.println("Dime la opción: ");
            opcion = sc.next().toUpperCase();
        }

    }

    int registrarLibros(String[][] libros, Scanner sc) {

        System.out.print("¿Cuántos libros quieres registrar? ");
        int cantitad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantitad; i++) {

            System.out.println("\nLibro " + (i + 1));

            System.out.print("Nombre del autor: ");
            libros[0][i] = sc.nextLine();

            System.out.print("Género (H/M/O): ");
            libros[1][i] = sc.nextLine().toUpperCase();

            System.out.print("Título del libro: ");
            libros[2][i] = sc.nextLine();

            System.out.print("Precio unitario: ");
            libros[3][i] = sc.nextLine();
        }

        return cantitad;
    }


    void mostrarPorGenero(String[][] libros, int cantitad) {

        int contadorM = 0;
        int contadorH = 0;

        for (int i = 0; i < cantitad; i++) {
            String genero = libros[1][i];

            if (genero.equals("M")) {
                contadorM++;
            } else if (genero.equals("H")) {
                contadorH++;
            }
        }

        double porcentajeM = (contadorM * 100.0) / cantitad;
        double porcentajeH = (contadorH * 100.0) / cantitad;

        System.out.println("El porcentaje de Mujeres es: " + porcentajeM + "%");
        System.out.println("El porcentaje de Hombres es: " + porcentajeH + "%");
    }
}