/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaVeterinaria;

/**
 *
 * @author Kevin
 */
public class Consulta {
     private int codigo;
     private String fecha;
    
    Veterinario vet = new Veterinario("Carlos", " anastesiologo");

    public Consulta(int codigo, String fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
       
    }
     
     public void mostrarDetallesConsulta(){
         System.out.println("Detalles Consulta");
         System.out.println("Codigo:"+ this.codigo );
         System.out.println("Fecha:"+ this.fecha);
         System.out.println("Nombre:"+ vet.nombre);
         System.out.println("Especialidad:"+ vet.especialidad);
        
         
     }
}
