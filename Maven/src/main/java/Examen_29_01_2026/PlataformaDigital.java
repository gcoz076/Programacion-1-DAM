package Examen_29_01_2026;

import java.util.Scanner;

public class PlataformaDigital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PlataformaDigital pd = new PlataformaDigital();

        String cadena = "alex@netflix23@;bea@hbo_pass@;carlos@prime99@;dani@disneyPlus1@;elena@movistar22@;fran@sky_77@;laura@atresPlayer@;pablo@filmin88@;sofia@stream2024@;admin@root@;";
        String[] parejas = new String[10];
        String[] usuarios = new String[10];
        String[] claves = new String[10];

        pd.extraerParejas(cadena, parejas);
        pd.devuelvePos(parejas, usuarios, scan);
    }

    void menu(){

    }
    void extraerParejas(String cadena, String[] parejas){
            int i = 0;

            for (String pareja : cadena.split(";")){
                parejas[i] = pareja;
                i++;
            }
        System.out.println("=== Las parejas son las siguientes: ===");
            for (String palabra : parejas){
                System.out.println(palabra);
            }
    }

    void devuelvePos(String[] parejas, String[] usuarios, Scanner scan){

        System.out.println("Dime el nombre de usuario");
        String user = scan.next();

        for (int i = 0; i < parejas.length; i++) {
            usuarios[i] = parejas[i];
            if (user.equals(usuarios[i])){
                System.out.println("La posición del usuario "+ user +" es: "+ i +".");
            }
        }

    }
}
