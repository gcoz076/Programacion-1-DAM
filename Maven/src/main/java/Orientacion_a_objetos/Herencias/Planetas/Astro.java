package Orientacion_a_objetos.Herencias.Planetas;

public class Astro {

    protected String nombre;
    protected double masa;
    protected double diametroMedio;
    protected double periodoRotacion;      // horas
    protected double periodoTraslacion;    // horas
    protected double distanciaMedia;       // km

    // Constructor
    public Astro(String nombre, double masa, double diametroMedio,
                 double periodoRotacion, double periodoTraslacion,
                 double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    @Override
    public String toString() {
        return "Astro: " + nombre +
                " | Masa: " + masa +
                " | Diámetro: " + diametroMedio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Astro)) return false;

        Astro otro = (Astro) obj;

        return nombre.equals(otro.nombre) &&
                masa == otro.masa &&
                distanciaMedia == otro.distanciaMedia;
    }

    public void muestraInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro medio: " + diametroMedio);
        System.out.println("Periodo de rotación: " + periodoRotacion);
        System.out.println("Periodo de traslación: " + periodoTraslacion);
        System.out.println("Distancia media: " + distanciaMedia);
    }
}