package Expresiones_Regulares;

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = "DAMProgramacion";
        boolean empieza = texto.matches("^DAM.*");
        System.out.println(empieza);
    }
}
