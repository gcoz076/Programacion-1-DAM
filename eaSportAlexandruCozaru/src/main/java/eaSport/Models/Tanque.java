package eaSport.Models;

public class Tanque extends Personajes {
    //Atributos
    private double capacidadEscudo;

    //Constructor, guetter y setter
    public Tanque(String alias, int nivelMaestria, double capacidadEscudo) {
        super(alias, nivelMaestria);
        this.capacidadEscudo = capacidadEscudo;
    }

    public double getCapacidadEscudo() {
        return capacidadEscudo;
    }

    public void setCapacidadEscudo(double capacidadEscudo) {
        this.capacidadEscudo = capacidadEscudo;
    }

    //Metodo
    @Override
    public Rangos getRangoCompetitivo() {
        System.out.println("Su rango es: " + Rangos.Titan);
        return Rangos.Titan;
    }

    @Override
    public String generarMetrica() {
        String nombre = getAlias().toUpperCase();
        String cadena = nombre + getFechaDesbloqueo();
        return cadena;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " | Alias: " + getAlias() +
                " | nivelMaestria: " + getNivelMaestria() +
                " | fechaDesbloqueo: " + getFechaDesbloqueo() +
                " | Capacidad Escudo: " + getCapacidadEscudo() +
                " |";
    }
}
