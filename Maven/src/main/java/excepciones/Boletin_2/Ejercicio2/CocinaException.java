package excepciones.Boletin_2.Ejercicio2;

public class CocinaException extends Exception {

    public CocinaException(String mensaje) {
        super(mensaje);
    }

    @Override
    public String toString() {
        return "Error de cocina: " + getMessage();
    }
}
