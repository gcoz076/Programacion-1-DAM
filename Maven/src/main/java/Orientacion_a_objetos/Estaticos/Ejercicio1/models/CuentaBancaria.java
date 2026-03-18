package Orientacion_a_objetos.Estaticos.Ejercicio1.models;

import java.time.LocalDate;

public class CuentaBancaria {
    //Atributos
    private double saldo;
    private LocalDate fechaApertura;
    private int id;
    private String iban;
    private Cliente titular;
    private Cliente autorizado;
    private static int contador;

    //Constructor

    public CuentaBancaria(double saldo, String iban, Cliente titular, Cliente autorizado) {
        this.saldo = saldo;
        this.iban = iban;
        this.titular = titular;
        this.autorizado = autorizado;
        this.fechaApertura = LocalDate.now() ;
        contador ++;
        this.id = contador;
    }

    public static int getContador() {
        return contador;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Cliente autorizado) {
        this.autorizado = autorizado;
    }
}
