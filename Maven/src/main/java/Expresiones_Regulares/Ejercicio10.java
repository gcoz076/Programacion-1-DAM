package Expresiones_Regulares;

public class Ejercicio10 {
    public static void main(String[] args) {
        String texto = "Fechas: 15/03/2024 y 28/02/2024";
        String regex = "\\d{2}/\\d{2}/\\d{4}";

        String[] palabras = texto.split(" ");

        for (String p : palabras) {
            if (p.matches(regex)) {
                System.out.println(p);
            }
        }
    }
}
