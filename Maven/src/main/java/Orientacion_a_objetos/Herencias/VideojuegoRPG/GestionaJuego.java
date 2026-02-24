package Orientacion_a_objetos.Herencias.VideojuegoRPG;

public class GestionaJuego {

    public static void main(String[] args) {

        Personaje caballero = new Caballero("Arthur", 10, 100);
        Personaje arquero = new Arquero("Legolas", 12, 80);
        Personaje mago = new Mago("Merlin", 15, 70);
        Personaje villano = new Villano("Sauron", 20, 200);

        System.out.println("Armas:");
        System.out.println("Caballero: " + caballero.getArma());
        System.out.println("Arquero: " + arquero.getArma());
        System.out.println("Mago: " + mago.getArma());
        System.out.println("Villano: " + villano.getArma());

        System.out.println("\nAtaques sin distancia:");
        System.out.println("¿Caballero ataca Arquero? " + arquero.esAtacado(caballero));
        System.out.println("¿Arquero ataca Caballero? " + caballero.esAtacado(arquero));
        System.out.println("¿Mago ataca Caballero? " + caballero.esAtacado(mago));
        System.out.println("¿Villano es atacado por cualquiera? " + villano.esAtacado(caballero));

        System.out.println("\nAtaques con distancia:");
        System.out.println("¿Caballero ataca Arquero a 30m? " + arquero.esAtacado(caballero, 30));
        System.out.println("¿Arquero ataca Caballero a 150m? " + caballero.esAtacado(arquero, 150));
        System.out.println("¿Arquero ataca Caballero a 50m? " + caballero.esAtacado(arquero, 50));
    }
}
