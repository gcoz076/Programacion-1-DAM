package Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.controller;

import Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.models.*;

public class Gestiona {

    public static void main(String[] args) {

        // Creamos animales
        Animal leon = new Leon("Leon Africano", "Sabana");
        Animal rapaz = new Rapaz("Aguila Real", "Montaña");
        Animal roedor = new Roedor("Raton de Campo", "Bosque");
        Animal serpiente = new Serpiente("Cobra", "Selva");

        System.out.println("----- PRUEBAS DE ATAQUE -----");

        leon.atacar(roedor);
        leon.atacar(rapaz);

        rapaz.atacar(roedor);
        rapaz.atacar(serpiente);

        serpiente.atacar(roedor);

        roedor.atacar(leon);

        System.out.println("\n----- PRUEBAS DE HUIDA -----");

        roedor.huir(leon);
        roedor.huir(rapaz);

        rapaz.huir(leon);

        serpiente.huir(leon);

        leon.huir(roedor);
    }
}
