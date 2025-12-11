package Boletin0;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor numero es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor número es: " + num2);
        } else {
            System.out.println("El mayor número es: " + num3);
        }
    }
}
