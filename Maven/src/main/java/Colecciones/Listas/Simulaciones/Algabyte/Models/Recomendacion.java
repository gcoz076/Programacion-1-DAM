package Colecciones.Listas.Simulaciones.Algabyte.Models;

import Colecciones.Listas.Simulaciones.Algabyte.Exceptions.UserMemoryException;

import java.time.LocalDateTime;

public class Recomendacion extends Mensaje {
    public Recomendacion(int idMensaje, String contenido, LocalDateTime fecha, Usuario usuario, Valoraciones valoracion) {
        super(idMensaje, contenido, fecha, usuario, valoracion);
        if (contenido.length() < 100 && contenido.length() > 200){
            throw new UserMemoryException("La contenido tiene un minimo de 100 caracteres y un máximo de 200 caracteres");
        }
    }
    public int contarPuntos() {
        if (getValoracion().equals(Valoraciones.SUPERBENA)) {
            setPuntos(3);
        } else if (getValoracion().equals(Valoraciones.MUYBUENA)) {
            setPuntos(2);
        } else if (getValoracion().equals(Valoraciones.BUENA)) {
            setPuntos(1);
        }else if (getValoracion().equals(Valoraciones.REGULAR)) {
            setPuntos(1);
        } else if (getValoracion().equals(Valoraciones.MUYMALA)) {
            setPuntos(2);
        }
        return getPuntos();
    }
}
