package Colecciones.Listas.ConjuntosYSet.Ejercicio1.Models;

import java.util.*;

public class RepoAnimal {

    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private Set<Animal> animales;

    public RepoAnimal(String nombre, String lugar, double presupuestoAnual) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.animales = new TreeSet<>();
    }

    public boolean addAnimal(Animal a) {
        return this.animales.add(a);
    }
    public boolean updateAnimal(Animal a) {

        boolean modificado = false;

        Iterator<Animal> it = animales.iterator();

        while (it.hasNext() && !modificado) {
            Animal actual = it.next();
            if (actual.equals(a)) {
                actual = a;
                modificado = true;
            }
        }
        return modificado;
    }

    public Set<Animal> getAnimales() {
        return animales;
    }

    public void mostrarAnimales() {

        Object[] array = animales.toArray();

        for (int i = 0; i < array.length; i++) {
            Animal a = (Animal) array[i];

            System.out.println(a);
        }
    }
}