package Expresiones_Regulares;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] dnis = {"12345678A", "1234A", "87654321Z"};

        for (String dni : dnis) {
            if (dni.matches("\\d{8}[A-Z]")) {
                System.out.println(dni);
            }
        }
    }
}
