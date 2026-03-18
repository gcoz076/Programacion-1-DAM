package excepciones.Ejercicio2;

public class parte1 {
    public static void main(String[] args) {
        try {
            parte2 p2 = new parte2();
            System.out.println("Estoy antes");
            p2.m1();
        } catch (ClassNotFoundException e){
            System.out.println("No funciona: " + e.getMessage()) ;
        } finally {
            System.out.println("Entro si o si");
        }
        System.out.println("Ahora sigo fuera del finally");
    }
}
