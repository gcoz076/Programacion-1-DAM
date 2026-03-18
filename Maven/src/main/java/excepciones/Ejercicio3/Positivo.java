package excepciones.Ejercicio3;

public class Positivo {
    public int numPositivo(){
        int num = -5;
        if (num > 0) {
            throw new ArithmeticException("Esto es un fallo, es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }

        return num;
    }
}
