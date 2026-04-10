package Colecciones.Listas.Clonaciones.Ejercicio2.Controller;

import Colecciones.Listas.Clonaciones.Ejercicio2.Models.*;

public class GestionaReservas {
    public static void main(String[] args) {

        RepositorioReservas repo = new RepositorioReservas();

        Reserva r1 = new Reserva("Carlos Ruiz", "Roma", "14A", 220);
        Reserva r2 = new Reserva("Carla Ruiz", "Roma", "14B", 220);

        repo.añadirReserva(r1);
        repo.añadirReserva(r2);

        Reserva reservaPrevia = repo.obtenerReserva(1);

        System.out.println("Reservas iniciales:");
        repo.mostrarReservas();

        reservaPrevia.setAsiento("22C");
        reservaPrevia.setPrecio(195);

        System.out.println("\nDespués de modificar:");
        System.out.println("Original en repo: " + repo.obtenerReserva(1));
        System.out.println("reservaPrevia: " + reservaPrevia);

        System.out.println("\nSimulación cambio asiento:");
        Reserva simulada = repo.cambiarAsiento(2, "3D", false);
        System.out.println(simulada);

        System.out.println("\nLista tras simulación:");
        repo.mostrarReservas();

        System.out.println("\nConfirmando cambio:");
        repo.cambiarAsiento(2, "3D", true);

        System.out.println("\nLista final:");
        repo.mostrarReservas();
    }
}
