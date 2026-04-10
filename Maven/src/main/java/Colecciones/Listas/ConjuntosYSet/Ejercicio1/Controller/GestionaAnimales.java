package Colecciones.Listas.ConjuntosYSet.Ejercicio1.Controller;

import Colecciones.Listas.ConjuntosYSet.Ejercicio1.Models.*;
import java.time.LocalDate;
import java.util.*;

public class GestionaAnimales {

    public static void main(String[] args) {

        RepoAnimal repo = new RepoAnimal("ZooMadrid", "Madrid", 1000000);

        repo.addAnimal(new Animal(1, "Leon", "Felino", 5, "Carnivoro", LocalDate.of(2019, 5, 10), 190.5, "Tierra", "Viviparo"));

        repo.addAnimal(new Animal(2, "Aguila", "Ave", 3, "Carnivoro", LocalDate.of(2021, 3, 2), 6.2, "Aire", "Oviparo"));

        repo.addAnimal(new Animal(3, "Tiburon", "Pez", 8, "Carnivoro", LocalDate.of(2016, 7, 20), 500, "Agua", "Ovoviviparo"));

        repo.addAnimal(new Animal(4, "Pato", "Ave", 2, "Omnivoro", LocalDate.of(2022, 1, 15), 3.0, "Aire", "Oviparo"));


        boolean añadido = repo.addAnimal(new Animal(1, "OtroLeon", "Felino", 4, "Carnivoro", LocalDate.of(2020, 1, 1), 180, "Tierra", "Viviparo"));

        System.out.println("¿Se ha añadido duplicado? " + añadido);

        System.out.println("--- LISTADO NORMAL ---");
        repo.mostrarAnimales();

        int idBuscar = 2;
        Animal encontrado = null;

        Iterator<Animal> it = repo.getAnimales().iterator();

        while (it.hasNext() && encontrado == null) {
            Animal actual = it.next();

            if (actual.getIdentificador() == idBuscar) {
                encontrado = actual;
            }
        }

        System.out.println("--- BUSQUEDA ---");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("No encontrado");
        }

        if (encontrado != null) {
            System.out.println("--- MODIFICACION ---");

            Animal modificado = new Animal(
                    encontrado.getIdentificador(),
                    encontrado.getNombre(),
                    "Modificada",
                    0,
                    encontrado.getClasificacionComida(),
                    encontrado.getFechaNacimiento(),
                    0,
                    "Aire",
                    "Viviparo"
            );

            repo.getAnimales().remove(encontrado);
            repo.addAnimal(modificado);

            System.out.println("Animal modificado");
        }

        System.out.println("--- LISTADO ACTUALIZADO ---");
        repo.mostrarAnimales();

        System.out.println("--- LISTADO ORDENADO POR MEDIO Y NOMBRE ---");

        List<Animal> lista = new ArrayList<>(repo.getAnimales());

        Collections.sort(lista, new OrdenPorMedioYNombre());

        for (int i = 0; i < lista.size(); i++) {
            Animal a = lista.get(i);
            System.out.println(a.getNombre() + " - " + a.getMedio());
        }
    }
}