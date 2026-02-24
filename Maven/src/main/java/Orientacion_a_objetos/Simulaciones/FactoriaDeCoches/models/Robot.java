package Orientacion_a_objetos.Simulaciones.FactoriaDeCoches.models;

import java.util.Objects;

public abstract class Robot {
    //Atributos
    private static int contador;
    private int id;
    private String modelo;
    private EstadoRobot estado;
    private double bateria;
    private String combustible;
    private String Descripcion;

    //Constructor, getter y setters
    public Robot(int id, String modelo, EstadoRobot estado, double bateria, String combustible) {
        this.id = id;
        this.modelo = modelo;
        this.estado = estado;
        this.bateria = bateria;
        this.combustible = combustible;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Robot.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public EstadoRobot getEstado() {
        return estado;
    }

    public void setEstado(EstadoRobot estado) {
        this.estado = estado;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    //Metodos

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return id == robot.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "descripcion='" + getDescripcion() + '\'' +
                ", bateria=" + getBateria() +
                ", combustible='" + getCombustible() + '\'' +
                ", estado=" + getEstado() +
                ", modelo='" + getModelo() + '\'' +
                ", id=" + getId() +
                '}';
    }
    public boolean esSuficiente(){
        boolean suficiente = false;
        if (bateria > 10){
            suficiente = true;
        }
        return suficiente;
    }

    public abstract String ejecutarTarea();

    public abstract boolean recargar();
}
