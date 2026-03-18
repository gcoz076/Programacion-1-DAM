package excepciones.Boletin_2.Ejercicio1.controller;

import excepciones.Boletin_2.Ejercicio1.CaracterNoTraducibleException;
import excepciones.Boletin_2.Ejercicio1.models.TraductorMorse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TraductorMorse traductor = new TraductorMorse();
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un texto (escribe 'fin' para salir):");

        String texto = sc.nextLine();

        while (!texto.equalsIgnoreCase("fin")) {

            try {

                traductor.traducir(texto);
                System.out.println("Texto válido: " + texto);

            } catch (CaracterNoTraducibleException e) {

                System.out.println("Error: " + e);

            } finally {

                System.out.println("Comprobación de texto finalizada\n");
            }

            System.out.println("Dame otro texto (fin para salir):");
            texto = sc.nextLine();
        }

        System.out.println("Programa terminado.");
        sc.close();
    }
}
