package Boletín_1_Java;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Tiene membresía premium? (true/false): ");
        boolean tieneMembresiaPremium = scanner.nextBoolean();

        System.out.print("Monto gastado en el restaurante: $");
        double montoGastado = scanner.nextDouble();

        System.out.print("Edad del cliente: ");
        int edad = scanner.nextInt();

        boolean elegible = (tieneMembresiaPremium && montoGastado > 50) || (edad > 65);

        if (elegible) {
            System.out.println("El cliente es elegible para el descuento.");
        } else {
            System.out.println("El cliente NO es elegible para el descuento.");
        }
    }
}
