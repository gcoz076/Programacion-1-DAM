package Orientacion_a_objetos.Herencias.Anime;

import java.util.Objects;

public class Serie {
    private String nombre;
    private int numeroTemporada;
    private int numCapiyulos;
    private String autor;

    public Serie(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumCapiyulos() {
        return numCapiyulos;
    }

    public void setNumCapiyulos(int numCapiyulos) {
        this.numCapiyulos = numCapiyulos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nombre, serie.nombre) && Objects.equals(autor, serie.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nombre='" + nombre + '\'' +
                ", numeroTemporada=" + numeroTemporada +
                ", numCapiyulos=" + numCapiyulos +
                ", autor='" + autor + '\'' +
                '}';
    }
}
