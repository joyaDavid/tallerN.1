
package clinicaVeterinaria;

import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private int documentos;
    private int telefono;
    private ArrayList<Mascota> mascotas ;

    public Propietario(String nombre, int documentos, int telefono) {
        setDocumentos(documentos);
        setNombre(nombre);
        setTelefono(telefono);
        this.mascotas = new ArrayList<>();
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
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
