package Boletin_Tablas;

public class Ejercicio2 {
    public static void main(String[] args) {
        String [] DiasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for (int i = 0; i < DiasDeLaSemana.length; i++){
            if (i <= 4){
                System.out.println(DiasDeLaSemana[i]+ " | Es Laborable");
            }
            else{
                System.out.println(DiasDeLaSemana[i]+ " | Es Festivo");
            }

        }

    }
}
