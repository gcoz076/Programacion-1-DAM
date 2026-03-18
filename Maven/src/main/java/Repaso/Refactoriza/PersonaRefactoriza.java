package Repaso.Refactoriza;

public class PersonaRefactoriza {
    String nombre;

    public PersonaRefactoriza(String nombre) {
        this.nombre = nombre;
    }

    public void identificarse() {
        System.out.println("Soy una persona y me llamo " + nombre);
    }
}

class Empleado extends PersonaRefactoriza {
    public Empleado(String nombre) {
        super(nombre);
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}

class Cliente extends PersonaRefactoriza {
    public Cliente(String nombre) {
        super(nombre);
    }

    public void comprar() {
        System.out.println(nombre + " está comprando.");
    }
}

class Estudiante extends PersonaRefactoriza {
    public Estudiante(String nombre) {
        super(nombre);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }
}

class EstudianteEmpleado extends Estudiante {
    public EstudianteEmpleado(String nombre) {
        super(nombre);
    }

    public void trabajar() {
        System.out.println(nombre + " está estudiando y trabajando.");
    }
}

class Artista extends PersonaRefactoriza {
    public Artista(String nombre) {
        super(nombre);
    }

    public void pintar() {
        System.out.println(nombre + " está pintando.");
    }
}