package Expresiones_Regulares;

public class Ejercicio17 {
    public static void main(String[] args) {
        String ip = "215.08.096.196";
        ip = ip.replaceAll("\\b0+(\\d)", "$1");
        System.out.println(ip);
    }
}
