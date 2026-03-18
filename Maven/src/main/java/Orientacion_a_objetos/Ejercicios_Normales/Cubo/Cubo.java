package Orientacion_a_objetos.Ejercicios_Normales.Cubo;

public class Cubo {
    // Atributos
    int lado;
    int litrosActuales;

    // Constructor
    public Cubo(int lado) {
        this.lado = lado;
        this.litrosActuales = 0;
    }

    // Método
    public int areaTotal() {
        return 6 * lado * lado;
    }

    public int volumen() {
        return lado * lado * lado;
    }

    public boolean rellenar(int litros) {
        if (litrosActuales + litros <= volumen()) {
            litrosActuales += litros;
            return true;
        }
        return false;
    }

    public boolean vaciar(int litros) {
        if (litrosActuales - litros >= 0) {
            litrosActuales -= litros;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                ", litrosActuales=" + litrosActuales +
                '}';
    }
}
