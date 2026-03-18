package Orientacion_a_objetos.Herencias.CocheH;

public class Vehiculo {
    //Atributos
    private String matricula;
    private String tipo; // ECO, B, C, etc.

    public Vehiculo(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodos
    public boolean tieneLimitacionParaCircular(String ciudad) {
        boolean resultado;
        resultado = false;
        return resultado;
    }

    @Override
    public String toString() {
        String texto;
        texto = "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
        return texto;
    }

}
