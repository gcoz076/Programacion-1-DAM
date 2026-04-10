package Colecciones.Listas.Simulaciones.Algabyte.Models;

import Colecciones.Listas.Simulaciones.Algabyte.Exceptions.UserMemoryException;
import java.time.LocalDateTime;

public class Tweet extends Mensaje {
    public Tweet(int idMensaje, String contenido, LocalDateTime fecha, Usuario usuario, Valoraciones valoracion) {
        super(idMensaje, contenido, fecha, usuario, valoracion);
        if (contenido.length() > 50) {
            throw new UserMemoryException("Tu contenido no puede superar los 50 caracteres");
        }
    }
    public int contarPuntos() {
        if (getValoracion().equals(Valoraciones.SUPERBENA)) {
            setPuntos(6);
        } else if (getValoracion().equals(Valoraciones.MUYBUENA)) {
            setPuntos(4);
        } else if (getValoracion().equals(Valoraciones.BUENA)) {
            setPuntos(2);
        }else if (getValoracion().equals(Valoraciones.REGULAR)) {
            setPuntos(-2);
        } else if (getValoracion().equals(Valoraciones.MUYMALA)) {
            setPuntos(-4);
        }
        return getPuntos();
    }
}
