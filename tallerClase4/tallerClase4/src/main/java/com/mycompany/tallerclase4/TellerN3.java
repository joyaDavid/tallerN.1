/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tallerclase4;

import clinicaVeterinaria.Consulta;
import clinicaVeterinaria.Mascota;
import clinicaVeterinaria.Propietario;
import clinicaVeterinaria.Veterinario;
import java.util.Scanner;

/**
 *
 * @author jua david
 */
public class TellerN3 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cual es el nombre del propietario?:");
        String nombrePropietario = scanner.nextLine();
        
        System.out.print("Cual es el numero de documento?:");
        int numeroDocumento = scanner.nextInt();
        
        System.out.print("Cual es el numero de telefono?:");
        int numeroTelefono = scanner.nextInt();
        
        scanner.nextLine();
        
        Propietario pro = new Propietario(nombrePropietario, numeroDocumento, numeroTelefono);
        
        boolean agregarMasMascotas;
        do {
            System.out.println("\n--- Agregar mascota ---");
            System.out.print( "Nombre de la mascota: ");
            String nombreMascota = scanner.nextLine();

            System.out.print("Especie: ");
            String especie = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            Mascota mascota = new Mascota(nombreMascota, especie, edad);

            boolean agregarMasConsultas;
            do {
                System.out.println("\n--- Agregar consulta ---");
                System.out.print("Código de la consulta: ");
                int codigo = scanner.nextInt();

                System.out.print("Fecha de la consulta: ");
                String fecha = scanner.nextLine();
                
                
                Consulta con = new Consulta(codigo, fecha);
                mascota.agregarConsulta(con);

                System.out.print("\u00bfAgregar otra consulta a esta mascota? (s/n): ");
                agregarMasConsultas = scanner.nextLine().equals("s");

            } while (agregarMasConsultas);

            pro.agregarMascota(mascota);

            System.out.print("\u00bfAgregar otra mascota? (s/n): ");
            agregarMasMascotas = scanner.nextLine().equals("s");

        } while (agregarMasMascotas);

        System.out.println("\n=========== INFORMACIÓN COMPLETA ===========");
        pro.mostrarInformacionCompleta();
    }
}


    

