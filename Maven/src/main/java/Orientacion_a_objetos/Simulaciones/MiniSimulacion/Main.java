package Orientacion_a_objetos.Simulaciones.MiniSimulacion;

public class Main {

    public static void main(String[] args) {

        // Conductores
        Conductor conductor1 = new Conductor("Carlos", 10);
        Conductor conductor2 = new Conductor("Ana", 3);

        // Sensores
        Sensor sensorSeguro = new Sensor(100, 90);   // sin peligro
        Sensor sensorPeligro = new Sensor(30, 130);  // obstáculo cercano y exceso de velocidad

        // Coche
        Coche coche = new Coche(
                "Tesla",
                "Model S",
                "1234ABC",
                conductor1,
                sensorPeligro
        );


        coche.arrancar(conductor2);

        // Arranque correcto
        coche.arrancar(conductor1);

        // El conductor conduce
        conductor1.conducir();

        // El coche verifica si debe parar por sensores
        coche.debeParar();
    }
}

