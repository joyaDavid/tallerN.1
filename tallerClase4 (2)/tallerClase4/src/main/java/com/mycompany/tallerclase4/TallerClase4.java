/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tallerclase4;

import clinicaVeterinaria.Consulta;
import clinicaVeterinaria.IdGenerator;
import clinicaVeterinaria.Mascota;
import clinicaVeterinaria.Propietario;
import clinicaVeterinaria.Veterinario;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class TallerClase4 {

    public static void main(String[] args) {
      
//       Scanner scanner = new Scanner(System.in);
//
//        System.out.print("¿Cuál es el nombre del propietario?: ");
//        String nombrePropietario = scanner.nextLine();
//
//        System.out.print("¿Cuál es el número de documento?: ");
//        int numeroDocumento = scanner.nextInt();
//        scanner.nextLine(); // Limpiar el salto de línea
//
//        System.out.print("¿Cuál es el número de teléfono?: ");
//        int numeroTelefono = scanner.nextInt();
//        scanner.nextLine(); // Limpiar el salto de línea
//
//        Propietario pro = new Propietario(nombrePropietario, numeroDocumento, numeroTelefono);
//
//        boolean agregarMasMascotas;
//        do {
//            System.out.println("\n--- Agregar mascota ---");
//
//            System.out.print("Nombre de la mascota: ");
//            String nombreMascota = scanner.nextLine();
//
//            System.out.print("Especie: ");
//            String especie = scanner.nextLine();
//
//            System.out.print("Edad: ");
//            int edad = scanner.nextInt();
//            scanner.nextLine(); // Limpiar el salto de línea
//
//            Mascota mascota = new Mascota(nombreMascota, especie, edad);
//
//            boolean agregarMasConsultas;
//            do {
//                System.out.println("\n--- Agregar consulta ---");
//
//                System.out.print("Código de la consulta: ");
//                int codigo = scanner.nextInt();
//                scanner.nextLine(); // Limpiar el salto de línea
//
//                System.out.print("Fecha de la consulta: ");
//                String fecha = scanner.nextLine();
//
//                Consulta con = new Consulta(codigo, fecha);
//                mascota.agregarConsulta(con);
//
//                System.out.print("¿Agregar otra consulta a esta mascota? (s/n): ");
//                String respuestaConsulta = scanner.nextLine().toLowerCase();
//                agregarMasConsultas = respuestaConsulta.equals("s");
//
//            } while (agregarMasConsultas);
//
//            pro.agregarMascota(mascota);
//
//            System.out.print("¿Agregar otra mascota? (s/n): ");
//            String respuestaMascota = scanner.nextLine().toLowerCase();
//            agregarMasMascotas = respuestaMascota.equals("s");
//
//        } while (agregarMasMascotas);
//
//        System.out.println("\n=========== INFORMACIÓN COMPLETA ===========");
//        pro.mostrarInformacionCompleta();
//
//        scanner.close(); // Siempre cierra el Scanner al final
//    }
//}


    
        Scanner sc = new Scanner(System.in);

        // === Registro del Propietario ===
        System.out.println("=== Registro del Propietario ===");
        System.out.print("Nombre: ");
        String nombreProp = sc.nextLine();

        System.out.print("Documento: ");
        String documento = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        // Crear objeto Propietario con los datos ingresados
        Propietario propietario = new Propietario(nombreProp, Integer.parseInt(documento), Integer.parseInt(telefono));

        // === Registro de Mascotas usando do-while ===
        System.out.print("\n¿Cuántas mascotas desea registrar?: ");
        int numMascotas = Integer.parseInt(sc.nextLine());

        int i = 1;
        do {
            System.out.println("\n--- Mascota #" + i + " ---");

            System.out.print("Nombre de la mascota: ");
            String nombreMascota = sc.nextLine();

            System.out.print("Especie: ");
            String especie = sc.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            // Código automático para la mascota
            String codigoMascota = IdGenerator.generarCodigoMascota();

            // Crear mascota y agregarla al propietario
            Mascota mascota = new Mascota(nombreMascota, especie, edad);
            propietario.agregarMascota(mascota);

            // === Registro de Consultas usando do-while ===
            System.out.print("¿Cuántas consultas desea agregar a esta mascota?: ");
            int numConsultas = Integer.parseInt(sc.nextLine());

            int j = 1;
            do {
                System.out.println("-> Consulta #" + j);

                // Código automático para la consulta
                String codigoConsulta = IdGenerator.generarCodigoConsulta();

                System.out.print("Fecha (DI/ME/AÑ:): ");
                String fecha = sc.nextLine();

                // Datos del veterinario que atendió
                System.out.println("Información del veterinario:");
                System.out.print("Nombre: ");
                String nombreVet = sc.nextLine();

                System.out.print("Especialidad: ");
                String especialidad = sc.nextLine();

                // Crear veterinario y consulta
                Veterinario vet = new Veterinario(nombreVet, especialidad);
                Consulta consulta = new Consulta(codigoConsulta, fecha, vet);

                // Agregar la consulta al historial de la mascota
                mascota.agregarConsulta(consulta);

                j++;
            } while (j <= numConsultas);

            i++;
        } while (i <= numMascotas);

        // === Mostrar toda la información al final ===
        System.out.println("\n===== FICHA CLÍNICA COMPLETA =====");
        propietario.mostrarInformacionCompleta();// Info del dueño

        sc.close(); // Cerrar el scanner
    }
}



    

