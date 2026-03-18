package Orientacion_a_objetos.Simulaciones.Biblioteca.Models;

public class Juego extends ElementoMultimedia {

    private int numeroFases;

    public Juego(String id, String ubicacion, int unidades,
                 String nombre, String genero, int fases) {
        super(id, ubicacion, unidades, nombre, genero);
        this.numeroFases = fases;
    }

    public int getNumeroFases() {
        return numeroFases;
    }
}
