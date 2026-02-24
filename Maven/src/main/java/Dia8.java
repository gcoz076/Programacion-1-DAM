public class Dia8 {
    public static void estatico(){
        System.out.println("Estático");
    }
    public void noEstatico(){
        System.out.println("no es estatico");
    }
    public static void main(String[] args) {
        Dia8.estatico();
        Dia8 c = new Dia8();
        c.noEstatico();
    }
}
