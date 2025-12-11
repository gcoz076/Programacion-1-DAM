package Boletin0;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        if (num2 != 0) {
            int res = num1 / num2;
            System.out.println(res);
        }
        else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}
