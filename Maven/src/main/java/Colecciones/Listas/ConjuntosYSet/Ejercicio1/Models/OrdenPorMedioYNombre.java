package Colecciones.Listas.ConjuntosYSet.Ejercicio1.Models;

import java.util.Comparator;

public class OrdenPorMedioYNombre implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        int resultado;
        int cmp = a1.getMedio().compareTo(a2.getMedio());

        if (cmp == 0) {
            resultado = a1.getNombre().compareTo(a2.getNombre());
        } else {
            resultado = cmp;
        }
        return resultado;
    }
}
