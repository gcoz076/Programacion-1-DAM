package Colecciones.Listas.ConjuntosYSet.Ejercicio1.Models;

import java.time.LocalDate;
import java.util.Objects;

public class Animal implements Comparable<Animal> {

    private int identificador;
    private String nombre;
    private String especie;
    private int edad;
    private String clasificacionComida;
    private LocalDate fechaNacimiento;
    private double peso;
    private String medio;
    private String clasificacionGestacion;

    public Animal(int identificador, String nombre, String especie, int edad,
                  String clasificacionComida, LocalDate fechaNacimiento,
                  double peso, String medio, String clasificacionGestacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.clasificacionComida = clasificacionComida;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.medio = medio;
        this.clasificacionGestacion = clasificacionGestacion;
    }

    public int getIdentificador() { return identificador; }
    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getMedio() { return medio; }
    public String getClasificacionComida() { return clasificacionComida; }

    public void setClasificacionGestacion(String clasificacionGestacion) {
        this.clasificacionGestacion = clasificacionGestacion;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setClasificacionComida(String clasificacionComida) {
        this.clasificacionComida = clasificacionComida;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Animal otro) {

        int resultado;
        int cmp = this.nombre.compareTo(otro.nombre);

        if (cmp == 0) {
            resultado = Integer.compare(this.identificador, otro.identificador);
        } else {
            resultado = cmp;
        }

        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return identificador == animal.identificador;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public String toString() {
        return "Animal[" +
                "Nombre:" + getNombre() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", medio='" + getMedio() + '\'' +
                ", clasificacionGestacion='" + clasificacionGestacion + '\'' +
                '}';
    }
}