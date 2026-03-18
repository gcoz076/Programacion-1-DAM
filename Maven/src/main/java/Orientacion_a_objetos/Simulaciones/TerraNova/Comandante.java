package Orientacion_a_objetos.Simulaciones.TerraNova;

import java.util.Objects;

public class Comandante {

    private String dni;
    private String nombre;
    private Rango rango;

    public Comandante(String dni, String nombre, Rango rango) {
        this.dni = dni;
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    // Dos comandantes son iguales si tienen el mismo DNI
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comandante)) return false;
        Comandante that = (Comandante) o;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Comandante{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rango=" + rango +
                '}';
    }
}
