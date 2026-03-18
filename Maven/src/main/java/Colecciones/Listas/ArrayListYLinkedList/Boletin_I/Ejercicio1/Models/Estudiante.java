package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio1.Models;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String nombre;
    private String id;
    private List <Double> notas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double promedio = 0;
        if(!notas.isEmpty()) {
            double suma = 0;
            for(double n : notas) {
                suma += n;
            }
            promedio = suma / notas.size();
        }
        return promedio;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Notas: " + notas);
    }
}