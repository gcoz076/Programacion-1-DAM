package Expresiones_Regulares;

public class Ejercicio3 {
    public static void main(String[] args) {
        String pass = "abc12345";
        boolean valida = pass.matches(".{8,}");
        System.out.println(valida);
    }
}
