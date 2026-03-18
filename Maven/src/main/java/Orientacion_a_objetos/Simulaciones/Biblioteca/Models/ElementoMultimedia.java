package Orientacion_a_objetos.Simulaciones.Biblioteca.Models;

public abstract class ElementoMultimedia extends Recurso {

    private String nombre;
    private String genero;

    public ElementoMultimedia(String id, String ubicacion, int unidades,
                              String nombre, String genero) {
        super(id, ubicacion, unidades);
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 10;
    }
}
