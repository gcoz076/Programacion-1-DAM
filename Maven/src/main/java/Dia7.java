import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dia7 {
    public static void main(String[] args) {
        String frase = "Hoy es 12/05/2025 ¡Que alegria!";
        String patron = ".*\\d{2}/\\d{2}/\\d{4}.*";

        if (frase.matches(patron)) {
            System.out.println("Hay una fecha");
        } else {
            System.out.println("No hay fecha");
        }

        String frase1 = "Mi DNI es: 89142442D";
        String patron1 = ".*\\d{8}[a-zA-Z].*";

        if (frase1.matches(patron1)) {
            System.out.println("DNI correcto");
        } else {
            System.out.println("DNI incorrecto");
        }

        String frase2 = "Mi matricula es: 1234KDR";
        String patron2 = ".*\\d{4}[A-Z]{3}.*";

        if (frase2.matches(patron2)) {
            System.out.println("Es una matricula valida");
        }
        else {
            System.out.println("Es una matricula invalida");
        }

        String frase3 = "Mi correo es: gcoz076@gmail.com";
        String patron3 = "[a-z]+\\d*@[a-z]+\\.[a-z]{2,3}";

        Pattern p = Pattern.compile(patron3);
        Matcher m = p.matcher(frase3);

        if (m.find()) {
            System.out.println("Contiene un correo");
        } else {
            System.out.println("No contiene un correo");
        }
    }
}
