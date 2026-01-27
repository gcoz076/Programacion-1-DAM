package Ejemplo;

public class StringUtils {

    // Constructor privado para que no se instancie
    private StringUtils() {
    }

    public static boolean esVacio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    public static String capitalizar(String texto) {
        if (esVacio(texto)) {
            return texto;
        }
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
