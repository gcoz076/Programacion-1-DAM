package Orientacion_a_objetos.Herencias.HerenciaVehiculo;

public class CocheElectrico extends Automovil {
    private TipoBateria tipoBateria;
    private final TipoVehiculo tipoVehiculo = TipoVehiculo.ECO; // siempre ECO

    public CocheElectrico(String dueno, int numPuertas, int numRuedas,
                          String calificacionEcologica, TipoBateria tipoBateria) {
        super(dueno, numPuertas, numRuedas, calificacionEcologica);
        this.tipoBateria = tipoBateria;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public TipoBateria getTipoBateria() {
        TipoBateria bateriaValida = TipoBateria.LFP;
        if (tipoBateria == TipoBateria.LFP || tipoBateria == TipoBateria.NCM) {
            bateriaValida = tipoBateria;
        }
        return bateriaValida;
    }

    public void setTipoBateria(TipoBateria tipoBateria) {
        this.tipoBateria = tipoBateria;
    }
}
