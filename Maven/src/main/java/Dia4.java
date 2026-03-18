import java.util.Random;
import java.util.Scanner;
public class Dia4 {
    public static void main(String[] args) {
        boolean encontrado = false;
        Random r = new Random();
        int numeroAlAzar = r.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.println("Número de la máquina" + numeroAlAzar);
        int apuesta;
        while (!encontrado){
            System.out.println("Adivina el número: ");
            apuesta = input.nextInt();
            if (apuesta == numeroAlAzar){
                encontrado = true;
            }
        }
    }
}
