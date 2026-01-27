package Expresiones_Regulares;

public class Ejercicio9 {
    public static void main(String[] args) {
        String texto = "soporte.tecnico@empresa.com negocios@empresa.com alianzas@partner.org";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String[] emails = texto.split(" ");

        for (String palabra : emails) {
            if (palabra.matches(regex)) {
                System.out.println(palabra);
            }
        }
    }
}
