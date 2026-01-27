package Orientacion_a_objetos.Inicio;

public class Persona {

    //Atributo
    int edad;
    String nombre;
    String lugarNacimiento;
    String peliFav;
    String deporteFav;

    //Constructores
    //Constructor con todos los parametros
    public Persona(int edad, String nombre, String lugarNacimiento, String peliFav, String deporteFav) {
        // edad = 0;  por parametro
        this.edad = edad;
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.peliFav = peliFav;
        this.deporteFav = deporteFav;
    }

    //Constructor default
    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.lugarNacimiento = "";
        this.peliFav = "";
        this.deporteFav = "";
    }

    //Métodos
    void hablar(){
        System.out.println(nombre + " está hablando...");
    }

    boolean haRobado(){
        return false;
    }

    void comer(){
        System.out.println(nombre + " esta comiendo...");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", peliFav='" + peliFav + '\'' +
                ", deporteFav='" + deporteFav + '\'' +
                '}';
    }

}
