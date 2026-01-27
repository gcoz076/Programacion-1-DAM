package Boletin_Matrices;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean [][] salaCine = new boolean[3][4];
        Scanner scanner = new Scanner(System.in);

        Ejercicio2 ref = new Ejercicio2();
        int numTotal = 0;
        numTotal = ref.registrarEspectadores(salaCine, scanner);
        System.out.println("El numero total de espectadores es: "+ numTotal +".");
    }
     public int registrarEspectadores(boolean [][] salaCine, Scanner scanner){
        int numEspectadores = 0;
         System.out.println("Dime fila");
        int fila = scanner.nextInt();
         System.out.println("Dime columna");
         int columna = scanner.nextInt();

        while (fila >= 0 && fila <= 2 && columna >= 0 && columna <=3) {

            salaCine[fila][columna] = true;
            System.out.println("Alguien se sentó en la fila "+ fila +" y en la columna "+ columna +".");
            numEspectadores = numEspectadores + 1;

            System.out.println("Dime la fila: ");
            fila = scanner.nextInt();
            System.out.println("Dime la columna: ");
            columna = scanner.nextInt();
        }
        return  numEspectadores;
     }
}

