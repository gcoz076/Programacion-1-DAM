package excepciones.Boletin_2.Ejercicio2.controller;

import excepciones.Boletin_2.Ejercicio2.CocinaException;
import excepciones.Boletin_2.Ejercicio2.models.*;

public class GestorRecetario {
    public static void main(String[] args) {
        // Crear ingredientes
        Ingrediente huevo = new Ingrediente("huevo", 2);
        Ingrediente patata = new Ingrediente("patata", 150);
        Ingrediente aceite = new Ingrediente("aceite", 10);

        // Crear recetario
        Recetario recetario = new Recetario();

        // Crear receta
        Receta tortilla = new Receta("tortilla");
        tortilla.aniadirIngrediente(huevo);
        tortilla.aniadirIngrediente(patata);
        tortilla.aniadirIngrediente(aceite);

        recetario.añadirReceta(tortilla);

        // Intentar cocinar
        try {
            Receta r = recetario.buscar("tortilla");
            r.cocinar(3);       // número válido de comensales
            r.cocinar(1500);    // número demasiado alto, lanzará excepción
        } catch (CocinaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Intento de cocinar finalizado");
        }

        // Buscar una receta que no existe
        try {
            Receta r2 = recetario.buscar("pizza");
        } catch (CocinaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Búsqueda finalizada");
        }

        System.out.println("El programa continúa");
    }
}