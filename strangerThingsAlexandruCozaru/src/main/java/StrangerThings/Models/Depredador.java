package StrangerThings.Models;

public class Depredador extends CriaturaUpsideDown{
    //Atributos
    private boolean tieneHabilidadRegeneracion;

    //Constructores
    public Depredador(String nombre, double nivelInfeccion, boolean tieneHabilidadRegeneracion) {
        super(nombre, nivelInfeccion);
        this.tieneHabilidadRegeneracion = tieneHabilidadRegeneracion;
    }

    public Depredador(String nombre, double saludBase, double nivelInfeccion, boolean tieneHabilidadRegeneracion) {
        super(nombre, saludBase, nivelInfeccion);
        this.tieneHabilidadRegeneracion = tieneHabilidadRegeneracion;
    }

    //Metodos

    @Override
    public String toString() {
        return "[" +
                "ID:" + getIdEntidad() +
                ", Nombre: " + getNombre() +
                ", Salud: " + getSaludBase() +
                ", Tiene Habilidad De Regeneracion: " + tieneHabilidadRegeneracion +
                ", Nivel de Infección: " + getNivelInfeccion() +
                "]";
    }
}
