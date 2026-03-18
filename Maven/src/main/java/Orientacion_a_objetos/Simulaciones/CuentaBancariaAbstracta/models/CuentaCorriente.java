package Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.models;

public class CuentaCorriente extends CuentaBancaria {
    //Constructor
    public CuentaCorriente(String iban, double saldo, double interes) {
        super(iban, saldo, interes);
    }

    //Metodos

    @Override
    public double calcularIntereses() {
        System.out.println("Calculando intereses");
        double dinero = getSaldo() / getInteresAnualBasico();
        double saldo = getSaldo() + dinero;
        this.setSaldo(saldo);
        return getSaldo();
    }
}
