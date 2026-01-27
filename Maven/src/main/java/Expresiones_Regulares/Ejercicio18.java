package Expresiones_Regulares;

public class Ejercicio18 {
    public static void main(String[] args) {
        String texto = "Programacion";
        int vocales = texto.length() - texto.replaceAll("[aeiouAEIOU]", "").length();
        System.out.println(vocales);
    }
}
