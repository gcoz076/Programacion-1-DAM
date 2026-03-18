package Orientacion_a_objetos.Ejercicios_Normales.Cubo;

public class GestionaLitros {
    public static void main(String[] args) {


        Cubo cubo = new Cubo(4);

        System.out.println("Área total del cubo: " + cubo.areaTotal());
        System.out.println("Volumen del cubo (litros): " + cubo.volumen());

        System.out.println("Rellenar 6 litros: " + cubo.rellenar(6));

        System.out.println("Vaciar 4 litros: " + cubo.vaciar(4));

        System.out.println("Vaciar 3 litros: " + cubo.vaciar(3));

        System.out.println("Rellenar 16 litros: " + cubo.rellenar(16));
    }
}
