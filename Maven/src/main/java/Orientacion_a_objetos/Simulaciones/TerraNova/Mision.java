package Orientacion_a_objetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public abstract class Mision {
    //Atributos
    private int codigo;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private Nave nave;
    private EstadoMision estado;

    //Constructor
    public Mision(int codigo, String nombre, LocalDate fechaLanzamiento, Nave nave, EstadoMision estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.nave = nave;
        this.estado = estado;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    //Metodo
    private boolean fechaPasada(){
        boolean esPasado = false;
        LocalDate hoy = LocalDate.now();
        if (fechaLanzamiento.isAfter(hoy)){
            System.out.println("La fecha es correcta");
            esPasado = false;
        }
        else {
            System.out.println("Fecha incorrecta");
            esPasado = true;
        }
        return esPasado;
    }

    public abstract boolean evaluacionRiesgo();

    @Override
    public String toString() {
        return "Mision{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", nave=" + nave +
                ", estado=" + estado +
                '}';
    }
}
