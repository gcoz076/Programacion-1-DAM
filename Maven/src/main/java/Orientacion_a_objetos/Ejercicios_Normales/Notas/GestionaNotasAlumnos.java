package Orientacion_a_objetos.Ejercicios_Normales.Notas;

public class GestionaNotasAlumnos {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Juan", "juan@email.com");
        NotaAsignatura programacion = new NotaAsignatura(alumno1, NombreAsignaturas.PROGRAMACION, 6, 7, 5);
        NotaAsignatura basesDatos = new NotaAsignatura(alumno1, NombreAsignaturas.BASEDEDATOS, 4, 5, 6);

        alumno1.notaProgramacion = programacion;
        alumno1.notaBasesDatos = basesDatos;

        alumno1.imprimeSiHaAprobado(NombreAsignaturas.PROGRAMACION);
        alumno1.imprimeSiHaAprobado(NombreAsignaturas.BASEDEDATOS);

        programacion.trimAprob();
        basesDatos.trimAprob();
    }
}
