package ejemploTarea;

public class main {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static String capitalizar(String texto) {

        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
