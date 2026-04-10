package Colecciones.Listas.Mapas.Prueba.Models;

public class Nota {
    private Alumno alumno;
    private Double primerTrm;
    private Double segundoTrim;
    private Double tercerTrim;

    public Nota(Alumno alumno, Double primerTrm, Double segundoTrim, Double tercerTrim) {
        this.alumno = alumno;
        this.primerTrm = primerTrm;
        this.segundoTrim = segundoTrim;
        this.tercerTrim = tercerTrim;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Double getPrimerTrm() {
        return primerTrm;
    }

    public void setPrimerTrm(Double primerTrm) {
        this.primerTrm = primerTrm;
    }

    public Double getSegundoTrim() {
        return segundoTrim;
    }

    public void setSegundoTrim(Double segundoTrim) {
        this.segundoTrim = segundoTrim;
    }

    public Double getTercerTrim() {
        return tercerTrim;
    }

    public void setTercerTrim(Double tercerTrim) {
        this.tercerTrim = tercerTrim;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "primerTrm=" + getPrimerTrm() +
                ", segundoTrim=" + getSegundoTrim() +
                ", tercerTrim=" + getTercerTrim() +
                '}';
    }
}
