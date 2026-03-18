package Expresiones_Regulares;

public class Ejercicio11 {
    public static void main(String[] args) {
        String texto = "IP 192.168.1.10 y 10.0.0.45";

        String regex = "\\b(\\d{1,3}\\.){3}\\d{1,3}\\b";
        texto = texto.replaceAll(regex, "[IPv4]");

        System.out.println(texto);
    }
}