import java.util.Scanner;

public class Dia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un Dia: ");
        String Dia = sc.next();
        switch (Dia) {
            case "LUNES":
                System.out.println("==========================");
                System.out.println("--------->LUNES<---------");
                System.out.println("==========================");
                System.out.println("(8:00 - 9:00) -> ENT");
                System.out.println("(9:00 - 10:00) -> BD");
                System.out.println("(10:00 - 11:00) -> BD");
                System.out.println("--------->RECREO<---------");
                System.out.println(" (11:30 - 12:30) -> IPE I");
                System.out.println(" (12:30 - 13:30) -> SOST");
                System.out.println(" (13:30 - 14:30) -> DIGIT");
                System.out.println("==========================");
                break;
            case "MARTES":
                System.out.println("==========================");
                System.out.println("--------->MARTES<---------");
                System.out.println("==========================");
                System.out.println("   (8:00 - 9:00) -> PROG");
                System.out.println("  (9:00 - 10:00) -> PROG");
                System.out.println(" (10:00 - 11:00) -> LMSGI");
                System.out.println("--------->RECREO<---------");
                System.out.println(" (11:30 - 12:30) -> LMSGI");
                System.out.println(" (12:30 - 13:30) -> LMSGI");
                System.out.println(" (13:30 - 14:30) -> IPE I");
                System.out.println("==========================");
                break;
            case "Sabado":
                System.out.println("Día de estudio y reflexión");
                break;
            default:
                System.out.println("El valor es incorrecto");
        }
    }
}
