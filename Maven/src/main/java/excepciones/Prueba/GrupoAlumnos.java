package excepciones.Prueba;

public class GrupoAlumnos {
    private String[] nombre;
    private String[] apellidos;

    public GrupoAlumnos() {
        nombre = new String[20];
        apellidos = new String[20];
    }

    public GrupoAlumnos(String[] nombre, String[] apellidos) throws NullPointerException, ClassNotFoundException{
        this.setNombre(nombre);
        this.setApellidos(apellidos);
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) throws NullPointerException {
        if (nombre.length > 20){
            throw new NullPointerException("Llegan más de 20 nombres");
        }
        System.out.println("llego a asignación de nombres");
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) throws ClassNotFoundException {
        if (apellidos.length > 20){
            throw new ClassNotFoundException("Llegan más de 20 apellidos");
        }
        this.apellidos = apellidos;
    }

}
