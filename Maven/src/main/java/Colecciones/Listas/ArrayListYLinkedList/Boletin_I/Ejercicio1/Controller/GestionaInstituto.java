package Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio1.Controller;

import java.util.Scanner;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio1.Models.*;
import Colecciones.Listas.ArrayListYLinkedList.Boletin_I.Ejercicio1.Exceptions.*;

public class GestionaInstituto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Instituto instituto = new Instituto();

        int opcion;

        do {

            System.out.println("1. Agregar grupo");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Mostrar estudiantes por grupo");
            System.out.println("4. Mostrar info grupo");
            System.out.println("5. Promedio estudiante");
            System.out.println("6. Promedio grupo");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            try {
                switch(opcion) {
                    case 1:
                        System.out.println("ID grupo:");
                        String id = sc.nextLine();

                        System.out.println("Descripcion:");
                        String desc = sc.nextLine();

                        System.out.println("Tutor:");
                        String tutor = sc.nextLine();

                        System.out.println("Aula:");
                        String aula = sc.nextLine();

                        instituto.agregarGrupo(new Grupo(id, desc, tutor, aula));
                        break;
                    case 2:

                        System.out.println("Descripcion grupo:");
                        String grupoDesc = sc.nextLine();

                        Grupo g = instituto.buscarGrupo(grupoDesc);

                        if(g == null)
                            throw new NoEncontradoException("Grupo no encontrado");

                        System.out.println("Nombre estudiante:");
                        String nombre = sc.nextLine();

                        System.out.println("ID estudiante:");
                        String idEst = sc.nextLine();

                        Estudiante e = new Estudiante(nombre, idEst);

                        g.agregarEstudiante(e);
                        break;
                    case 3:

                        System.out.println("Descripcion del grupo:");
                        String descGrupo = sc.nextLine();

                        Grupo g3 = instituto.buscarGrupo(descGrupo);

                        if(g3 == null) {
                            throw new NoEncontradoException("Grupo no encontrado");
                        }

                        g3.mostrarEstudiantes();

                        break;
                    case 4:

                        System.out.println("Descripcion del grupo:");
                        String descInfo = sc.nextLine();

                        Grupo g4 = instituto.buscarGrupo(descInfo);

                        if(g4 == null) {
                            throw new NoEncontradoException("Grupo no encontrado");
                        }

                        g4.infoBasica();

                        break;
                    case 5:

                        System.out.println("Descripcion del grupo:");
                        String desc5 = sc.nextLine();

                        Grupo g5 = instituto.buscarGrupo(desc5);

                        if(g5 == null) {
                            throw new NoEncontradoException("Grupo no encontrado");
                        }

                        System.out.println("ID del estudiante:");
                        String idEstu = sc.nextLine();

                        Estudiante est = g5.buscarEstudiante(idEstu);

                        if(est == null) {
                            throw new NoEncontradoException("Estudiante no encontrado");
                        }

                        System.out.println("Promedio: " + est.calcularPromedio());

                        break;
                    case 6:

                        System.out.println("Descripcion del grupo:");
                        String desc6 = sc.nextLine();

                        Grupo g6 = instituto.buscarGrupo(desc6);

                        if(g6 == null) {
                            throw new NoEncontradoException("Grupo no encontrado");
                        }

                        System.out.println("Promedio del grupo: " + g6.promedioGrupo());

                        break;
                    case 7:
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch(NoEncontradoException ex) {
                System.out.println(ex.getMessage());
            }
        } while(opcion != 7);
    }
}
