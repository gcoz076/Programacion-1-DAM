package Colecciones.Listas.Clonaciones.Ejercicio2.Models;

import java.util.LinkedHashSet;
import java.util.Set;

public class RepositorioReservas {

    private Set<Reserva> reservas = new LinkedHashSet<>();

    public void añadirReserva(Reserva r) {
        reservas.add(r);
    }

    public Reserva obtenerReserva(int id) {
        Reserva encontrada = null;

        for (Reserva r : reservas) {
            if (r.getId() == id) {
                encontrada = r;
            }
        }

        return encontrada;
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public Reserva cambiarAsiento(int id, String nuevoAsiento, boolean confirmar) {
        Reserva resultado = null;
        Reserva original = obtenerReserva(id);
        if (original != null) {
            if (confirmar) {
                original.setAsiento(nuevoAsiento);
                resultado = original;
            } else {
                Reserva copia = original.clone(); // 👈 AQUÍ está el cambio
                copia.setAsiento(nuevoAsiento);
                resultado = copia;
            }
        }
        return resultado;
    }
}