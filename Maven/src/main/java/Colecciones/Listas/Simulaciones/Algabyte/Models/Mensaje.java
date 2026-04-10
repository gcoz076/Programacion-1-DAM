package Colecciones.Listas.Simulaciones.Algabyte.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Mensaje {
    //Atributos
    private int idMensaje;
    static int contador;
    private String contenido;
    private LocalDateTime fecha;
    private Usuario usuario;
    private Valoraciones valoracion;
    private int puntos;

    //Constructor, guetter y setter
    public Mensaje(int idMensaje, String contenido, LocalDateTime fecha, Usuario usuario, Valoraciones valoracion) {
        this.idMensaje = contador++;
        this.contenido = contenido;
        this.fecha = fecha;
        this.usuario = usuario;
        this.valoracion = valoracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Valoraciones getValoracion() {
        return valoracion;
    }

    public void setValoracion(Valoraciones valoracion) {
        this.valoracion = valoracion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //Metodos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje = (Mensaje) o;
        return idMensaje == mensaje.idMensaje;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idMensaje);
    }

    public abstract int contarPuntos();
}
