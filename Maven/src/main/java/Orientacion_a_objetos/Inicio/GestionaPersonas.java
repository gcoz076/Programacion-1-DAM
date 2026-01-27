package Orientacion_a_objetos.Inicio;

public class GestionaPersonas {
    public static void main(String[] args) {

        //Paula
        Persona paula = new Persona(21, "Paula", "cuenca", "avatar", "Gimnasia ritmica");
        System.out.println(paula.toString());
        paula.hablar();


        //Antonio
        Persona antonio = new Persona();
        antonio.nombre = "Antonio";
        antonio.edad = 34;
        antonio.lugarNacimiento = "Cordoba";
        antonio.peliFav = "Avatar";
        antonio.deporteFav = "Futbol";
        System.out.println(antonio.toString());
        antonio.comer();
    }
}
