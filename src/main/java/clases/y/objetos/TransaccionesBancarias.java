package clases.y.objetos;

import java.util.Scanner;

public class TransaccionesBancarias {
    public static void main(String[]args){
     
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner leer = new Scanner (System.in);
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        double abono, retiro;
        
        System.out.println("Ingresar los datos que se solicitan a continuacion:");
        System.out.println("Nombre del propietario:");
        duiCliente=leer.nextLine();
        
        System.out.println("Numero DUI:");
        nombreCliente=leer.nextLine();
        
        System.out.println("Telfono:");
        telefonoCliente=leer.nextLong();

        Cliente propietario = new Cliente(duiCliente,nombreCliente, telefonoCliente);
       cuenta.propietarioCuenta = propietario;
        
        System.out.println("Ingresar la  a adonar:");
        cuenta.abonar(abono=leer.nextDouble());
        
        System.out.println("Ingresar la cantidad a retirar:");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("-----------------");
        System.out.println("Su aldo de la cuenta es:" + cuenta.saldoCuenta);
        //obtener informacion del propietario
        System.out.println("Datos de propietario  :\n" + cuenta.datosPropietarioCuenta());
    }
    
}
