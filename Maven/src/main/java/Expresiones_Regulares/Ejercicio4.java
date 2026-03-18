package Expresiones_Regulares;

public class Ejercicio4 {
    public static void main(String[] args) {
        String matricula = "1234ABC";
        boolean valida = matricula.matches("\\d{4}[A-Z]{3}");
        System.out.println(valida);
    }
}
