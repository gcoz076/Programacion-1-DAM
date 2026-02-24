package Orientacion_a_objetos.Interfaz.Ejemplos;

public class Animal extends SerVivo {

    //Constructor
    public Animal(int edad) {
        super(edad);
    }

    //Metodos
    public void come(){
        System.out.println("come");
    }

    public void respira(){
        System.out.println("Respira");
    }

    @Override
    public boolean estaVivo() {
        return true;
    }

    @Override
    public boolean seDesplaza() {
        return true;
    }
}
