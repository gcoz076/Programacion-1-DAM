package Orientacion_a_objetos.Encapsulacion.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    //Atributos
    private double saldo;
    private String numCuenta;
    private Persona titular;
    private Persona autorizado;

    //Constructores, guetters y setters
    public CuentaBancaria(double saldo, String numCuenta, Persona titular) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.titular = titular;
    }




    //Metodos
    private boolean importeValido(int cantidad){
        boolean esCorrecto = false;
        if (cantidad > 0){
            esCorrecto = true;
        }
        else {
            System.out.println("Dinero incorrecto");
            esCorrecto = false;
        }
        return esCorrecto;
    }

    private boolean validarAutorizado(){
        boolean hayAutorizado = false;

        return hayAutorizado;
    }

    public double ingresarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Que cantidad quieres ingresar: ");
        int cantidad = sc.nextInt();
        if (importeValido(cantidad) == true){
            saldo += cantidad;
            System.out.println("Saldo restante: "+ saldo);
        }
        return saldo;
    }

    public double retirarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Que cantidad quieres retirar: ");
        int cantidad = sc.nextInt();
        if (importeValido(cantidad) == true){
            saldo-= cantidad;
            System.out.println("Saldo restante: "+ saldo);
        }
        return saldo;
    }

    public void eliminarAutorizado(){

    }
}
