package Expresiones_Regulares;

public class Ejercicio16 {
    public static void main(String[] args) {
        String[] palabras = {"apples", "pie", "stop", "piano"};
        String regex = ".+p.+";

        for (String palabra : palabras) {
            if (palabra.matches(regex) && !palabra.startsWith("p") && !palabra.endsWith("p")) {
                System.out.println(palabra);
            }
        }
    }
}
