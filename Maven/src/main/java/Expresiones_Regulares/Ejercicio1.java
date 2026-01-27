package Expresiones_Regulares;

public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = "12345";
        boolean soloNumeros = texto.matches("\\d+");
        System.out.println(soloNumeros);

    }
}
