package Orientacion_a_objetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public class Logistica extends Mision {
    //Atributos
    private double carga;

    //Constructor
    public Logistica(int codigo, String nombre, LocalDate fechaLanzamiento, Nave nave, EstadoMision estado, double carga) {
        super(codigo, nombre, fechaLanzamiento, nave, estado);
        this.carga = carga;
    }

    //Metodos
    public boolean evaluacionRiesgo(){
        boolean tieneRiesgo = false;
        int dia = getFechaLanzamiento().getDayOfWeek().getValue();
        if (this.carga > 50 || dia >= 6){
            tieneRiesgo = true;
            System.out.println("Esta misión tiene riesgo");
        }
        else {
            tieneRiesgo = false;
            System.out.println("Esta misión no tiene riesgo");
        }
        return tieneRiesgo;
    }
}