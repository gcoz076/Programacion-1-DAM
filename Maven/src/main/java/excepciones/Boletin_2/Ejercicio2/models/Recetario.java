package excepciones.Boletin_2.Ejercicio2.models;

import excepciones.Boletin_2.Ejercicio2.CocinaException;

public class Recetario {

    private Receta[] recetas = new Receta[20];
    private int total = 0;

    public void añadirReceta(Receta r) {
        if (total < recetas.length) {
            recetas[total++] = r;
        } else {
            System.out.println("No se pueden añadir más recetas al recetario.");
        }
    }

    public Receta buscar(String nombre) throws CocinaException {
        int i = 0;
        Receta encontrada = null;

        while (i < total && encontrada == null) {
            if (recetas[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrada = recetas[i];
            }
            i++;
        }

        if (encontrada == null) {
            throw new CocinaException("La receta " + nombre + " no existe en el recetario");
        }

        return encontrada;
    }

    @Override
    public String toString() {
        return "Recetario con " + total + " recetas";
    }
}