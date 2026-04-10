package Colecciones.Listas.Clonaciones.Ejercicio1.Controller;

import Colecciones.Listas.Clonaciones.Ejercicio1.Models.Coche;
import Colecciones.Listas.Clonaciones.Ejercicio1.Models.Combustible;
import Colecciones.Listas.Clonaciones.Ejercicio1.Models.Motor;

public class GestionaCoches {
    public static void main(String[] args) throws CloneNotSupportedException {
        Motor motor1 = new Motor(Combustible.GASOLINA, 100);
        Motor motor2 = null;
        try {
            motor2 = (Motor) motor1.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar");
        }
        Motor motor3 = (Motor) motor2;
        motor2.setTipo(Combustible.DIESEL);


        System.out.println("Motor1: " + motor1);
        System.out.println("Motor2: " + motor2);

        Coche coche1 = new Coche("3124KDR", "Range Rover", 20000, motor1);
        Coche coche2 = null;
        try {
            coche2 = (Coche) coche1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se pudo clonar");
        }
        coche2.getMotor().setCv(300);

        System.out.println("Coche1: " + coche1);
        System.out.println("Coche2: " + coche2);
    }
}
