package BoletinUD1_Match;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("=====================");
            System.out.println("==== Calculadora ====");
            System.out.println("=====================");
            System.out.println("Introduzca + si desea sumar");
            System.out.println("Introduzca - si desea resta");
            System.out.println("Introduzca * si desea multiplicar");
            System.out.println("Introduzca / si desea dividir");
            System.out.println("Introduzca @ si desea salir");
            System.out.println("=====================");
            System.out.print("Dame el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("=====================");
            System.out.print("Dame el segundo número: ");
            int num2 = sc.nextInt();
            System.out.println("=====================");
            System.out.print("¿Qué operación quieres realizar? (suma, resta, mult, div, salir): ");
            String operacion = sc.next().toLowerCase(); // para aceptar mayúsculas/minúsculas
            System.out.println("=====================");

            switch (operacion) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / (double) num2));
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                case "@":
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Operación no reconocida.");
                    break;
            }

            System.out.println();

        } while (!salir);

        sc.close();
    }
}