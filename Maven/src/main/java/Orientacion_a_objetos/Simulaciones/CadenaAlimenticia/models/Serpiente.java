package Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.models;

public class Serpiente extends Animal{
    public Serpiente(String nombreEspecie, String habitad) {
        super(nombreEspecie, habitad);
        Animal roed = new Roedor();
        this.getCome()[0] = roed;

        Animal leo = new Leon();
        Animal rapa = new Rapaz();
        this.getEsComido()[0] = leo;
        this.getEsComido()[1] = rapa;
    }

    public Serpiente() {
    }

    @Override
    public boolean atacar(Animal a) {
        boolean ataca = false;
        if (a instanceof Roedor){
            ataca = true;
            System.out.println("Un Rapaz si ataca a esta especie");
        }
        else {
            System.out.println("No ataca a la especie");
        }
        return ataca;
    }

    @Override
    public boolean huir(Animal a) {
        System.out.println("Las serpientes no pueden huir de ninguna especie");
        return false;
    }
}
