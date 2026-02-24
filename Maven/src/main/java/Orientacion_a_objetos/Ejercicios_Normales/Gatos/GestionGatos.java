package Orientacion_a_objetos.Ejercicios_Normales.Gatos;

public class GestionGatos {
    public static void main(String[] args) {
        Gato naranja = new Gato("naranja", "persia", "macho", 3, 5 );
        Gato negro = new Gato("negro", "común", "macho", 2, 4 );
        Gato blanco = new Gato("blanco", "siames", "hembra", 5, 6 );

        naranja.pelear(negro);
        blanco.ronronear();
        negro.maullar();
        naranja.comer();
    }
}
