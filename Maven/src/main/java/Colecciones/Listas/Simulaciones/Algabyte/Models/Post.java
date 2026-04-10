package Colecciones.Listas.Simulaciones.Algabyte.Models;

import Colecciones.Listas.Simulaciones.Algabyte.Exceptions.UserMemoryException;

import java.time.LocalDateTime;

public class Post extends Mensaje {
    public Post(int idMensaje, String contenido, LocalDateTime fecha, Usuario usuario, Valoraciones valoracion) {
        super(idMensaje, contenido, fecha, usuario, valoracion);
        if (contenido.length() <= 0){
            throw new UserMemoryException("La contenido no puede estar vacio");
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
