package Orientacion_a_objetos.Herencias.CocheH;

public class Coche extends Vehiculo {
    private int numPuertas;
//CONSTRUCTORES
    public Coche(String matricula, String tipo, int numPuertas) {
        super(matricula, tipo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    //METODOS
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
//tostring
    @Override
    public String toString() {
        String texto;
        texto = super.toString() + ", Automovil{" +
                "numPuertas=" + numPuertas +
                '}';
        return texto;
    }
}
