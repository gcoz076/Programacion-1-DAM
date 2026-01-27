package Retos.Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {
    public void menu () {
        System.out.println("===== Menu =====");
        System.out.println("1. Capturar Pokémon");
        System.out.println("2. Realizar Batalla");
        System.out.println("3. Mostrar Pokedex");
        System.out.println("4. Finalizar");
    }

    public int capturarPokemon(Scanner scanner, String [] nombres, int [] niveles, int contador){

        System.out.println("Introduce el nombre del pokemon a capturar:");
        nombres[contador] = scanner.next();

        System.out.println("Introduce el nivel del pokemon:");
        niveles[contador] = scanner.nextInt();

        return contador +1;
    }

    public void realizarBatalla(Random random, Scanner scanner, String [] nombres, int [] niveles, int contador){

        int puntuacion = 0;
        System.out.println("Dime la posición del pokemon que quieras utilizar de la pokedex: ");
        int posicion = scanner.nextInt();
        int posicionRival= random.nextInt();

        while (posicionRival == posicion){
            posicionRival= random.nextInt();
        }

        String pokemonElegido = nombres[posicion];
        int nivelElegido = niveles[posicion];

        String pokemonRival = nombres[posicionRival];
        int nivelRival = niveles[posicionRival];

        if (nivelElegido > nivelRival){
            puntuacion = puntuacion + 1;
            System.out.println("¡¡Ganas un punto!!" + "Tu puntuación es: " + puntuacion);
            nivelElegido =  niveles[posicion] + 1;
            System.out.println("¡¡Tu nivel sube!!, tu nivel ahora es: " + niveles[posicion] );
        }
        else if (nivelElegido == nivelRival) {
            System.out.println("¡¡Es un empate!!" + "Tu puntuación es: " + puntuacion);
        }
        else {
            System.out.println("¡¡Has perdido!!" + "Tu puntuación es: " + puntuacion);
        }
    }

    public void mostrarPokedex (String [] nombres, int [] niveles, int contador) {

        for (int i = 0; i < contador; i++) {
            System.out.println(nombres[i] + ":" + niveles[i]);
        }
    }

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        pokemon.menu();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] nombres = new String[15];
        int [] niveles = new int[15];
        int contador = 0;


        System.out.print("Dime la opción: ");
        int opcion = scanner.nextInt();
        boolean salir = false;

        while (opcion != 4){
            if (opcion == 1) {
                System.out.println("Capturando Pokemon...");
                pokemon.capturarPokemon(scanner, nombres, niveles, contador);
            }
            else if (opcion == 2) {
                System.out.println("Iniciando Batalla...");
                pokemon.realizarBatalla(random, scanner, nombres, niveles, contador);
            }
            else if (opcion == 3) {
                System.out.println("Mostrando Pokedex...");
                pokemon.mostrarPokedex(nombres, niveles, contador);
            }
            else {
                System.out.println("Saliendo...");
            }

            pokemon.menu();
            System.out.print("Dime la opción: ");
            opcion = scanner.nextInt();
        }
    }
}
