package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Models;

import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio2.Exception.DeportesException;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipo)) return false;
        Equipo equipo = (Equipo) o;
        return nombre.equals(equipo.nombre);
    }

    public void aniadirAlumno(Alumno alumno) throws DeportesException {
        if (!alumnos.contains(alumno)) {
            alumnos.add(alumno);
        } else {
            throw new DeportesException("El alumno ya está registrado");
        }
    }

    public void borrarAlumno(Alumno a) throws DeportesException {
        if (alumnos.contains(a)) {
            alumnos.remove(a);
        } else {
            throw new DeportesException("El alumno no está en el equipo");
        }
    }

    public Alumno buscarAlumno(Alumno a) {
        if (alumnos.contains(a)) {
            return alumnos.get(alumnos.indexOf(a));
        }
        return null;
    }

    public void muestraAlumnos() {
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }


    public Equipo unionEquipo(Equipo e) {
        Equipo nuevo = new Equipo(this.nombre + "-" + e.nombre);
        nuevo.alumnos.addAll(this.alumnos);
        for (Alumno a : e.alumnos) {
            if (!nuevo.alumnos.contains(a)) {
                nuevo.alumnos.add(a);
            }
        }
        return nuevo;
    }

    public Equipo interseccionEquipo(Equipo e) {
        Equipo nuevo = new Equipo("Interseccion");

        for (Alumno a : this.alumnos) {
            if (e.alumnos.contains(a)) {
                nuevo.alumnos.add(a);
            }
        }
        return nuevo;
    }
}