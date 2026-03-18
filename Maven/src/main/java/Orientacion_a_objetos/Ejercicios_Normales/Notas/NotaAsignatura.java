package Orientacion_a_objetos.Ejercicios_Normales.Notas;

public class NotaAsignatura {
    // Atributos
    Alumno alumno;
    NombreAsignaturas nombreAsignatura;
    int notaPT;
    int notaST;
    int notaTT;

    // Constructor
    public NotaAsignatura(Alumno alumno, NombreAsignaturas nombreAsignatura, int notaPT, int notaST, int notaTT) {
        this.alumno = alumno;
        this.nombreAsignatura = nombreAsignatura;
        this.notaPT = notaPT;
        this.notaST = notaST;
        this.notaTT = notaTT;
    }

    // Metodos
    public int notaMedia() {
        int notaMedia = (notaPT + notaST + notaTT) / 3;
        return notaMedia;
    }

    int trimAprob(){
        int contador = 0;

        if (this.notaPT >= 5){
            contador++;
        }
        if (this.notaST >= 5) {
            contador++;
        }
        if (this.notaTT >= 5) {
            contador++;
        }
        System.out.println("Trimestres aprobados: "+ contador + ".");
        return contador;
    }

    @Override
    public String toString() {
        return "NotaAsignatura{" +
                "nombreAsignatura='" + nombreAsignatura + '\'' +
                ", notaPT=" + notaPT +
                ", notaST=" + notaST +
                ", notaTT=" + notaTT +
                '}';
    }
}
