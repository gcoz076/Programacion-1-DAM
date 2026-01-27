package Expresiones_Regulares;

public class Ejercicio20 {
    public static void main(String[] args) {
        String[] telefonos = {"+34 612-123-123", "954-12-12-12", "712345678", "123456789"};
        String regex = "(\\+\\d{2}[ -]?)?[967]\\d{2}([- ]?\\d{2,3}){2,3}";

        for (String tel : telefonos) {
            if (tel.matches(regex)) {
                System.out.println(tel + " → válido");
            } else {
                System.out.println(tel + " → inválido");
            }
        }
    }
}
