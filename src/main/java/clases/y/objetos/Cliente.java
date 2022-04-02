package clases.y.objetos;

public class Cliente {
    String duiCliente, nombreCliente;
    long telefonoCliente;
    
    public Cliente (String duiCliente, String nombreCliente, long telefonoCliente){
        this.duiCliente = duiCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
