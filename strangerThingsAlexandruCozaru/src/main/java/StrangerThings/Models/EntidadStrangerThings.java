package StrangerThings.Models;

import java.util.Objects;

public abstract class EntidadStrangerThings {
    //Atributos
    private final int idEntidad;
    private String nombre;
    private double saludBase;
    private static int contador;

    //Constructores, getter y setter
    public EntidadStrangerThings(String nombre) {
        this.nombre = nombre;
        this.saludBase = 10.0;
        contador++;
        this.idEntidad = contador;
    }

    public EntidadStrangerThings(String nombre, double saludBase) {
        this.nombre = nombre;
        if (saludBase > 0) {
            this.saludBase = saludBase;
        }
        else {
            this.saludBase = 0;
        }
        contador++;
        this.idEntidad = contador;
    }

    public int getIdEntidad() {
        return idEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaludBase() {
        return saludBase;
    }

    public void setSaludBase(double saludBase) {
        this.saludBase = saludBase;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //Metodos
    public abstract double calcularDannoPotencial(int factorAmenaza);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EntidadStrangerThings that = (EntidadStrangerThings) o;
        return idEntidad == that.idEntidad;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idEntidad);
    }

    @Override
    public String toString() {
        return "[" +
                "ID: " + idEntidad +
                ", Nombre: " + nombre + '\'' +
                ", Salud: " + saludBase +
                " " + getClass().getSimpleName() +
                "]";
    }
}
