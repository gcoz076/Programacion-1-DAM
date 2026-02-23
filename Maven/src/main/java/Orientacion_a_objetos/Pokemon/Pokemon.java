/*
package Orientacion_a_objetos.Pokemon;


import java.util.Arrays;
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
    public Pokemon(String nombre, Pokemon[] evoluciones, int nivel, int vida, String tipo) {
        this.nombre = nombre;
        this.evoluciones = evoluciones;
        this.nivel = nivel;
        this.vida = vida;
        this.tipo = tipo;
    }

    public Pokemon() {
        this.nombre = "";
        this.tipo = "";
        this.vida = 0;
        this.nivel = 0;
        this.evoluciones = new Pokemon[10];
    }

    public Pokemon(String nombre, String tipo, int vida, int nivel, int faseEvolutiva) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.nivel = nivel;
        this.faseEvolutiva = faseEvolutiva;
        this.evoluciones = new Pokemon[10];

    }

    //Métodos
    boolean luchar(){
        Random r = new Random();
        int numero = r.nextInt(0,2);
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
            faseEvolutiva = 1;
        }
        else if (faseEvolutiva == 1 && nivel >= 36 && evoluciones[2] != null) {
            System.out.println("Tu " + nombre + " está evolucionando...");
            System.out.println("TIN TIN...");
            nombre = evoluciones[2].nombre;
            faseEvolutiva = 2;
        }
        else {
            System.out.println("Tu " + nombre + " no puede evolucionar todavía.");
        }
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vida=" + vida +
                ", nivel=" + nivel +
                ", evoluciones=" + Arrays.toString(evoluciones) +
                '}';
    }
}
*/

