package eaSport.Controller;

import eaSport.Models.Mapas;
import eaSport.Models.Personajes;
import eaSport.Models.Tactico;
import eaSport.Models.Tanque;

public class GestionaVideojuego {
    static void main(String[] args) {
        //Instancia y Validacion
        Personajes[] personajes = new Personajes[6];

        Tanque tanque1 = new Tanque("tan-01", 50, 87);
        Tactico tactico1 = new Tactico("tac-01", 85);
        Tactico tactico2 = new Tactico("tac-02", 150);

        personajes[0] = tanque1;
        personajes[1] = tactico1;
        personajes[2] = tactico2;

        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null){
                System.out.println(personajes[i].toString());
            }

        }

        //Implementa y prueba el método addMapaVentaja
        tactico1.addMapaVentaja(Mapas.Bind);
        tactico1.addMapaVentaja("Split");
        System.out.println(tactico1.toString());

        //Implementa y prueba los metodos generarFirma y getNivelAlerta
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null){
                System.out.println(personajes[i].generarMetrica() + "|" + personajes[i].getRangoCompetitivo());
            }
        }
    }
}
