package Expresiones_Regulares;

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "Java123", "Mundo"};
        int contador = 0;

        for (String p : palabras) {
            if (p.matches("[a-zA-Z]+")) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
