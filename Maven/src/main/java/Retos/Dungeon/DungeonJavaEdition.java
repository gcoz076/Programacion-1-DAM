/*
package Retos.Dungeon;

import java.util.Random;
import java.util.Scanner;

public class DungeonJavaEdition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int heroeHP = 100;
        int puntosenergias = 20;
        int monstruoHP = 80;

        System.out.println("Dime el nombre de tu Héroe: ");
        String nombreHeroe = input.nextLine();

        while (heroeHP > 0 && monstruoHP > 0) {
            System.out.println("\n--- Turno de " + nombreHeroe + " ---");
            System.out.println("Vida del héroe: " + heroeHP + " | Energía: " + puntosenergias);
            System.out.println("Vida del monstruo: " + monstruoHP);
            System.out.println("¿Qué ataque quieres utilizar? (Basico / Especial / Curar)");

            String tipoAtaque = input.nextLine().toUpperCase();

            if (tipoAtaque.equals("BASICO")) {
                int danoGenerado = r.nextInt(7, 12);
                monstruoHP -= danoGenerado;
                System.out.println("Has hecho " + danoGenerado + " de daño. Al monstruo le quedan " + Math.max(monstruoHP, 0) + " HP.");

            } else if (tipoAtaque.equals("ESPECIAL")) {
                if (puntosenergias >= 5) {
                    puntosenergias -= 5;
                    int danoGenerado = r.nextInt(15, 25);
                    monstruoHP -= danoGenerado;
                    System.out.println("¡Ataque especial! Has hecho " + danoGenerado + " de daño.");
                    System.out.println("Al monstruo le quedan " + Math.max(monstruoHP, 0) + " HP. Energía restante: " + puntosenergias);
                }
                else {
                    System.out.println("¡No tienes suficiente energía para usar el ataque especial!");
                }

            } else if (tipoAtaque.equals("CURAR")) {
                if (puntosenergias >= 8) {
                    puntosenergias -= 8;
                    heroeHP += 30;
                    if (heroeHP > 100) heroeHP = 100;
                    System.out.println("Te has curado! Tu vida es: " + heroeHP + ". Energía restante: " + puntosenergias);
                }
                else {
                    System.out.println("¡No tienes suficiente energía para curarte!");
                }

            } else {
                System.out.println("Opción inválida. Pierdes el turno.");
            }
            if (monstruoHP > 0) {
                int danoMonstruo = r.nextInt(15, 25);
                heroeHP -= danoMonstruo;
                System.out.println("El monstruo te ataca y te hace " + danoMonstruo + " de daño!");
                System.out.println("Tu vida actual: " + Math.max(heroeHP, 0));
            }
        }
        System.out.println("\n" + "===========================================================");
        if (heroeHP <= 0) {
            System.out.println(" " + nombreHeroe + " ha sido derrotado por el monstruo...");
        }
        else {
            System.out.println(" " + nombreHeroe + " ha vencido al monstruo y sobrevive!");
        }
        System.out.println("===========================================================");
    }
}
*/