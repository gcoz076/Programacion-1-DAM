package Orientacion_a_objetos.Herencias.VideojuegoRPG;

public class Arquero extends Personaje {

    public Arquero(String nombre, int nivel, int hp) {
        super(nombre, nivel, hp);
    }

    @Override
    public String getArma() {
        return "Flecha";
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        boolean atacado = false;

        if (atacante instanceof Mago) {
            atacado = true;
        }

        // Si caballero no indica distancia → NO puede atacarlo

        return atacado;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        boolean atacado = false;

        if (atacante instanceof Caballero && distancia < 50) {
            atacado = true;
        }

        if (atacante instanceof Mago) {
            atacado = true;
        }

        return atacado;
    }
}

