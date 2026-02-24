package Orientacion_a_objetos.Interfaz.Ejemplos;

public abstract class SerVivo {
    //Atributos
    private int edad;

    //Constructores
    public SerVivo(int edad) {
        this.edad = edad;
    }

     public abstract boolean estaVivo();
     public abstract boolean seDesplaza();
}
