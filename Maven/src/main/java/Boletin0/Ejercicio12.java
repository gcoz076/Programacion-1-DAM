package Boletin0;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la contraseña: ");
        int contrasena = sc.nextInt();

        while (contrasena != 1234) {
            System.out.println("Dime de nuevo la contraseña: ");
            contrasena = sc.nextInt();
        }
    }
}
