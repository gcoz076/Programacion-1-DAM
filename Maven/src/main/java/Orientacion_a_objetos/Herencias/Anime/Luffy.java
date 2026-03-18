package Orientacion_a_objetos.Herencias.Anime;

public class Luffy extends PersonajeAnime {

    private String fruta;
    private boolean estaEnAgua;

    public Luffy(String nombre) {
        super(nombre);
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public boolean isEstaEnAgua() {
        return estaEnAgua;
    }

    public void setEstaEnAgua(boolean estaEnAgua) {
        this.estaEnAgua = estaEnAgua;
    }

    public void reirse(){

    }

    @Override
    public String toString() {
        return "Luffy{" +
                "fruta='" + getFruta() + '\'' +
                ", estaEnAgua=" + isEstaEnAgua() +
                ", nombre='" + getNombre() + '\'' +
                ", serie=" + getSerie() +
                ", edad=" + getEdad() +
                ", transformacion=" + getTransformacion() +
                '}';
    }
}
