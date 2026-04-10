package Colecciones.Listas.Simulaciones.Ejercicio1.models;

import java.time.LocalDate;
import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
    //Atributos
    private String numBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private Propietario propietario;
    private LocalDate fechaMatriculacion;

    //Constructor, getters y setters
    public Vehiculo(String numBastidor, String matricula, String marca, String modelo, int anioDeFabricacion, Propietario propietario, LocalDate fechaMatriculacion) {
        this.numBastidor = numBastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.propietario = propietario;
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Vehiculo() {
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    //Metodos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(numBastidor, vehiculo.numBastidor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numBastidor);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numBastidor='" + getNumBastidor() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anioDeFabricacion=" + getAnioDeFabricacion() +
                ", propietario=" + getPropietario() +
                '}';
    }

    public int compareTo(Vehiculo vehiculo){
        return this.matricula.compareTo(vehiculo.getMatricula());
    }
}
