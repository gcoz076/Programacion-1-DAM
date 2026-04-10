package Colecciones.Listas.Clonaciones.Ejercicio2.Models;

import java.util.Objects;

import java.util.Objects;

public class Reserva implements Cloneable {
    private static int contador;

    private int id;
    private String nombrePasajero;
    private String destino;
    private String asiento;
    private double precio;

    public Reserva(String nombrePasajero, String destino, String asiento, double precio) {
        this.id = contador++;
        this.nombrePasajero = nombrePasajero;
        this.destino = destino;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getAsiento() { return asiento; }
    public double getPrecio() { return precio; }

    public void setAsiento(String asiento) { this.asiento = asiento; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public Reserva clone() {
        Reserva copia = null;
        try {
            copia = (Reserva) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copia;
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales = false;

        if (this == o) {
            iguales = true;
        } else if (o != null && o instanceof Reserva) {
            Reserva r = (Reserva) o;
            if (this.id == r.id) {
                iguales = true;
            }
        }

        return iguales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Reserva{id=" + id +
                ", pasajero='" + nombrePasajero +
                "', destino='" + destino +
                "', asiento='" + asiento +
                "', precio=" + precio + "}";
    }
}