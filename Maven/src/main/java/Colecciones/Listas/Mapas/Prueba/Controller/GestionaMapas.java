package Colecciones.Listas.Mapas.Prueba.Controller;

import Colecciones.Listas.Mapas.Prueba.Models.Alumno;
import Colecciones.Listas.Pruebas.Clonados.Models.Persona;

import java.util.*;

public class GestionaMapas {
    public static void main(String[] args) {
        Map<Alumno, Double> mapa = new HashMap<Alumno, Double>();
        Alumno alumno1 = new Alumno("12345678L");
        Alumno alumno2 = new Alumno("12345677K");
        Alumno alumno3 = new Alumno("12345676R");

        mapa.put(alumno1, 7.2);
        mapa.put(alumno2, 5.5);
        mapa.put(alumno3, 4.2);

        System.out.println(mapa.toString());
        System.out.println(mapa.size());

        Set<Alumno> claves = mapa.keySet();
        System.out.println(claves);

        Collection<Double> valores = mapa.values();
        System.out.println(valores);

        Map<Alumno, List<Double>> mapa2 = new LinkedHashMap<Alumno, List<Double>>();
        List<Double> lista1 = new ArrayList<Double>();
        lista1.add(4.7);
        lista1.add(5.2);
        lista1.add(6.4);
        List<Double> lista2 = new ArrayList<Double>();
        lista2.add(7.1);
        lista2.add(8.2);
        lista2.add(7.8);

        mapa2.put(alumno1, lista1);
        mapa2.put(alumno2, lista2);
        System.out.println(mapa2);

        List<Double> valoresAlumno2 = mapa2.get(alumno2);
        valoresAlumno2.add(4.2);
        System.out.println(mapa2);
    }
}
