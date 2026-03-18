package Orientacion_a_objetos.Herencias.Planetas;

public class Satelite extends Astro {

    private String planetaAlQuePertenece;

    public Satelite(String nombre, double masa, double diametroMedio,
                    double periodoRotacion, double periodoTraslacion,
                    double distanciaMedia, String planetaAlQuePertenece) {

        super(nombre, masa, diametroMedio, periodoRotacion,
                periodoTraslacion, distanciaMedia);

        this.planetaAlQuePertenece = planetaAlQuePertenece;
    }

    public String getPlanetaAlQuePertenece() {
        return planetaAlQuePertenece;
    }

    public void setPlanetaAlQuePertenece(String planetaAlQuePertenece) {
        this.planetaAlQuePertenece = planetaAlQuePertenece;
    }

    @Override
    public String toString() {
        return "Satélite: " + nombre +
                " | Masa: " + masa +
                " | Diámetro: " + diametroMedio;
    }
}

