package Expresiones_Regulares;

public class Ejercicio14 {
    public static void main(String[] args) {
        String texto = "Java123";
        boolean valido = texto.matches("[a-zA-Z0-9]+");
        System.out.println(valido);
    }
}
