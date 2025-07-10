
package mascota;

import java.util.Scanner ;
 
public class Main {
   
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
        
        System.out.println("propietario:");
        String nombrePropietario = Sc.nextLine();
        
        System.out.print("documento:");
        String documento = Sc.nextLine();
       
        System.out.println("telefono:");
        String telefono = Sc.nextLine();
        
        Propietario P = new Propietario(nombrePropietario, documento, telefono);
        P.mostrarInformacionCompleta();

        
        System.out.println("Nombre Mascota:");
        String nombreMascota = Sc.nextLine();
        
        System.out.println(" Raza:");
        String RazaMacota = Sc.nextLine();
        
        System.out.println("Edad:");
        int EdadMascota = Sc.nextInt();
        
        Mascota M = new Mascota (nombreMascota, RazaMacota, EdadMascota);
        M.mostrarHistorial();
  
     Propietario pro = new Propietario(nombrePropietario, documento, telefono);

        System.out.print("¿Cuántas mascotas desea registrar?: ");
        int cantidadMascotas = Sc.nextInt();
        Sc.nextLine(); // limpiar buffer

        for (int i = 0; i < cantidadMascotas; i++) {
            System.out.println("\n--- Agregar mascota #" + (i + 1) + " ---");

            System.out.print(" Nombre Mascota: ");
            String Mascota = Sc.nextLine();

            System.out.print(" Especie: ");
            String especie = Sc.nextLine();

            System.out.print(" Edad: ");
            int edad = Sc.nextInt();
            Sc.nextLine(); // limpiar buffer

            Mascota mascota = new Mascota(nombreMascota, especie, edad);

            System.out.print("¿Cuántas consultas desea registrar para esta mascota?: ");
            int cantidadConsultas = Sc.nextInt();
            Sc.nextLine(); // limpiar buffer

            for (int j = 0; j < cantidadConsultas; j++) {
                System.out.println("\n--- Agregar consulta #" + (j + 1) + " ---");

                
                System.out.print("Código de la consulta: ");
                int codigo = Sc.nextInt();
                Sc.nextLine(); // limpiar buffer

                System.out.print("Fecha de la consulta: ");
                String fecha = Sc.nextLine();

                Consulta C = new Consulta("\n", "codigo de consulta", "fecha de consulta" );
                mascota.agregarConsulta(C);
            }

                P.agregarMascota(mascota);
        }
                System.out.println("\n -----INFORMACIÓN COMPLETA------ ");
                P.mostrarInformacionCompleta();
    }
}   
    
