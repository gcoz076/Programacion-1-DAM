package StrangerThings.Models;

public class CriaturaEnjambre extends CriaturaUpsideDown {
    //Atributos
    private int tamannoEnjambre;

    //Constructores
    public CriaturaEnjambre(String nombre, double nivelInfeccion, int tamannoEnjambre) {
        super(nombre, nivelInfeccion);
        this.tamannoEnjambre = tamannoEnjambre;
    }

    public CriaturaEnjambre(String nombre, double saludBase, double nivelInfeccion, int tamannoEnjambre) {
        super(nombre, saludBase, nivelInfeccion);
        this.tamannoEnjambre = tamannoEnjambre;
    }

    //Metodos
    @Override
    public double calcularDannoPotencial(int factorAmenaza) {
        double dannoPotenciado = super.calcularDannoPotencial(factorAmenaza);
        dannoPotenciado = dannoPotenciado*tamannoEnjambre;
        return super.calcularDannoPotencial(factorAmenaza);
    }

    @Override
    public String toString() {
        return "[" +
                "ID: " + getIdEntidad() +
                ", Nombre: " + getNombre() +
                ", Salud: " + getSaludBase() +
                ", TamañoEnjambre: " + tamannoEnjambre +
                "]";
    }
}
