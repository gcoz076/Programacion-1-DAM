package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio1.Models;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<Grupo> grupos;

    public Instituto() {
        grupos = new ArrayList<>();
    }

    public void agregarGrupo(Grupo g) {
        grupos.add(g);
    }

    public Grupo buscarGrupo(String descripcion) {
        Grupo encontrado = null;
        for(int i = 0; i < grupos.size() && encontrado == null; i++) {
            Grupo g = grupos.get(i);
            if(g.getDescripcion().equalsIgnoreCase(descripcion)) {
                encontrado = g;
            }
        }
        return encontrado;
    }
}
