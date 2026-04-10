package Colecciones.Listas.Pruebas.Clonados.Models;

public class Direccion {
    private String calle;
    private int numCalle;
    private String puerta;
    private String ciudad;

    public Direccion(String calle, int numCalle, String puerta, String ciudad) {
        this.calle = calle;
        this.numCalle = numCalle;
        this.puerta = puerta;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
