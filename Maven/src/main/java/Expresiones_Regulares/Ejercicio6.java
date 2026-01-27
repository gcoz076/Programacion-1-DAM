package Expresiones_Regulares;

public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "Hola 2024";
        boolean contieneNumero = frase.matches(".*\\d.*");
        System.out.println(contieneNumero);
    }
}
