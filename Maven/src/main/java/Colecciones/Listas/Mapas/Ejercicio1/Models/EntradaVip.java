package Colecciones.Listas.Mapas.Ejercicio1.Models;

import java.time.LocalDate;

public class EntradaVip {
    private int codigoEntrada;
    private LocalDate fechaEntrada;
    private TipoEntrada tipo;
    private EstadoEntrada estado;

    public EntradaVip(int codigoEntrada, LocalDate fechaEntrada, TipoEntrada tipo, EstadoEntrada estado) {
        this.codigoEntrada = codigoEntrada;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoEntrada getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntrada tipo) {
        this.tipo = tipo;
    }

    public EstadoEntrada getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntrada estado) {
        this.estado = estado;
    }
}
