package Boletin_Matrices;

public class Ejercicio1 {

    public void deteccionAgotados(int[][] inventario){
        for (int i = 0; i < inventario.length; i++) {

            int[] fila = inventario[i];
            for (int j = 0; j < fila.length ; j++) {
                if (fila[j] == 0){
                    System.out.println("¡Alerta! Producto agotado en la Fila " + i + ", Columna " + j + ".");
                }
            }
        }
    }

    public int contabilizaAgotados(int[][] inventario){
        int contador = 0;
        for (int i = 0; i < inventario.length; i++) {

            int[] fila = inventario[i];
            for (int j = 0; j < fila.length ; j++) {
                if (fila[j] == 0){
                    contador = contador +1;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int [][] inventario = {
                {5, 0, 8},
                {2, 10, 0},
                {0, 4, 1}
        };

        Ejercicio1 ref = new Ejercicio1();
        ref.deteccionAgotados(inventario);

        int contador = 0;
        contador = ref.contabilizaAgotados(inventario);

        System.out.println("Hay "+ contador +" productos agotados.");
    }
}
