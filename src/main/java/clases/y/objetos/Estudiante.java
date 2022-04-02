package clases.y.objetos;

public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiante(){
        System.out.println("Metoodo para registro de estudiante:");
    }
    
    public void consultarEstudiante(){
        System.out.println("Metoodo para consultar de estudiante:");
    }
    
    public void eliminarEstudiante(){
        System.out.println("Metoodo para eliminarr de estudiante:");
    }

    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        est.carnet = 1234;
        est.nombre = "Amelia";
        est.apellido = "Rosales";
        
        est.registroEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet   : " + est.carnet);
        System.out.println("Nombre   : " + est.nombre);
        System.out.println("Apellidos: " + est.apellido);
    }
}
