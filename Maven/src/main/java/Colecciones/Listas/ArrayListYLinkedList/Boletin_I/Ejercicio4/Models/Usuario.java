package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String dni;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(dni, usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
