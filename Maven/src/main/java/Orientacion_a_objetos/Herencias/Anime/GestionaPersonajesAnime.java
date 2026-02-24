package Orientacion_a_objetos.Herencias.Anime;

public class GestionaPersonajesAnime {
    public static void main(String[] args) {
        Serie onePiece = new Serie("One Piece", "Eichiro Oda");

        Luffy luffy = new Luffy("Luffy");
        // Tiempo de compilación Luffy y en Tiempo ejecución es tipo Luffy
        //Todo lo que se ve del PersonajeAnime y todo lo de Luffy

        PersonajeAnime luffy1 = new Luffy("luffy2");
        // Tiempo de Compilacion PersonajeAnime y Tiempo de ejecución Luffy
        // Tiene solo lo de personaje

        // Luffy luffyTemp2 = new PersonajeAnime("luffy2")
        // No complia. Tiempo Compilación tipo Luffy, pero en tiempo de ejecución PersonajeAnime
        // Pasar a Luffy supone perder información --> Falla

        Luffy luffyTemp2 = (Luffy) new PersonajeAnime("luffy2");
        //Casting explicito desde Personaje anime a Luffy

        Goku goku = new Goku("Goku");
        PersonajeAnime anime = goku;
        // Luffy animeLufy = (Luffy) goku; Falla

        PersonajeAnime goku2 = new Goku("Goku2");
        Luffy animeLuffy = (Luffy) goku2;
        //En tiempo de Ejecución esto da ClassCastException


        luffy.setSerie(onePiece);
        System.out.println(luffy);
    }



}
