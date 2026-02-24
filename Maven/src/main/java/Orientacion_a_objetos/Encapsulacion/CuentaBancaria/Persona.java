package Orientacion_a_objetos.Encapsulacion.CuentaBancaria;

import java.util.Objects;

public class Persona {
    //Atributo
    private String dni;
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    //Contructor, guetters, setters
    public Persona(String nombre, String apellido, String dni, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anio = anio;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    //Metodos

    public boolean esMayorEdad(){
        boolean esMayor = false;
        if (this.anio >= 18){
            esMayor = true;
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        return esMayor;
    }

    @Override
    public String toString() {
        return "Persona [" +
                "dni = " + dni +
                ", nombre = " + nombre +
                ", apellido = " + apellido +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
