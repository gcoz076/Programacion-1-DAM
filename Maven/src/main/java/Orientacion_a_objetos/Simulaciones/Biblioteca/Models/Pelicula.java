package Orientacion_a_objetos.Simulaciones.Biblioteca.Models;

public class Pelicula extends ElementoMultimedia {

    private int duracionMinutos;

    public Pelicula(String id, String ubicacion, int unidades,
                    String nombre, String genero, int duracion) {
        super(id, ubicacion, unidades, nombre, genero);
        this.duracionMinutos = duracion;
    }

    public int getDuracion() {
        return duracionMinutos;
    }
}
