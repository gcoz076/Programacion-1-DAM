package Orientacion_a_objetos.Simulaciones.SistemaIncidencia;

import java.util.Objects;

public class Usuario {

    private String dni;
    private String nombre;
    private String departamento;

    // Constructor
    public Usuario(String dni, String nombre, String departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Getter para el nombre (lo necesitaremos en Equipo)
    public String getNombre() {
        return nombre;
    }

    // equals → dos usuarios son iguales si tienen el mismo dni
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return nombre + " - DNI: " + dni + " - Departamento: " + departamento;
    }
}

