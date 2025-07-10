/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaVeterinaria;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Mascota {

    public String nombre;
    public String especie;
    public int edad; 
    private ArrayList<Consulta> consultas = new ArrayList();

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    public void agregarConsulta(Consulta c){
        consultas.add(c);
    }
    public void mostrarHistorial() {
        System.out.println("Mascota:" + this.nombre + " | " + "Especie: "+ this.especie + " | " + "Edad: " + this.edad);
        
        for (Consulta c : consultas){
        c.mostrarDetallesConsulta();
        }

    }
}
