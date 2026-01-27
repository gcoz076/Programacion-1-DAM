package Expresiones_Regulares;

public class Ejercicio15 {
    public static void main(String[] args) {
        String texto = "abc_ xyz_ Abc_";
        String regex = "[a-z]+_";

        for (String palabra : texto.split(" ")) {
            if (palabra.matches(regex)) {
                System.out.println(palabra);
            }
        }
    }
}
