package Colecciones.Listas.Simulaciones.Ejercicio1.models;

import java.util.*;

public class RepoVehiculo {
    //Atributos
    private Map<String, List<Vehiculo>> mapa;

    //Contructor
    public RepoVehiculo(List<Vehiculo> vehiculos) {
        this.mapa = new HashMap<String, List<Vehiculo>>();
    }

    //Metodos
    public Map<String, List<Vehiculo>> addVehiculo(Vehiculo v){
        if (!mapa.containsKey(v.getNumBastidor())){
            List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
            vehiculos.add(v);
            mapa.put(v.getNumBastidor(), vehiculos);
        }
        return mapa;
    }

    public Map<String, List<Vehiculo>> rematriculacion(Vehiculo v){
        if (mapa.containsKey(v.getNumBastidor())){
            List<Vehiculo> lista = mapa.get(v.getNumBastidor());
            lista.add(v);
        }
        return mapa;
    }

    public void busquedaVehiculo(String numBastidor){
        List<Vehiculo> lista = mapa.get(numBastidor);
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i);
        }
    }

    public List<Vehiculo> mostrarVehiculosPropietarios(Propietario p){
        Vehiculo v = new Vehiculo();
        List<Vehiculo> listaPropietario = new ArrayList<Vehiculo>();
        for (List<Vehiculo> lista : mapa.values()){
            for (Vehiculo vehiculo : lista){
                if (vehiculo.getPropietario().equals(p)){
                    listaPropietario.add(vehiculo);
                }
            }
        }
        Collections.sort(listaPropietario);
        return listaPropietario;
    }

    public void mostrarRematriculaciones(String numBastidor){
        List<Vehiculo> lista = mapa.get(numBastidor);
        if (lista == null){
            System.out.println("Vehículo no encontrado");
            return;
        }
        Collections.sort(lista, Comparator.comparing(Vehiculo::getFechaMatriculacion));
        for (Vehiculo v : lista){
            System.out.println("Matrícula: " + v.getMatricula() +
                    " | Fecha: " + v.getFechaMatriculacion());
        }
    }
}
