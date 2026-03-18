package Orientacion_a_objetos.Interfaz.Domotica;

public class GestionaCentralita {
    public static void main(String[] args) {
        CentralitaDomotica centralita = new CentralitaDomotica();

        LavadoraInteligente lavadora = new LavadoraInteligente("LAV001", "LG", 1200);
        CafeteraInteligente cafetera = new CafeteraInteligente("CAF001", "Philips", 800, 50);
        BombillaRegulable bombilla = new BombillaRegulable("BOM001", 70, "#FFFFFF");
        AlarmaVisual foco = new AlarmaVisual("ALM001");

        centralita.aniadirDispositivos(lavadora);
        centralita.aniadirDispositivos(cafetera);
        centralita.aniadirDispositivos(bombilla);
        centralita.aniadirDispositivos(foco);

        centralita.buscarDispositivo("LAV001");
        centralita.buscarDispositivo("NO_EXISTE");

        centralita.ejecutarRutinaDiaria();

        lavadora.conectar();
        lavadora.iniciarCicloLavado();

        cafetera.conectar();
        cafetera.prepararCafe();

        bombilla.cambiarAmbiente("#00FF00");
        foco.activarModoPanico();
    }
}
