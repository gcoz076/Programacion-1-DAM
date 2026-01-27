public class Dia6 {
    public static void main(String[] args) {
        int [] tabla = new int[10];
        System.out.println(tabla.length); //Esto es para que me diga la longitud de la tabla
        System.out.println(tabla[0]); //Esto es para imprimir por pantalla una posición

        boolean [] tablaBooleanos = new boolean[5]; //Con booleanos
        System.out.println(tablaBooleanos.length);
        System.out.println(tablaBooleanos[3]);

        String [] tablaString = new String[7]; //Con Strings
        System.out.println(tablaString[3]);

        int [] tablaCompletaNum = {1, 2, 3, 4, 5}; //Inicializar tabla
        System.out.println(tablaCompletaNum[3]);

        int [] tablaCompletaNum2 = new int[2]; //Creamos tabla y luego completas el contenido
        tablaCompletaNum2[0] = 10;
        tablaCompletaNum2[1] = 8;
        System.out.println(tablaCompletaNum2[1]);

        int [] tabla1;
        int [] tabla2 = {1, 2, 3, 4};
        tabla1 = tabla2; //Asignaciones
        tabla2[3] = 8;
        tabla = new int[50];
        tabla[0] = 10;
        tabla[1] = 100;
        tabla[2] = 1000;
        tabla[3] = 10000;
        System.out.println(tabla[3]);
        System.out.println(tabla2[3]);

        int [] tabla3 = new int[50]; //Rellenar Lista con for
        for (int i = 0; i < tabla3.length; i++){
            tabla3[i] = i+1;
            System.out.println(tabla3[i]);
        }


    }
}
