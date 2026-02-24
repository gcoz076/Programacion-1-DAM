package Orientacion_a_objetos.Herencias.Planetas;

public class GestionaPlanetas {

    public static void main(String[] args) {

        // Crear planetas
        Planeta tierra = new Planeta("Tierra", 5.97e24, 12742,
                24, 365.25 * 24, 149600000);

        Planeta marte = new Planeta("Marte", 6.39e23, 6779,
                24.6, 687 * 24, 227900000);

        // Crear satélites
        Satelite luna = new Satelite("Luna", 7.35e22, 3474,
                655.7, 27.3 * 24, 384400, "Tierra");

        Satelite fobos = new Satelite("Fobos", 1.06e16, 22.4,
                7.65, 0.3 * 24, 9376, "Marte");

        Satelite deimos = new Satelite("Deimos", 1.8e15, 12.4,
                30.3, 1.3 * 24, 23463, "Marte");

        // Asociar satélites a planetas
        tierra.agregarSatelite(luna);

        marte.agregarSatelite(fobos);
        marte.agregarSatelite(deimos);

        // Mostrar información
        System.out.println("===== INFORMACIÓN DE PLANETAS =====");
        System.out.println();

        tierra.muestraInformacion();
        System.out.println();

        marte.muestraInformacion();
        System.out.println();

        // Comparar planetas
        if (tierra.equals(marte)) {
            System.out.println("Tierra y Marte son iguales.");
        } else {
            System.out.println("Tierra y Marte son diferentes.");
        }
    }
}

