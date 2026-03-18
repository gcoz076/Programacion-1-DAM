package Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.models;

public class Leon extends Animal{
    public Leon(String nombreEspecie, String habitad) {
        super(nombreEspecie, habitad);
        Animal rap = new Rapaz();
        Animal ser = new Serpiente();
        Animal roe = new Roedor();
        this.getCome()[0] = rap;
        this.getCome()[1] = ser;
        this.getCome()[2] = roe;
    }

    public Leon() {
    }

    @Override
    public boolean atacar(Animal a) {
        if (a instanceof Roedor || a instanceof Rapaz || a instanceof Serpiente){
            System.out.println("Los leones son los reyes de la cadena alimenticia");
        }
        return true;
    }

    @Override
    public boolean huir(Animal a) {
        System.out.println("Los leones no huyen nunca");
        return false;
    }
}
