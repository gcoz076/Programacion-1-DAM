package Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.models;

public class Roedor extends Animal{

    public Roedor(String nombreEspecie, String habitad) {
        super(nombreEspecie, habitad);
        Animal le = new Leon();
        Animal ra = new Rapaz();
        Animal se = new Serpiente();
        this.getEsComido()[0] = le;
        this.getEsComido()[1] = ra;
        this.getEsComido()[2] = se;
    }

    public Roedor() {
    }

    @Override
    public boolean atacar(Animal a) {
        System.out.println("Los roedores comen plantas");
        return false;
    }

    @Override
    public boolean huir(Animal a) {
        if (a instanceof Leon || a instanceof Rapaz || a instanceof Serpiente){
            System.out.println("Los roedores huyen de esta Especie");
        }
        return false;
    }
}
