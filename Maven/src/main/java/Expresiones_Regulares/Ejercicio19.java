package Expresiones_Regulares;

public class Ejercicio19 {
    public static void main(String[] args) {
        String tel = "612345678";
        boolean valido = tel.matches("[967]\\d{8}");
        System.out.println(valido);
    }
}
