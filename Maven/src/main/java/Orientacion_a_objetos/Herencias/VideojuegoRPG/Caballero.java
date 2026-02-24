package Orientacion_a_objetos.Herencias.VideojuegoRPG;

public class Caballero extends Personaje {

    public Caballero(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Espada";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        boolean atacado = false;

        if (atacante instanceof Arquero) {
            atacado = true;  // si no indica distancia, sí puede atacarlo
        }

        if (atacante instanceof Mago) {
            atacado = true;
        }

        return atacado;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        boolean atacado = false;

        if (atacante instanceof Arquero && distancia > 100) {
            atacado = true;
        }

        if (atacante instanceof Mago) {
            atacado = true;
        }

        return atacado;
    }
}

