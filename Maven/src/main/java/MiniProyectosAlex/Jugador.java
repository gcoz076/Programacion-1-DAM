package MiniProyectosAlex;

public class Jugador {
    // Atributos
    String nombreJugador;
    double dineroJugador;
    int propiedadesJugador;
    int casillaJugador;
    int casillaPropiedadesJugador;

    // Constructores
    public Jugador(String nombreJugador, double dineroJugador, int propiedadesJugador, int casillaJugador) {
        this.nombreJugador = nombreJugador;
        this.dineroJugador = dineroJugador;
        this.propiedadesJugador = propiedadesJugador;
        this.casillaJugador = casillaJugador;
    }

    // Metodos

    public int mueveFichaJugador() {

        return casillaJugador;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", dineroJugador=" + dineroJugador +
                ", propiedadesJugador=" + propiedadesJugador +
                ", casillaJugador=" + casillaJugador +
                ", casillaPropiedadesJugador=" + casillaPropiedadesJugador +
                '}';
    }
}
