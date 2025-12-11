import java.util.Scanner;

public class Dia2 {
    public static void main(String[] args) {
        int entero;

        float z= 4.0F;
        float y= 3.0F;
        double num3 = 3.0;
        float resultado = y/z-y*z;
        System.out.println(resultado);
        int numero = 4;
        short numero1 = 8;
        System.out.println(numero*numero - numero1/numero);
        int num4 = (int)2.7;
        System.out.println(num4);

        float num5 = 3.122987231F;
        double DecimalGrande = num5; // Casting implicito porque NO pierdo información
        System.out.println(DecimalGrande);
        num5 = (float) DecimalGrande; // CASTING EXPLICITO PORQUE PERDO INFORMACIÓN
        entero = (int)numero1;
        System.out.print(num5);
        System.out.print(entero);

        Scanner escaner = new Scanner(System.in);
        String cadena = escaner.next(); // Me lee hasta espacio en blanco y guarda en variable llamada cadena
        String linea = escaner.nextLine(); // Lee la frase entera con espacios
        int numerEntero = escaner.nextInt(); // Lee la frase entera con espacios
        System.out.println(cadena);
        System.out.println(linea);

        if (numero < numero1)
        {
            System.out.println("Este valor es menor");
        }
        else
        {
            System.out.println("Este valor es mayor");
        }

    }
}
