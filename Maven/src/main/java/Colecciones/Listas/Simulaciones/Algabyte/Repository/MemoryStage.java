package Colecciones.Listas.Simulaciones.Algabyte.Repository;

import Colecciones.Listas.Simulaciones.Algabyte.Exceptions.UserMemoryException;
import Colecciones.Listas.Simulaciones.Algabyte.Models.*;
import java.util.*;

public class MemoryStage {
    private TreeMap<Usuario, List<Mensaje>> mapa;

    public MemoryStage(TreeMap<Usuario, List<Mensaje>> mapa) {
        this.mapa = new TreeMap<Usuario, List<Mensaje>>();
    }

    public TreeMap<Usuario, List<Mensaje>> añadirAMapa(Usuario usuario, List<Mensaje> mensajes) {
        if (!this.mapa.containsKey(usuario)) {
            mapa.put(usuario, mensajes);
        }
        return mapa;
    }

    public void añadirMensaje(Usuario usuario, Mensaje mensaje) {
        if (!this.mapa.containsKey(usuario)) {
            throw new UserMemoryException("Usuario no encontrado");
        }
    }

    public void Valorar(Mensaje mensaje, Tweet tweet, Post post, Recomendacion recomendacion) {
        int puntos;
        if (tweet instanceof Mensaje) {
            puntos = tweet.contarPuntos() * 2;
        } else if (post instanceof Mensaje){

        }
    }
}
