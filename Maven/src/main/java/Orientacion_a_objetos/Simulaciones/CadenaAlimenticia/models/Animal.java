package Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.models;

public abstract class Animal {
    //Atributo
    private String nombreEspecie;
    private String habitad;
    private Animal[] come;
    private Animal[] esComido;

    //Constructor
    public Animal(String nombreEspecie, String habitad) {
        this.nombreEspecie = nombreEspecie;
        this.habitad = habitad;
    }

    public Animal() {
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public Animal[] getCome() {
        return come;
    }

    public void setCome(Animal[] come) {
        this.come = come;
    }

    public Animal[] getEsComido() {
        return esComido;
    }

    public void setEsComido(Animal[] esComido) {
        this.esComido = esComido;
    }

    //Metodo
    public abstract boolean atacar(Animal a);

    public abstract boolean huir(Animal a);
}
