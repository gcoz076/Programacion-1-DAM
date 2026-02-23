package CuentaBancariaAbstracta;

public class CuentaCorriente extends CuentaBancaria {
    //Constructor

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    //Metodos

    @Override
    public double calcularIntereses() {
        System.out.println("Calculando intereses");
        setInteresAnualBasico(2.27);
        double dinero = getSaldo() / getInteresAnualBasico();
        double saldo = getSaldo() + dinero;
        this.setSaldo(saldo);
        return getSaldo();
    }
}
