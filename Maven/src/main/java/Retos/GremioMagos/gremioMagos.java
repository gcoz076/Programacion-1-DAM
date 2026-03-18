package Retos.GremioMagos;
import java.util.Scanner;

public class gremioMagos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String usuarioLeido;
        String claveLeida;
        String mensajeSucio;

        System.out.print("Introduce usuario: ");
        usuarioLeido = teclado.nextLine().trim();

        System.out.print("Introduce contraseña: ");
        claveLeida = teclado.nextLine();

        if (validarAcceso(usuarioLeido, claveLeida)) {

            System.out.println("Acceso concedido, " + usuarioLeido.toUpperCase() + ".");

            System.out.print("Introduce el conjuro: ");
            mensajeSucio = teclado.nextLine();

            String conjuroLimpio = limpiarConjuro(mensajeSucio);

            System.out.println("Mensaje sin cifrar: \"" + conjuroLimpio + "\"");

            cifradoDelConjuro(conjuroLimpio);

        } else {
            System.out.println("Acceso denegado.");
        }

        teclado.close();
    }

    public static boolean validarAcceso(String usuario, String clave) {

        if (clave.length() < 8) {
            return false;
        }

        if (!clave.contains("#") && !clave.contains("*")) {
            return false;
        }

        return true;
    }

    public static String limpiarConjuro(String texto) {

        texto = texto.replace("maldición", "bendición");
        texto = texto.toUpperCase();

        return texto;
    }

    public static void cifradoDelConjuro(String texto) {

        System.out.println("Longitud: " + texto.length() + " caracteres.");

        String[] letras = texto.split("");
        String textoInvertido = "";

        for (int i = letras.length - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + letras[i];
        }

        System.out.println("Mensaje cifrado: \"" + textoInvertido + "\"");
    }
}