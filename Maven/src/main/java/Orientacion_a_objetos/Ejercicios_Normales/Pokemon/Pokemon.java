/*
package Orientacion_a_objetos.Ejercicios_Normales.Pokemon;


import java.util.Random;

public class Pokemon {
    //Atributos
    String nombre;
    String tipo;
    int vida;
    int nivel;
    int faseEvolutiva;
    Pokemon[] evoluciones;

    //Constructores
    public Pokemon() {
        this.nombre = "";
        this.tipo = "";
        this.vida = 0;
        this.nivel = 0;
        this.evoluciones = new Pokemon[3];
    }

    public Pokemon(String nombre, String tipo, int vida, int nivel, int faseEvolutiva) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.nivel = nivel;
        this.faseEvolutiva = faseEvolutiva;
        this.evoluciones = new Pokemon[3];

    }

    //Métodos
    boolean luchar(){
        Random r = new Random();
        int numero = r.nextInt(2);
        boolean resultado;

        if (numero == 0){
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }

    void evolucionar() {

        if (faseEvolutiva == 0 && nivel >= 18 && evoluciones[1] != null) {
            System.out.println("Tu " + nombre + " está evolucionando...");
            System.out.println("TIN TIN...");
            nombre = evoluciones[1].nombre;
            vida = evoluciones[1].vida;
            faseEvolutiva = 1;
        }
        else if (faseEvolutiva == 1 && nivel >= 36 && evoluciones[2] != null) {
            System.out.println("Tu " + nombre + " está evolucionando...");
            System.out.println("TIN TIN...");
            nombre = evoluciones[2].nombre;
            vida = evoluciones[2].vida;
            faseEvolutiva = 2;
        }
        else {
            System.out.println("Tu " + nombre + " no puede evolucionar todavía.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTipo: " + tipo +
                "\nVida: " + vida +
                "\nNivel: " + nivel +
                "\nFase evolutiva: " + faseEvolutiva;
    }
}
*/

