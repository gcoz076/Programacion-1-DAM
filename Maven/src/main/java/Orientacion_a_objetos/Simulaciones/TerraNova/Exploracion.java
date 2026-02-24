package Orientacion_a_objetos.Simulaciones.TerraNova;

import java.time.LocalDate;

public class Exploracion extends Mision{
    //Atributo
    private String destino;
    private int numTripulacion;

    //Constructor
    public Exploracion(int codigo, String nombre, LocalDate fechaLanzamiento, Nave nave, EstadoMision estado, String destino, int numTripulacion) {
        super(codigo, nombre, fechaLanzamiento, nave, estado);
        this.destino = destino;
        this.numTripulacion = numTripulacion;
    }

    //Metodo
    public boolean evaluacionRiesgo(){
        boolean tieneRiesgo = false;
        LocalDate hoy = LocalDate.now();
        if (this.destino.equals("MARTE") || getFechaLanzamiento().isAfter(hoy)){
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
