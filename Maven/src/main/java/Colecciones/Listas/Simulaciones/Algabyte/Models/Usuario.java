package Colecciones.Listas.Simulaciones.Algabyte.Models;

import Colecciones.Listas.Simulaciones.Algabyte.Exceptions.UserMemoryException;

import java.util.Objects;

public class Usuario {
    //Atributos
    private String nombre;
    private String contrasenia;

    //Constructor, guetter, setter
    public Usuario(String nombre, String contrasenia) throws UserMemoryException {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        if (nombre.length() >= 6 && contrasenia.matches(regex)) {
            this.nombre = nombre;
            this.contrasenia = contrasenia;
        }else {
            throw new UserMemoryException("El nombre debe tener 6 caracteres y la clave no cumple con los requisitos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() < 6){
            throw new UserMemoryException("El nombre debe tener 6 caracteres");
        }else {
            this.nombre = nombre;
        }
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //Metodos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
