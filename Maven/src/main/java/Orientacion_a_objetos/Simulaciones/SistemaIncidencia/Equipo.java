package Orientacion_a_objetos.Simulaciones.SistemaIncidencia;

import java.util.Objects;

public class Equipo {
    //Atributos
    private String nombreEquipo;
    private String direccionMAC;
    private String sistemaOp;
    private int incidentesPend;
    private Usuario usuario;


    //Constructores
    public Equipo(String nombreEquipo, String direccionMAC, String sistemaOp, Usuario usuario) {
        this.nombreEquipo = nombreEquipo;
        this.direccionMAC = direccionMAC;
        this.sistemaOp = sistemaOp;
        this.usuario = usuario;
    }

    //Métodos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(direccionMAC, equipo.direccionMAC);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(direccionMAC);
    }

    @Override
    public String toString() {
        return "Equipo: " +
                nombreEquipo + " - " +
                direccionMAC +
                " - Usuario: " +
                usuario.getNombre() +
                " - Incidentes pendientes: " +
                incidentesPend;
    }

}
