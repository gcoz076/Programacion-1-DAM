import java.util.Scanner;

public class Arbol3niveles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas del árbol (≥1): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número de filas debe ser al menos 1.");
        }
        int ancho = 2 * n - 1;

        for (int i = 0; i < n; i++) {
            int izq = n - 1 - i;
            int der = n - 1 + i;

            for (int j = 0; j < ancho; j++) {
                if (j == izq || j == der) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}