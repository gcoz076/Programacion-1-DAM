package excepciones.Ejercicio4;

import java.util.Random;

public class Divisiones {
    public double[] division() {
        double[] resultados = new double[20];
        try {
            for (int i = 0; i < resultados.length; i++) {
                Random r = new Random();
                Random ran = new Random();
                int num1 = r.nextInt(11);
                int num2 = ran.nextInt(11);
                double resultado = num1 / num2;
                if (i == 10) {
                    throw new ArrayIndexOutOfBoundsException("Estas intentando guardar en la posicion 10");
                } else {
                    resultados[i] = resultado;
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println(i.getMessage());
        } finally {
            System.out.println("Llego si o si");
        }
        System.out.println("Hola, sigo");

        return resultados;
    }
}
