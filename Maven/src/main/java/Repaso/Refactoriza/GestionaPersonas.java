package Repaso.Refactoriza;

public class GestionaPersonas {
    public static void main(String[] args) {
        PersonaRefactoriza[] personas = new PersonaRefactoriza[10];
        PersonaRefactoriza p = new PersonaRefactoriza("Maria");
        Estudiante e = new Estudiante("Estudio");
        EstudianteEmpleado ee = new EstudianteEmpleado("EstudianteCurrante");
        Artista art = new Artista("Arte");
        Cliente cli = new Cliente("Cli");
        Empleado emp = new Empleado("Emple");

        personas[0] = p;
        personas[1] = e;
        personas[2] = ee;
        personas[3] = art;
        personas[4] = cli;
        personas[5] = emp;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null){
                personas[i].identificarse();
                if (personas[i] instanceof Artista) {
                    Artista artista = (Artista) personas[i];
                    artista.pintar();
                } else if (personas[i] instanceof Estudiante) {
                    Estudiante estudiante = (Estudiante) personas[i];
                }
            }
        }
    }

}
