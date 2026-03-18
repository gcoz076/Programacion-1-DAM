package eaSport.Models;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Personajes implements IAnalizable {
    //Atributos
    private final String alias;
    private int nivelMaestria;
    private LocalDate fechaDesbloqueo;

    //Constructor, getter y setter
    public Personajes(String alias, int nivelMaestria) {
        this.alias = alias;
        this.setNivelMaestria(nivelMaestria);
        this.fechaDesbloqueo = LocalDate.now();
    }

    public String getAlias() {
        return alias;
    }

    public int getNivelMaestria() {
        return nivelMaestria;
    }

    public void setNivelMaestria(int nivelMaestria) {
        if (nivelMaestria > 100){
            this.nivelMaestria = 100;
        }
        else if (nivelMaestria < 1){
            this.nivelMaestria = 1;
        }
        else {
            this.nivelMaestria = nivelMaestria;
        }

    }

    public LocalDate getFechaDesbloqueo() {
        return fechaDesbloqueo;
    }

    public void setFechaDesbloqueo(LocalDate fechaDesbloqueo) {
        this.fechaDesbloqueo = fechaDesbloqueo;
    }

    //Metodos
    public abstract Rangos getRangoCompetitivo();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personajes that = (Personajes) o;
        return Objects.equals(alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(alias);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " | Alias: " + getAlias() +
                " | nivelMaestria: " + getNivelMaestria() +
                " | fechaDesbloqueo: " + getFechaDesbloqueo() +
                " |";
    }
}
