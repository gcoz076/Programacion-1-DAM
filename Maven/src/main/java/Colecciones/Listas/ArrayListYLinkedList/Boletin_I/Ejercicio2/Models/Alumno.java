package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Models;

import java.util.Objects;

public class Alumno {
    //Atributos
    private String nombre;
    private String dni;

    //Constructor
    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
                ", DNI: " + getDni();
    }
}
