package Practica_semana3;

import java.util.Scanner;

public class Valores {
   public static void main(String[] args) {
        Casa casa = new Casa();
        Scanner sc = new Scanner(System.in);
        
        //PEDIMOS LOS DATOS
        System.out.println("==================================");
        System.out.println("INGRESE LA INFORMACION DE LA CASA ");
        System.out.println("Ingrese el numero de casa: ");
        casa.setN_Casa(sc.nextLine());
        System.out.println("Ingrese numero de pasaje: ");
        casa.setN_Pasaje(sc.nextInt());
        sc.nextLine();
        System.out.println("Nombre de la calle: ");
        casa.setN_Pasaje(sc.nextInt());
        
        //LAMAMOS EL METODO
        casa.imprimirdatos();
  }
}