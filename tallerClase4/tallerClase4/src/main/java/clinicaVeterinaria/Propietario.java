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
public class Propietario {
    public String nombre;
    public int documentos;
    public int telefono;
    public ArrayList<Mascota> mascotas = new ArrayList<>();

    public Propietario(String nombre, int documentos, int telefono) {
        this.nombre = nombre;
        this.documentos = documentos;
        this.telefono = telefono;
    }
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    public void mostrarInformacionCompleta(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Documentacion: "+ this.documentos);
        System.out.println("Telefono: "+ this.telefono);
        for(Mascota m : mascotas){
            m.mostrarHistorial();
        }
    }
}
