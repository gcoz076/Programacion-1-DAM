package excepciones.Prueba;

public class GestionaExcepciones {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            GrupoAlumnos grupo = new GrupoAlumnos(new String[21], new String[8]);
        } catch (ClassNotFoundException e){
            System.out.println("Ocurre ClassNotFound: "+ e.getMessage());
        } catch (NullPointerException i){
            System.out.println("Ocurre NullPointerException: "+ i.getMessage());
        }finally {
            System.out.println("Aqui entro siempre, soy un finally");
        }
        System.out.println("Sigo con mi tarea");
    }
}
