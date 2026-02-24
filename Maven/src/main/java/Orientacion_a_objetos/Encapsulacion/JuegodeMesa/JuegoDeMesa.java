package Orientacion_a_objetos.Encapsulacion.JuegodeMesa;

public class JuegoDeMesa {
    public static void main(String[] args) {
        Participante p1 = new Participante("Soy el mejor", "Alex", 22);
        Participante p2 = new Participante("Wisin", "pedro", 18);
        Participante p3 = new Participante("Yandel", "pepe", 20);
        Participante p4 = new Participante("Falete", "Fali", 23);

        Participante[] jugadores = {p1, p2, p3, p4};
        Partida partidaUno = new Partida("Catan", jugadores);

        partidaUno.obtenerJugadorMayorPuntuacion();
    }
}
