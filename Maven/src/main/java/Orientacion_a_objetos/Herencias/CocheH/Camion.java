package Orientacion_a_objetos.Herencias.CocheH;

public class Camion extends Coche {

    private static int numPuertas;
    private int mma; // en kilos
    private int pasajeros; // incluido conductor
    private String carnet; // C, C1, C1+E, C+E
//constructores
    public Camion(String matricula, String tipo, int mma, int pasajeros, String carnet) {
        super(matricula, tipo, numPuertas);
        this.mma = mma;
        this.pasajeros = pasajeros;
        this.carnet = carnet;
    }
//getters y setters
    public int getMma() {
        return mma;
    }

    public void setMma(int mma) {
        this.mma = mma;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    //metodos
    public boolean puedeConducirse() {

        boolean resultado;
        resultado = false;

        if (carnet.equals("C")) {
            if (mma > 3500 && pasajeros <= 9) {
                resultado = true;
            }
        }

        if (carnet.equals("C1")) {
            if (mma >= 3500 && mma <= 7500 && pasajeros <= 9) {
                resultado = true;
            }
        }

        if (carnet.equals("C1+E")) {
            if (mma >= 3500 && mma <= 7500) {
                resultado = true;
            }
        }

        if (carnet.equals("C+E")) {
            if (mma > 3500) {
                resultado = true;
            }
        }

        return resultado;
    }

    public boolean tieneLimitacionParaCircular(String ciudad) {

        boolean limitado;
        limitado = false;

        if ((ciudad.equalsIgnoreCase("Madrid") || ciudad.equalsIgnoreCase("Barcelona")) &&
                (getTipo().equalsIgnoreCase("B") || getTipo().equalsIgnoreCase("C"))) {
            limitado = true;
        } else if ((ciudad.equalsIgnoreCase("Valencia") || ciudad.equalsIgnoreCase("Sevilla")) &&
                getTipo().equalsIgnoreCase("C")) {
            limitado = true;
        }

        return limitado;
    }

    @Override
    public String toString() {
        String texto;
        texto = super.toString() + ", Camion{" +
                "mma=" + mma +
                ", pasajeros=" + pasajeros +
                ", carnet='" + carnet + '\'' +
                '}';
        return texto;
    }
}
