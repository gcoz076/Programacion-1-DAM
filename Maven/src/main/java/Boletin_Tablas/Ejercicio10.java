package Boletin_Tablas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la longitud de la primera tabla: ");
        int longitud = scanner.nextInt();
        int [] primeraTabla = new int[longitud];

        System.out.println("Dime la longitud de la segunda tabla: ");
        int longitud2 = scanner.nextInt();
        int [] segundaTabla = new int[longitud2];

        int [] terceraTabla = new int[longitud + longitud2];
        int [] cuartaTabla = new int[longitud + longitud2];

        System.out.println("Vamos a empezar por la primera tabla");
        for (int i = 0; i < primeraTabla.length; i++) {
            System.out.println("Dime un número para añadir a la primera tabla: ");
            int num = scanner.nextInt();
            primeraTabla[i] = num;
        }

        System.out.print("Primera tabla: ");
        for (int numero : primeraTabla) {
            System.out.print(numero + " ");
        }
        System.out.println(" ");

        System.out.println("Vamos a seguir con la segunda tabla");
        for (int i = 0; i < segundaTabla.length; i++) {
            System.out.println("Dime un número para añadir a la segunda tabla: ");
            int num2 = scanner.nextInt();
            segundaTabla[i] = num2;
        }

        System.out.print("Segunda tabla: ");
        for (int numero2 : segundaTabla){
            System.out.print(numero2 + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < primeraTabla.length ; i++) {
                terceraTabla[i] = primeraTabla[i];
        }
        int contador = 0;
        for (int i = primeraTabla.length; i < terceraTabla.length ; i++) {
                terceraTabla[i] = segundaTabla[contador++];
        }

        System.out.print("La tercera tabla es: ");
        for (int numero3 : terceraTabla){
            System.out.print(numero3 + " ");
        }
    }
}