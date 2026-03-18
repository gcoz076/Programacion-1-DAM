package excepciones.Boletin_2.Ejercicio1;

public class CaracterNoTraducibleException extends Exception {

    private char caracter;
    private int posicion;

    public CaracterNoTraducibleException(char caracter, int posicion) {
        this.caracter = caracter;
        this.posicion = posicion;
    }

    public char getCaracter() {
        return caracter;
    }

    public int getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Caracter no traducible: '" + caracter + "' en posición " + posicion;
    }
}
