package Expresiones_Regulares;

public class Ejercicio13 {
    static boolean validarDNI(String dni) {
        return dni.matches("\\d{8}[A-Z]");
    }

    static boolean validarFecha(String fecha) {
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    static boolean validarMatricula(String mat) {
        return mat.matches("\\d{4}[A-Z]{3}");
    }

    static boolean validarNombre(String nom) {
        return nom.matches("[a-zA-Z ]+");
    }

}
