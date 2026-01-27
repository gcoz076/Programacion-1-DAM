package Expresiones_Regulares;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        int contador = 0;
        for (String palabra : frase.split(" ")) {
            if (palabra.matches("^[aeiouAEIOU].*")) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}