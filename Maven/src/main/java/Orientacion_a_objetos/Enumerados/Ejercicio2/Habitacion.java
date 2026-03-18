package Orientacion_a_objetos.Enumerados.Ejercicio2;

public class Habitacion {

    // Atributo
     private String nombre;
     private double tamanio;
     private int nivelSuciedad;
     private EstadoHabitacion estado;

     // Constructor
    public Habitacion(String nombre, double tamanio, int nivelSuciedad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.nivelSuciedad = nivelSuciedad;
        this.estado = EstadoHabitacion.LIBRE;
    }

    // Metodo
     void aniadirEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

     EstadoHabitacion getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", tamanio=" + tamanio +
                ", nivelSuciedad=" + nivelSuciedad +
                ", estado=" + estado +
                '}';
    }
}

