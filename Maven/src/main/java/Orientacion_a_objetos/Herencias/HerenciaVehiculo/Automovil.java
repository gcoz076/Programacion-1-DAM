package Orientacion_a_objetos.Herencias.HerenciaVehiculo;

public class Automovil extends Vehiculo {

    private String calificacionEcologica;

    public Automovil() {}

    public Automovil(String dueno, int numPuertas, int numRuedas,
                     String calificacionEcologica) {
        super(dueno, numPuertas, numRuedas);
        this.calificacionEcologica = calificacionEcologica;
    }

    public String getCalificacionEcologica() {
        return calificacionEcologica;
    }

    public void setCalificacionEcologica(String calificacionEcologica) {
        this.calificacionEcologica = calificacionEcologica;
    }

    // Este método se puede sobrescribir si se quiere
    public boolean tieneLicenciaParaCircular(String ciudad, TipoVehiculo tipoVehiculo) {
        boolean limitacion = false;

        if ((ciudad.equalsIgnoreCase("Madrid") || ciudad.equalsIgnoreCase("Barcelona"))
                && (tipoVehiculo == TipoVehiculo.B || tipoVehiculo == TipoVehiculo.C)) {
            limitacion = true;
        } else if ((ciudad.equalsIgnoreCase("Valencia") || ciudad.equalsIgnoreCase("Sevilla"))
                && tipoVehiculo == TipoVehiculo.C) {
            limitacion = true;
        }

        return !limitacion; // true si puede circular
    }
}
