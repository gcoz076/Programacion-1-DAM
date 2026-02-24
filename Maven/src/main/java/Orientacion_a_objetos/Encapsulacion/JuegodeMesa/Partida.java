package Orientacion_a_objetos.Encapsulacion.JuegodeMesa;

public class Partida {
    //Atributos
    private String nombreJuego;
    private Participante[] jugadores = new Participante[4];
    private Participante ganador;

    //Constructor
    public Partida(String nombreJuego, Participante[] jugadores) {
        this.nombreJuego = nombreJuego;
        this.jugadores = jugadores;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public Participante[] getJugadores() {
        return jugadores;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }

    //Metodos
    public Participante obtenerJugadorMayorPuntuacion() {
        int puntuacion = 0;
        Participante ganadorActual = null;
        for (int i = 0; i < jugadores.length; i++) {
            if (this.jugadores[i] != null && jugadores[i].getPuntuacion() > puntuacion) {
                puntuacion = jugadores[i].getPuntuacion();
                ganadorActual = jugadores[i];
            }
        }
        setGanador(ganadorActual);
        System.out.println("El ganador es: " + getGanador() + " con la puntuación: " + puntuacion);
        return ganadorActual;
    }
}
