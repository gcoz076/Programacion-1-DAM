package Orientacion_a_objetos.Simulaciones.CuentaBancariaAbstracta.models;

public class CuentaAhorro extends CuentaBancaria {
    //Atributos
    private  static final double saldoMinimo = 15.000;

    //Constructores
    public CuentaAhorro(String iban, double saldo, double interes) {
        super(iban, saldo, interes);
    }

    //Metodos
    public double calcularIntereses() {
        System.out.println("Calculando intereses");
        double interesAplicar = getInteresAnualBasico();
        if (getSaldo() < saldoMinimo) {
            interesAplicar = getInteresAnualBasico() / 2;
        }

        double dineroIntereses = getSaldo() * interesAplicar;
        double saldo = getSaldo() + dineroIntereses;
        this.setSaldo(saldo);
        return getSaldo();
    }
}
