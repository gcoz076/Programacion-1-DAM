package Orientacion_a_objetos.Interfaz.Ejemplos;

import java.util.Scanner;

public class Perro extends Animal implements ICanino{
    //Constructor
    public Perro(int edad) {
        super(edad);
    }

    //Metodo

    @Override
    public boolean estaVivo() {
        return super.estaVivo();
    }

    @Override
    public boolean seDesplaza() {
        return super.seDesplaza();
    }

    @Override
    public void come() {
        super.come();
    }

    @Override
    public void respira() {
        super.respira();
    }

    @Override
    public void getRaza() {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.print("Dime la Raza de perro que eres, terhian de los cojones");
        String raza = sc.next().toLowerCase();
        contador++;

        if (raza.equals("golden")){
            System.out.println("Raza registrada");
        }
    }
}
