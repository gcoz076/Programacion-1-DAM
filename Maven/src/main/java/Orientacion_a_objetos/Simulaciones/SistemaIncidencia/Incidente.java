package Orientacion_a_objetos.Simulaciones.SistemaIncidencia;

import java.time.LocalDate;

public class Incidente {
    //Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaIni;
    private String fechaFin;
    private EstadoIncidente estado;
    private Criticidad criticidad;
    private Equipo equipo;

    //Constructor
    public Incidente(int id, String nombre, String descripcion, LocalDate fechaIni, String fechaFin, Criticidad criticidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaIni = LocalDate.now();
        this.setFechaFin(fechaFin);
        this.estado = EstadoIncidente.Registrada;
        this.criticidad = criticidad;
    }

    public void setFechaFin(String fechaFin) {
        if (estado != EstadoIncidente.Cerrada) {
            this.fechaFin = fechaFin;
        }
        else {
            this.fechaFin = null;
        }
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    //Metodos
    public boolean esUrgente(){
        boolean urgente = false;
        LocalDate hoy = LocalDate.now();
        if (criticidad.equals(Criticidad.Critica)){
            urgente = true;
            System.out.println("El incidente está en estado crítico");
        }
        else if (criticidad.equals(Criticidad.Grave) && hoy.minusDays(7).isAfter(this.fechaIni)){
            urgente = true;
            System.out.println("El incidente en Grave y han pasado 7 días desde entonces.");
        }
        else if (criticidad.equals(Criticidad.Media) && hoy.minusDays(30).isAfter(this.fechaIni)) {
            urgente = true;
            System.out.println("El incidente en Media y han pasado 30 días desde entonces.");
        }
        else {
            urgente = false;
            System.out.println("No hay incidente urgente");
        }
        return urgente;
    }
}
