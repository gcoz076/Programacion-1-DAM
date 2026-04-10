package Colecciones.Listas.Mapas.Ejercicio1.Models;

import java.util.*;
import java.util.Iterator;

public class RegistroEntrada {
    Map<Influencer, EntradaVip> entradas;

    public RegistroEntrada(Map<Influencer, EntradaVip> entradas) {
        this.entradas = new HashMap<Influencer, EntradaVip>();
    }

    public Map<Influencer, EntradaVip> getEntradas() {
        return entradas;
    }

    public void setEntradas(Map<Influencer, EntradaVip> entradas) {
        this.entradas = entradas;
    }

    public void agregarEntradas(Influencer i, EntradaVip e){
        if (!entradas.containsKey(i)){
            entradas.put(i, e);
            e.setEstado(EstadoEntrada.ENVIADA);
            System.out.println("Enviada");
        }else {
            System.out.println("Ya a sido enviada");
        }
    }

    public EntradaVip buscar(String nick, String plataforma){
        Influencer i = new Influencer(nick, plataforma);
        EntradaVip encuentra = encuentra = entradas.get(i);
        return encuentra;
    }

    public void confirmarAsistencia(String nick, String plataforma){
        EntradaVip e = buscar(nick, plataforma);
        if (e != null){
            e.setEstado(EstadoEntrada.CONFIRMADA);
        }
        System.out.println("ENTRADA CONFIRMADA");
    }

    public void cancelarAsistencia(String nick, String plataforma){
        EntradaVip e = buscar(nick, plataforma);
        if (e != null){
            e.setEstado(EstadoEntrada.CANCELADA);
        }
        System.out.println("ENTRADA CANCELADA");
    }

    public Set<Influencer> listarConfirmados(){
        Set<Map.Entry<Influencer, EntradaVip>> parejas = entradas.entrySet();
        Set<Influencer> confirmados = new HashSet<Influencer>();
        Iterator <Map.Entry<Influencer, EntradaVip>> it = parejas.iterator();

        while (it.hasNext()){
            Map.Entry <Influencer, EntradaVip> confirmado = it.next();
            if (confirmado.getValue().getEstado() == EstadoEntrada.CONFIRMADA){
                confirmados.add(confirmado.getKey());
            }
        }

        return confirmados;
    }

    public Set<Influencer> listarCancelados(){
        Set<Map.Entry<Influencer, EntradaVip>> parejas = entradas.entrySet();
        Set<Influencer> cancelados = new HashSet<Influencer>();
        Iterator <Map.Entry<Influencer, EntradaVip>> it = parejas.iterator();

        while (it.hasNext()){
            Map.Entry <Influencer, EntradaVip> cancelado = it.next();
            if (cancelado.getValue().getEstado() == EstadoEntrada.CANCELADA){
                cancelados.add(cancelado.getKey());
            }
        }

        return cancelados;
    }

    public Set<Influencer> listarPendientes(){
        Set<Map.Entry<Influencer, EntradaVip>> parejas = entradas.entrySet();
        Set<Influencer> pendientes = new HashSet<Influencer>();
        Iterator <Map.Entry<Influencer, EntradaVip>> it = parejas.iterator();

        while (it.hasNext()){
            Map.Entry<Influencer, EntradaVip> pendiente = it.next();
            if (pendiente.getValue().getEstado() != EstadoEntrada.ENVIADA){
                pendientes.add(pendiente.getKey());
            }
        }

        return pendientes;
    }


}