package Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.controller;

import Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.models.CuentaAhorro;
import Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.models.CuentaBancaria;
import Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.models.CuentaCorriente;

public class GestionaCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaCorriente("ES1234567891011", 5143.14, 0.5);
        CuentaBancaria cuenta2 = new CuentaAhorro("ES1110987654321", 13753.62, 0.44);

        cuenta1.ingresarDinero();
        System.out.println(cuenta1.getSaldo());

        cuenta2.retirarDinero();
        System.out.println(cuenta2.getSaldo());

        cuenta1.transferirDinero(cuenta2);
        System.out.println(cuenta2.getSaldo());

        cuenta2.calcularIntereses();
        System.out.println(cuenta2.getSaldo());

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
