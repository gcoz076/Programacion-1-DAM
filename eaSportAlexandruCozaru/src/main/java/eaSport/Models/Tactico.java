package eaSport.Models;

public class Tactico extends Personajes{
    //Atributos
    private final int codigoOp;
    private static int contador;
    private Mapas[] mapas;

    //Constructor, getter y setter
    public Tactico(String alias, int nivelMaestria) {
        super(alias, nivelMaestria);
        contador++;
        this.codigoOp = contador;
        this.mapas = new Mapas[10];
    }

    public int getCodigoOp() {
        return codigoOp;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Tactico.contador = contador;
    }

    public Mapas[] getMapas() {
        return mapas;
    }

    public void setMapas(Mapas[] mapas) {
        this.mapas = mapas;
    }

    //Metodos
    public Mapas[] addMapaVentaja(Mapas m){
        int contador = 0;
        mapas[contador] = m;
        contador++;
        return mapas;
    }

    @Override
    public String generarMetrica() {
        String nombre = getAlias().toUpperCase();
        String cadena = nombre + "|" + getFechaDesbloqueo();
        return cadena;
    }

    @Override
    public Rangos getRangoCompetitivo() {
        Rangos rango = Rangos.Platino;
        if (getNivelMaestria() > 80){
            rango = Rangos.Radiante;
            System.out.println("Su rango es: " + Rangos.Radiante);
        }
        else {
            System.out.println("Su rango es: " + Rangos.Platino);
        }
        return rango;
    }

    public Mapas[] addMapaVentaja(String mapa){

        int contador = 1;

        this.mapas[contador] = Mapas.valueOf(mapa);
        contador++;

        return mapas;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " | Alias: " + getAlias() +
                " | nivelMaestria: " + getNivelMaestria() +
                " | fechaDesbloqueo: " + getFechaDesbloqueo() +
                " | Codigo Operador: " + getCodigoOp() +
                " | Mapas: " + mapas[0] + "|" + mapas[1] +
                " | ";
    }
}
