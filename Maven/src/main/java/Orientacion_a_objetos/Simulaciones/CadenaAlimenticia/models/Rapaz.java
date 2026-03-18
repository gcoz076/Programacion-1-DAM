package Orientacion_a_objetos.Simulaciones.CadenaAlimenticia.models;

public class Rapaz extends Animal{
    //Constructor
    public Rapaz(String nombreEspecie, String habitad) {
        super(nombreEspecie, habitad);
        Animal r = new Roedor();
        Animal s = new Serpiente();
        this.getCome()[0] = r;
        this.getCome()[1] = s;

        Animal l = new Leon();
        this.getEsComido()[0] = l;
    }

    public Rapaz() {
    }

    //Metodos
    @Override
    public boolean atacar(Animal a) {
        boolean ataca = false;
        if (a instanceof Roedor || a instanceof Serpiente){
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
        boolean huye = false;
        if (a instanceof Leon){
            huye = true;
            System.out.println("Un Rapaz huye de los leones");
        }
        else {
            System.out.println("No le hace falta huir");
        }
        return huye;
    }
}
