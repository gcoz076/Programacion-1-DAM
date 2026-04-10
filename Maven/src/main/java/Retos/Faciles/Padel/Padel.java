package Retos.Faciles.Padel;

import java.util.Scanner;

public class Padel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] tablaCulpa = new int[4];
        int suma = 0;
        int apartado = 1;
        for (int i = 0; i < tablaCulpa.length; i++) {
            System.out.println("Escribe el porcentaje del apartado " + apartado++);
            tablaCulpa[i] = s.nextInt();
            suma += tablaCulpa[i];
        }
        int resultado = 100 - suma;
        System.out.println("Tu culpa es del " + resultado + "%");
    }
}