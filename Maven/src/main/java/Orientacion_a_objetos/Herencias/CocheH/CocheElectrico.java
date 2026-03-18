package Orientacion_a_objetos.Herencias.CocheH;

public class CocheElectrico extends Coche {
    private String tipoBateria; // LFP, NCM
//constructores
    public CocheElectrico(String matricula, String tipo, int numPuertas, String tipoBateria) {
        super(matricula, tipo, numPuertas);
        this.tipoBateria = tipoBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }
//metodo
    public void setTipoBateria(String tipoBateria) {
        if (tipoBateria.equals("LFP") || tipoBateria.equals("NCM")) {
            this.tipoBateria = tipoBateria;
        }
    }
//tostring
    @Override
    public String toString() {
        String texto;
        texto = super.toString() + ", CocheElectrico{" +
                "tipoBateria='" + tipoBateria + '\'' +
                '}';
        return texto;
    }
}
