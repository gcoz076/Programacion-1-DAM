package CuentaBancariaAbstracta;

public class GestionaCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaCorriente("ES1234567891011", 5143.14);
        CuentaBancaria cuenta2 = new CuentaCorriente("ES1110987654321", 13753.62);

        cuenta1.ingresarDinero();
        System.out.println(cuenta1.getSaldo());

        cuenta2.retirarDinero();
        System.out.println(cuenta2.getSaldo());

        cuenta1.transferirDinero(cuenta2);
        System.out.println(cuenta2.getSaldo());

        cuenta2.calcularIntereses();
        System.out.println(cuenta2.getSaldo());


    }
}
