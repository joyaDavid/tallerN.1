
package mascota;
import java.util.ArrayList ;

public class Mascota {
    
    private String nombre;
    private String raza;
    private int edad;
    private ArrayList<Consulta> consultas = new ArrayList<>();
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.raza = especie;
        this.edad = edad;
    }
     public void agregarConsulta(Consulta C){
         consultas.add(C);
     }
        public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return raza;
    }

    public void setEspecie(String especie) {
        this.raza = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarHistorial(){
       System.out.println("Mascota:" + this.nombre + "|" + "Raza:" + this.raza + "|" + "Edad:" + this.edad);
       
       for (Consulta C : consultas) {
          C.mostrarDetalleConsulta();
       }
   }
}


