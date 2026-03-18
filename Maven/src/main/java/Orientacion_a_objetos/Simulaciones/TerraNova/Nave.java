package Orientacion_a_objetos.Simulaciones.TerraNova;

import java.util.Objects;

public class Nave {
    //Atributo
    private String codigo;
    private String modelo;
    private int horasVuelo;
    private Comandante comandante; // NUEVO

    //Constructor
    public Nave(String codigo, String modelo, int horasVuelo, Comandante comandante) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.horasVuelo = horasVuelo;
        this.comandante = comandante;
    }

    //Metodo
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return Objects.equals(codigo, nave.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Nave{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horasVuelo=" + horasVuelo +
                ", comandante=" + comandante.getNombre() +
                '}';
    }
}
