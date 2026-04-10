package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Prestamo {
    private LibroP libroP;
    private int idPrest;
    static int contador;
    private Usuario usuario;
    private LocalDateTime fecha;

    public Prestamo(LibroP libroP, Usuario usuario) {
        this.libroP = libroP;
        contador++;
        this.idPrest = contador;
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
    }

    public LibroP getLibro() {
        return libroP;
    }

    public void setLibro(LibroP libroP) {
        this.libroP = libroP;
    }

    public int getIdPrest() {
        return idPrest;
    }

    public void setIdPrest(int idPrest) {
        this.idPrest = idPrest;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(libroP, prestamo.libroP) && Objects.equals(usuario, prestamo.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libroP, usuario);
    }

    @Override
    public String toString() {
        return "ID: " + idPrest +
                " | Libro: " + libroP.getTitulo() +
                " | Usuario: " + usuario.getNombre() +
                " | Fecha: " + fecha;
    }
}
