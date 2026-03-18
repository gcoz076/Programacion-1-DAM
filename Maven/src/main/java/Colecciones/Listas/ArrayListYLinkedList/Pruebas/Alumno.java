package Colecciones.Listas.ArrayListYLinkedList.Pruebas;

import java.util.Objects;

public class Alumno implements Comparable{
    //Atributos
    private int id;
    private String nombre;
    private String dni;

    //Constructor


    public Alumno(int id, String nombre, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Models.Alumno alumno = (Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Models.Alumno) o;
        return Objects.equals(dni, alumno.getDni());
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

    @Override
    public int compareTo(Object o){
        int resultado = 0;
        Alumno a1 = (Alumno)o;
        resultado = this.id - a1.id;

        return resultado;
    }
}
