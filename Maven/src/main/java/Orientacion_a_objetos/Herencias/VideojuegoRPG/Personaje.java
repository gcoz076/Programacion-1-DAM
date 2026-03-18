package Orientacion_a_objetos.Herencias.VideojuegoRPG;

public class Personaje {

    protected String nombre;
    protected int nivel;
    protected int hp;

    public Personaje(String nombre, int nivel, int hp) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
    }

    public String getArma() {

        return "";
    }

    public boolean esAtacado(Personaje atacante) {

        return false;
    }

    public boolean esAtacado(Personaje atacante, int distancia) {

        return false;
    }
}

