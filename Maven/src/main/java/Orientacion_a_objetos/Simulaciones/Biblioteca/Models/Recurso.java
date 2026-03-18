package Orientacion_a_objetos.Simulaciones.Biblioteca.Models;

public abstract class Recurso implements IPrestable {

    private String identificador;
    private String ubicacion;
    private int unidadesTotales;
    private int unidadesPrestadas;

    public Recurso(String identificador, String ubicacion, int unidadesTotales) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.unidadesTotales = unidadesTotales;
        this.unidadesPrestadas = 0;
    }

    public boolean estaDisponible() {
        return unidadesPrestadas < unidadesTotales;
    }

    public void prestar() {
        if (estaDisponible()) {
            unidadesPrestadas++;
        }
    }

    public void devolver() {
        if (unidadesPrestadas > 0) {
            unidadesPrestadas--;
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
