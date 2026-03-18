package Examen_29_01_2026;

import java.util.Scanner;

public class PlataformaDigital {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PlataformaDigital pd = new PlataformaDigital();

        String cadena = "alex@netflix23@;bea@hbo_pass@;carlos@prime99@;dani@disneyPlus1@;elena@movistar22@;fran@sky_77@;laura@atresPlayer@;pablo@filmin88@;sofia@stream2024@;admin@root@;";

        String[] usuarios = new String[10];
        String[] claves = new String[10];

        pd.extraerUsuariosYClaves(cadena, usuarios, claves);

        int opcion;

        do {
            System.out.println("1. Buscar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Mostrar usuarios");
            System.out.println("0. Salir");

            opcion = scan.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Introduce el nombre de usuario:");
                    String nombre = scan.next();
                    int pos = pd.buscarUsuario(usuarios, nombre);

                    if (pos == -1) {
                        System.out.println("Usuario no encontrado.");
                    } else {
                        System.out.println("Usuario encontrado en la posición: " + pos);
                    }
                    break;

                case 2:
                    pd.iniciarSesion(usuarios, claves, scan);
                    break;

                case 3:
                    pd.mostrarUsuarios(usuarios);
                    break;
            }

        } while (opcion != 0);

    }

    void extraerUsuariosYClaves(String cadena, String[] usuarios, String[] claves) {

        String[] bloques = cadena.split(";");

        for (int i = 0; i < bloques.length; i++) {

            if (!bloques[i].isEmpty()) {

                String[] partes = bloques[i].split("@");

                usuarios[i] = partes[0];
                claves[i] = partes[1];
            }
        }
    }

    int buscarUsuario(String[] usuarios, String nombre) {

        for (int i = 0; i < usuarios.length; i++) {

            if (usuarios[i] != null && usuarios[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }

        return -1;
    }

    void iniciarSesion(String[] usuarios, String[] claves, Scanner scan) {

        System.out.println("Usuario:");
        String nombre = scan.next();

        int pos = buscarUsuario(usuarios, nombre);

        if (pos == -1) {
            System.out.println("El usuario no existe.");
        } else {

            System.out.println("Contraseña:");
            String pass = scan.next();

            if (claves[pos].equals(pass)) {
                System.out.println("Inicio de sesión correcto.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }
    }

    void mostrarUsuarios(String[] usuarios) {

        System.out.println("=== Usuarios registrados ===");

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null) {
                System.out.println(usuarios[i]);
            }
        }
    }
}