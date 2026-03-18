package Orientacion_a_objetos.Simulaciones.TiendaAnimales.models;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Mascotas {
    //Atributos
    private String nombre;
    private int edad;
    private String estado;
    private LocalDate fechaNacimiento;

    //Constructor
    public Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Guetter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos predefinidos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mascotas mascotas = (Mascotas) o;
        return edad == mascotas.edad && Objects.equals(nombre, mascotas.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    //Metodos
    public void cumpleanios(){

    }
    public


    abstract boolean habla();


}
