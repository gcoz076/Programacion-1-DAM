package Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.models;

import java.util.Objects;
import java.util.Scanner;

public abstract class CuentaBancaria {
    //Atributos
    private String iban;
    private double saldo;
    private final double interesAnualBasico;

    //Contructores, getters y setters
    public CuentaBancaria(String iban, double saldo, double interes) {
        this.iban = iban;
        this.saldo = saldo;
        this.interesAnualBasico = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnualBasico() {
        return interesAnualBasico;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(iban, that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(iban);
    }

    //Metodos
    public double ingresarDinero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su dinero");
        double dinero = sc.nextDouble();
        this.saldo += dinero;
        return saldo;
    }

    public double retirarDinero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Retire su dinero");
        double dinero = sc.nextDouble();
        this.saldo -= dinero;
        return saldo;
    }

    public double transferirDinero(CuentaBancaria cuentaDestino) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuánto dinero quieres transferir:");
        double dinero = sc.nextDouble();

        if (dinero > this.saldo) {
            System.out.println("No tienes saldo suficiente");
            return this.saldo;
        }

        saldo -= dinero;
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + dinero);

        System.out.println("Transferencia realizada correctamente");

        return saldo;
    }

    public abstract double calcularIntereses();

   @Override
    public String toString() {
        return
                this.getClass().getSimpleName() +
                " Su IBAN es :" + iban +
                " y su saldo es: " + this.saldo;
    }
}
