package Orientacion_a_objetos.Encapsulacion.JuegodeMesa;

public class Participante {
    //Atributos
    private String nick;
    private String nombre;
    private int edad;
    private int puntuacion;

    //Constructores
    public Participante(String nick, String nombre, int puntuacion) {
        this.nick = nick;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNick() {
        return nick;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    //Metodos

    @Override
    public String toString() {
        return "Participante [" +
                "nombre = " + nombre +
                ", nick = " + nick + "]"
                ;
    }
}
