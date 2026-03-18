package excepciones.Boletin_2.Ejercicio2.models;

import excepciones.Boletin_2.Ejercicio2.CocinaException;

public class Receta {

    private static int contador = 1;

    private int id;
    private String nombre;
    private Ingrediente[] ingredientes = new Ingrediente[30];
    private int numIngredientes = 0;

    public Receta(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void aniadirIngrediente(Ingrediente ingrediente) {
        if (numIngredientes < ingredientes.length) {
            ingredientes[numIngredientes++] = ingrediente;
        } else {
            System.out.println("No se pueden añadir más ingredientes.");
        }
    }

    public void cocinar(int comensales) throws CocinaException {
        if (comensales <= 0) {
            System.out.println("Número de comensales incorrecto.");
            return;
        }

        if (comensales > 1000) {
            throw new CocinaException("Número de comensales demasiado alto");
        }

        System.out.println("Receta: " + nombre);

        for (int i = 0; i < numIngredientes; i++) {
            double total = ingredientes[i].getCantidad() * comensales;
            System.out.println(ingredientes[i] + " -> " + total);
        }
    }

    @Override
    public String toString() {
        return "Receta{id=" + id + ", nombre='" + nombre + "'}";
    }
}