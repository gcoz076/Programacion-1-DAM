package Orientacion_a_objetos.Herencias.HerenciaVehiculo;

import java.util.Objects;

public class Vehiculo {

    private String dueno;
    private int numPuertas;
    private int numRuedas;

    public Vehiculo() {
    }

    public Vehiculo(String dueno, int numPuertas, int numRuedas) {
        this.dueno = dueno;
        this.numPuertas = numPuertas;
        this.numRuedas = numRuedas;
    }

    // Getters y Setters
    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void imprimirResumen() {
        System.out.println("Dueño: " + dueno);
        System.out.println("Puertas: " + numPuertas);
        System.out.println("Ruedas: " + numRuedas);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return numPuertas == vehiculo.numPuertas && numRuedas == vehiculo.numRuedas && Objects.equals(dueno, vehiculo.dueno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dueno, numPuertas, numRuedas);
    }
}
