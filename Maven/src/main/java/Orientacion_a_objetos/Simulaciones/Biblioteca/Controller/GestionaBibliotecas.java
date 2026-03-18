package Orientacion_a_objetos.Simulaciones.Biblioteca.Controller;

import Orientacion_a_objetos.Simulaciones.Biblioteca.Models.*;

public class GestionaBibliotecas {

    public static void main(String[] args) {

        // Creamos un ejemplo de cada tipo (todo en una línea)
        Libro libro = new Libro("L1", "Estanteria A", 3, "Cervantes", "Anaya", "Novela");
        Pelicula pelicula = new Pelicula("P1", "Zona Multimedia", 2, "Inception", "Ciencia Ficcion", 148);
        Audio audio = new Audio("A1", "Zona Audio", 4, "Thriller", "Pop", 42);
        Juego juego = new Juego("J1", "Zona Juegos", 1, "Zelda", "Aventura", 12);

        // Creamos tabla (array) de recursos
        Recurso[] recursos = new Recurso[4];

        recursos[0] = libro;
        recursos[1] = pelicula;
        recursos[2] = audio;
        recursos[3] = juego;

        // Usamos sus métodos
        for (int i = 0; i < recursos.length; i++) {
            System.out.println("ID: " + recursos[i].getIdentificador());
            System.out.println("Disponible: " + recursos[i].estaDisponible());
            System.out.println("Dias de prestamo: " + recursos[i].getDevuelveDiasPrestamo());

            // Hacemos un préstamo
            recursos[i].prestar();
            System.out.println("Disponible tras prestar: " + recursos[i].estaDisponible());

            System.out.println("---------------------------");
        }

        // Usamos métodos específicos
        System.out.println("Duracion pelicula: " + pelicula.getDuracion());
        System.out.println("Duracion audio: " + audio.getDuracion());
        System.out.println("Numero de fases del juego: " + juego.getNumeroFases());
    }
}
