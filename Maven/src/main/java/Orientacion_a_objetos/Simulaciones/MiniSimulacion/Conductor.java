package Orientacion_a_objetos.Simulaciones.MiniSimulacion;

public class Conductor {

    //Atributos
    private String nombre;
    private int aniosExperiencia;

    //Constructor
    public Conductor(String nombre, int aniosExperiencia) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }

    //Guetter
    public String getNombre() {
        return nombre;
    }

    //Metodo
    public void conducir() {
        System.out.println(nombre + " conduciendo");
    }
}

