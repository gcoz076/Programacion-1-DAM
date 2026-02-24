package Orientacion_a_objetos.Herencias.Anime;

public class Naruto extends PersonajeAnime {
    private Elemento elemento;
    private Aldea aldea;

    public Naruto(String nombre, Elemento elemento, Aldea aldea) {
        super(nombre);
        this.elemento = elemento;
        this.aldea = aldea;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Aldea getAldea() {
        return aldea;
    }

    public void setAldea(Aldea aldea) {
        this.aldea = aldea;
    }

    public void entrenar(){

    }

    public void Crearclon(){

    }
}
