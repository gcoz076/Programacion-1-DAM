package BoletinUD1_Match;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que habitacion eliges? (numero): ");
        int habitacion = sc.nextInt();
        switch (habitacion) {
            case 1:
                System.out.println("La habitación azul cuenta con 2 camas y se encuentra en la primera planta");
                break;
            case 2:
                System.out.println("La habitacón roja cuenta con 1 cama y se encuentra en la primera planta");
                break;
            case 3:
                System.out.println("La habitación verde cuenta con 3 camas y se encuentra en la segunda planta");
                break;
            case 4:
                System.out.println("La habitación rosa cuenta con 2 camas y se encuentra en la segunda planta");
                break;
            case 5:
                System.out.println("La habitación Gris cuenta con 1 cama y se encuentra en la tercera planta");
                break;
            default:
                System.out.println("Esa habitación no existe");
        }
    }
}
