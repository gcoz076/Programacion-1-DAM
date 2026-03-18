package Orientacion_a_objetos.Ejercicios_Normales.Notas;

public class Alumno {

    // Atributos
    String nombre;
    String apellidos;
    String email;
    NotaAsignatura notaProgramacion;
    NotaAsignatura notaBasesDatos;

    // Constructor
    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Métodos
    public void imprimeSiHaAprobado(NombreAsignaturas n ) {
        NotaAsignatura nota = null;
        if (this.notaProgramacion.nombreAsignatura.equals(n)){
            nota = this.notaProgramacion;
        }
        else{
            nota = this.notaBasesDatos;
        }

        if (nota.notaMedia() >= 5) {
            System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + nota.nombreAsignatura);
        }
        else {
            System.out.println("El alumno " + nombre + " NO ha aprobado la asignatura " + nota.nombreAsignatura);
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
