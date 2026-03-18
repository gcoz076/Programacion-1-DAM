package StrangerThings.Models;

public class MiembroGrupoHawkins extends Humano{
    //Atributos
    private boolean tienePoderPsiquico;

    //Constructores
    public MiembroGrupoHawkins(String nombre, boolean tieneEquipo, boolean tienePoderPsiquico) {
        super(nombre, tieneEquipo);
        this.tienePoderPsiquico = tienePoderPsiquico;
    }

    public MiembroGrupoHawkins(String nombre, double saludBase, boolean tieneEquipo, boolean tienePoderPsiquico) {
        super(nombre, saludBase, tieneEquipo);
        this.tienePoderPsiquico = tienePoderPsiquico;
    }

    public boolean isTienePoderPsiquico() {
        return tienePoderPsiquico;
    }

    public void setTienePoderPsiquico(boolean tienePoderPsiquico) {
        this.tienePoderPsiquico = tienePoderPsiquico;
    }

    //Metodos
    @Override
    public double calcularDannoPotencial(int factorAmenaza) {
        double dannoPotencial = super.calcularDannoPotencial(factorAmenaza);
        if (tienePoderPsiquico){
            dannoPotencial = dannoPotencial*2;
        }
        return dannoPotencial;
    }
}
