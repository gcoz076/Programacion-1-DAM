package Boletin_Visibilidad.paquete2;

import Boletin_Visibilidad.paquete1.ClaseA;

public class GestionaClaseA {
    public static void main(String[] args) {
        ClaseA objeto = new ClaseA();
        System.out.println(objeto.atributoPrivado);
        System.out.println(objeto.suma(2, 3));
    }
}
