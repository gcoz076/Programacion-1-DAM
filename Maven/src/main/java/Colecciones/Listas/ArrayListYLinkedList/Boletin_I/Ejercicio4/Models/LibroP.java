package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Exception.BibliotecaException;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio3.Models.EstadoLibro;

public class LibroP {
    private String titulo;
    private String autor;
    private String genero;
    private int anioLanzamiento;
    private EstadoLibro estado;
    private int ejemplaresDisponibles;
    private int ejemplaresTotales; // 👈 nuevo

    public LibroP(String titulo, String autor, String genero, int anioLanzamiento, int ejemplaresTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresTotales;
        this.estado = EstadoLibro.LIBRE;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresTotales - ejemplaresDisponibles;
    }

    public void prestar() throws BibliotecaException {
        if (ejemplaresDisponibles <= 0) {
            throw new BibliotecaException("No hay ejemplares disponibles");
        }

        ejemplaresDisponibles--;

        if (ejemplaresDisponibles == 0) {
            estado = EstadoLibro.PRESTADO;
        }
    }

    public void devolver() throws BibliotecaException {
        if (ejemplaresDisponibles == ejemplaresTotales) {
            throw new BibliotecaException("Todos los libros ya están disponibles");
        }

        ejemplaresDisponibles++;

        estado = EstadoLibro.LIBRE;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                " | Autor: " + autor +
                " | Estado: " + estado +
                " | Disponibles: " + ejemplaresDisponibles;
    }

    public String infoCompleta() {
        return "Título: " + titulo +
                " | Autor: " + autor +
                " | Género: " + genero +
                " | Año: " + anioLanzamiento +
                " | Estado: " + estado +
                " | Ejemplares disponibles: " + ejemplaresDisponibles +
                " | Ejemplares prestados: " + getEjemplaresPrestados();
    }
}