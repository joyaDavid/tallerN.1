
 package mascota;
 import java.util.ArrayList ;


public class Propietario {
    private String nombre;
    private String documento;
    private String telefono;
    
    private ArrayList<Mascota> Mascotas = new ArrayList<>();
     
    public Propietario(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.Mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        Mascotas.add(mascota);
    }

    public void mostrarMascotas() {
        System.out.println("Mascotas de " + nombre + ":");
        for (Mascota m : Mascotas) {
            System.out.println(m);
        }
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documeto) {
        this.documento = documeto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void  mostrarInformacionCompleta(){
    
    System.out.println("nombre:" + this.getNombre());
    System.out.println("documento:" + this.getDocumento());
    System.out.println("telefono:" + this.getTelefono());
    
    for  (Mascota M : Mascotas) {
    M.mostrarHistorial();
    }
  }
}


