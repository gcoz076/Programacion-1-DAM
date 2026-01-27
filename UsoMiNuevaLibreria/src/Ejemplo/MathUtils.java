package Ejemplo;

public class MathUtils {

    private MathUtils() {
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
