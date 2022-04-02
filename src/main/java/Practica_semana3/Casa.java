package Practica_semana3;

public class Casa {
   
    private String N_Casa;
    private int N_Pasaje;
    private String Nombre_C;

    public Casa() {
    }

    public Casa(String N_Casa, int NumeroPSJ, String NombreCalle) {
        this .N_Casa = N_Casa;
        this. N_Pasaje = N_Pasaje;
        this.  Nombre_C = Nombre_C;
    }
    

    public String getN_Casa() {
        return N_Casa;
    }

    public void setN_Casa(String N_Casa) {
        this. N_Casa = N_Casa;
    }

    public int getN_Pasaje() {
        return N_Pasaje;
    }

    public void setN_Pasaje(int N_Pasaje) {
        this.N_Pasaje=N_Pasaje;
    }

    public String getNombre_C() {
        return Nombre_C;
    }

    public void setNombre_C(String Nombre_C) {
        this. Nombre_C = Nombre_C;
    }
     public void imprimirdatos(){
        System.out.println("----------------------------");
        System.out.println("CASA CREADA");
        System.out.println("Numero de casa asignado: "+ this. getN_Casa ());
        System.out.println("Numero de pasaje asignado: "+this. getN_Pasaje());
        System.out.println("Nombre de calle: "+ this. getNombre_C());
    }
}

