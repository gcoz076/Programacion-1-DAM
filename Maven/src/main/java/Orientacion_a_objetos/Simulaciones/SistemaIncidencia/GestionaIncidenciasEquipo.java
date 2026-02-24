/*
package Orientacion_a_objetos.Simulaciones.SistemaIncidencia;

public class GestionaIncidenciasEquipo {

    //Atributos
    private Incidente[] incidencias;
    private int contador;

    // Contructor
    public GestionaIncidenciasEquipo() {
        incidencias = new Incidente[10];
        contador = 0;
    }

    //Metodos
    public void agregarIncidencia(Incidente incidente) {
        if (contador < incidencias.length) {
            incidencias[contador] = incidente;
            contador++;
        } else {
            System.out.println("No se pueden agregar más incidencias.");
        }
    }

    public void mostrarTodasIncidencias() {
        System.out.println("---- TODAS LAS INCIDENCIAS ----");
        for (int i = 0; i < contador; i++) {
            System.out.println(incidencias[i]);
        }
    }

    public void mostrarIncidenciasUrgentes() {
        System.out.println("---- INCIDENCIAS URGENTES ----");
        for (int i = 0; i < contador; i++) {
            if (incidencias[i].esUrgente()) {
                System.out.println(incidencias[i]);
            }
        }
    }

    public static void main(String[] args) {

        GestionaIncidenciasEquipo gestion = new GestionaIncidenciasEquipo();

        Usuario usuario1 = new Usuario("11111111A", "Carlos", "Informática");
        Usuario usuario2 = new Usuario("22222222B", "Ana", "Contabilidad");
        Usuario usuario3 = new Usuario("33333333C", "Luis", "Recursos Humanos");
        Usuario usuario4 = new Usuario("44444444D", "Marta", "Marketing");

        Equipo equipo1 = new Equipo("EquipoA", "AA:BB:CC:DD:01", "Windows", usuario1);
        Equipo equipo2 = new Equipo("EquipoB", "AA:BB:CC:DD:02", "Linux", usuario2);
        Equipo equipo3 = new Equipo("EquipoC", "AA:BB:CC:DD:03", "MacOS", usuario3);
        Equipo equipo4 = new Equipo("EquipoD", "AA:BB:CC:DD:04", "Windows", usuario4);

        Incidente inc1 = new Incidente(1, "Error red",
                "Sin conexión a internet",
                "01/02/2026", "02/02/2026",
                Criticidad.Media);

        Incidente inc2 = new Incidente(2, "Pantalla azul",
                "Fallo crítico sistema",
                "03/02/2026", "04/02/2026",
                Criticidad.Critica);

        Incidente inc3 = new Incidente(3, "Actualización",
                "Error actualizando software",
                "05/02/2026", "06/02/2026",
                Criticidad.Leve);

        Incidente inc4 = new Incidente(4, "Impresora",
                "No imprime",
                "07/02/2026", "08/02/2026",
                Criticidad.Critica);

        // Asignar equipos a incidencias
        inc1.setEquipo(equipo1);
        inc2.setEquipo(equipo1);
        inc3.setEquipo(equipo2);
        inc4.setEquipo(equipo3);

        // Agregar incidencias al sistema
        gestion.agregarIncidencia(inc1);
        gestion.agregarIncidencia(inc2);
        gestion.agregarIncidencia(inc3);
        gestion.agregarIncidencia(inc4);

        // Mostrar resultados
        gestion.mostrarTodasIncidencias();
        gestion.mostrarIncidenciasUrgentes();


        System.out.println("\n---- EQUIPOS DEL DEPARTAMENTO ----");
        System.out.println(equipo1);
        System.out.println(equipo2);
        System.out.println(equipo3);
        System.out.println(equipo4);
    }
}
*/