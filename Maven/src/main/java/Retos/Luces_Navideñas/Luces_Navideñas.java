/*
package Retos.Luces_Navideñas;

import java.util.Scanner;

public class Luces_Navideñas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hayDevolucion;
            int bombilla = 1;
            boolean hay = false;
            int total = 10;
            int encendidas = 0;
            System.out.println("Verifica que las luces estén encendidas");
            for (int i = 0; i < total; i++) {
                System.out.println("Bombilla nº " + bombilla + ", responde (S) o (N): ");
                String respuesta = sc.next().toUpperCase();
                while (respuesta.equals("S") || respuesta.equals("N")) {
                    if (respuesta.equals("S")) {
                        encendidas = encendidas + 1;
                        System.out.println("Una encendidad!!!");
                    } else if (respuesta.equals("N")) {
                        System.out.println("Venga que ya falta menos");
                    } else {
                        System.out.println("Quillo ayúdame: S o N");
                    }
                    String respuesta = sc.next().toUpperCase();
                }
                if (encendidas > 5) {
                    System.out.println("¡¡Nos devuelven el dinero!!");
                } else {
                    System.out.println("Recuerda no comprar más luces a ese vendedor");
                }
            }
        }
    }
}
*/