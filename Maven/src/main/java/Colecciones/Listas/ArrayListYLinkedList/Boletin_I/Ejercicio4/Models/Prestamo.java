package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio4.Models;

import java.time.LocalDateTime;

public class Prestamo {
    private LibroP libroP;
    private int idPrest;
    static int contador;
    private Usuario usuario;
    private LocalDateTime fecha;

    public Prestamo(LibroP libroP, Usuario usuario) {
        this.libroP = libroP;
        this.idPrest = contador++;
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

}
