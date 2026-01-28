package Orientacion_a_objetos.Pokemon;

import java.util.Scanner;

public class GestionaPokemon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        

        //Pichu
        Pokemon pichu = new Pokemon("Pichu", "Eléctrico", 50, 19, 0);
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 100, 38, 1);

    }

    void menu(Pokemon pichu, Scanner scan, String nombre, String[] evoluciones, int nivel, int vida, String tipo){

        System.out.println("=====================");
        System.out.println("====== Pokédex ======");
        System.out.println("=====================");
        System.out.println("1.- Ver estadísticas ");
        System.out.println("2.- Luchar ");
        System.out.println("3.- Evolucionar ");
        System.out.println("4.- Salir");
        System.out.println("=====================");

        System.out.print("¿Que opción eliges?: ");
        int opcion = scan.nextInt();
        boolean salir = false;

        while (opcion != 4 || salir != true){
            if (opcion == 1){
                System.out.println("Mostrando estadisticas...");
                System.out.println(pichu.toString());
            }
            else if (opcion == 2){
                System.out.println("¡¡ Ha salido un pokemon salvaje !!");
                boolean resultado = pichu.luchar();

                if (resultado == true){
                    System.out.println("¡¡ Has ganado !!, tu pokemon sube de nivel");
                }
                else {
                    System.out.println("¡¡ Has perdido !!, tu pokemon no sube de nivel");
                }
            }
            else if (opcion == 3){
                pichu.evolucionar();

            }
            else {
                salir = false;
            }
        }
    }
}
