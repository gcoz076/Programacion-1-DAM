package excepciones.Boletin_2.Ejercicio1.models;

import excepciones.Boletin_2.Ejercicio1.CaracterNoTraducibleException;

public class TraductorMorse {

    public boolean traducir(String texto) throws CaracterNoTraducibleException {

        boolean invalido = false;
        String validaLetras = "[a-zA-Z ]*";

        if (!texto.matches(validaLetras)) {
            invalido = true;

            // Detectamos el primer carácter no válido
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (!Character.isLetter(c) && c != ' ') {
                    throw new CaracterNoTraducibleException(c, i);
                }
            }
        } else {
            invalido = false;
        }

        return invalido;
    }

    @Override
    public String toString() {
        return "TraductorMorse listo para traducir textos";
    }
}