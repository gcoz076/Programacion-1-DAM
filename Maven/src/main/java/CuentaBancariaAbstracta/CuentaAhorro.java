package CuentaBancariaAbstracta;

public class CuentaAhorro extends CuentaBancaria{
    //Atributos
    private double saldoMinimo;

    //Constructores
    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
        this.saldoMinimo = 15.000;
    }

    //Metodos
    public double calcularIntereses() {
        System.out.println("Calculando intereses");
        if (getSaldo() < saldoMinimo) {
            setInteresAnualBasico(1.14);
            double dinero = getSaldo() / getInteresAnualBasico();
            double saldo = getSaldo() + dinero;
            this.setSaldo(saldo);
        }
        else {
            setInteresAnualBasico(4.64);
            double dinero = getSaldo() / getInteresAnualBasico();
            double saldo = getSaldo() + dinero;
            this.setSaldo(saldo);
        }
        return getSaldo();
    }
}
