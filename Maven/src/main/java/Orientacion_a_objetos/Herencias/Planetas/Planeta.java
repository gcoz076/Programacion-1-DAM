package Orientacion_a_objetos.Herencias.Planetas;

public class Planeta extends Astro {

    private Satelite[] satelites;
    private int cantidadSatelites;

    public Planeta(String nombre, double masa, double diametroMedio,
                   double periodoRotacion, double periodoTraslacion,
                   double distanciaMedia) {

        super(nombre, masa, diametroMedio, periodoRotacion,
                periodoTraslacion, distanciaMedia);

        this.satelites = new Satelite[10]; // capacidad fija inicial
        this.cantidadSatelites = 0;
    }

    public void agregarSatelite(Satelite s) {
        if (cantidadSatelites < satelites.length) {
            satelites[cantidadSatelites] = s;
            cantidadSatelites++;
        } else {
            System.out.println("No se pueden agregar más satélites.");
        }
    }

    public Satelite[] getSatelites() {
        return satelites;
    }

    @Override
    public String toString() {
        return "Planeta: " + nombre +
                " | Masa: " + masa +
                " | Diámetro: " + diametroMedio;
    }

    @Override
    public void muestraInformacion() {
        super.muestraInformacion();
        System.out.println("Satélites:");

        if (cantidadSatelites == 0) {
            System.out.println("  No tiene satélites.");
        } else {
            for (int i = 0; i < cantidadSatelites; i++) {
                System.out.println("  - " + satelites[i].getNombre());
            }
        }
    }
}
