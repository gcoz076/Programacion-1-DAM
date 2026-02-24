package Orientacion_a_objetos.Estaticos.Ejercicio1.controller;

import Orientacion_a_objetos.Estaticos.Ejercicio1.models.Cliente;
import Orientacion_a_objetos.Estaticos.Ejercicio1.models.CuentaBancaria;

public class GestionaCuentas {
    public static void main(String[] args) {

        Cliente jose = new Cliente("Jose", "Diaz", "12345678J");
        Cliente pepe = new Cliente("Pepe", "Rose", "12345679L");

        CuentaBancaria cuentaJose = new CuentaBancaria(2039.72, "ES12345678910213756193", jose, pepe);
        CuentaBancaria cuentaPepe = new CuentaBancaria(1499.12, "ES12345678450213756193", pepe, jose);


        int numCuentas = CuentaBancaria.getContador();
        System.out.println(numCuentas);
    }
}
