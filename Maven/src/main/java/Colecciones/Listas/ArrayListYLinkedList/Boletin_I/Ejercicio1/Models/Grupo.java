package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio1.Models;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String id;
    private String descripcion;
    private String tutor;
    private String aula;

    private List<Estudiante> estudiantes;

    public Grupo(String id, String descripcion, String tutor, String aula) {
        this.id = id;
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
        estudiantes = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public int numeroEstudiantes() {
        return estudiantes.size();
    }

    public Estudiante buscarEstudiante(String id) {
        Estudiante encontrado = null;
        for(Estudiante e : estudiantes) {
            if(e.getId().equals(id)) {
                encontrado = e;
            }
        }
        return encontrado;
    }

    public double promedioGrupo() {
        double promedio = 0;
        if(!estudiantes.isEmpty()) {
            double suma = 0;
            for(Estudiante e : estudiantes) {
                suma += e.calcularPromedio();
            }
            promedio = suma / estudiantes.size();
        }
        return promedio;
    }

    public void mostrarEstudiantes() {
        for(Estudiante e : estudiantes) {
            e.mostrar();
            System.out.println("----------------");
        }
    }

    public void infoBasica() {

        System.out.println("Descripcion: " + descripcion);
        System.out.println("Tutor: " + tutor);
        System.out.println("Numero estudiantes: " + estudiantes.size());
    }
}
