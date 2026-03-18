package excepciones.Ejercicio4;

import java.util.Arrays;

public class GestionaEjer4 {
    public static void main(String[] args) {

        Divisiones d = new Divisiones();
        double[] resultados = d.division();
        System.out.println(Arrays.toString(resultados));
    }
}
