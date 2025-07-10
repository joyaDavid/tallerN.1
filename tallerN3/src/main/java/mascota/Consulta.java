
package mascota;

public class Consulta {
     private String codigo;
     private String fecha;
     private String Veterinario;
     
     public void mostrarDetalleConsulta(){
     System.out.println("Numero de Consulta:" + codigo + "Fecha:" + fecha +"porpietario:" + Veterinario);  
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVeterinario() {
        return Veterinario;
    }

    public void setVeterinario(String Veterinario) {
        this.Veterinario = Veterinario;
    }

    public Consulta(String codigo, String fecha, String Veterinario) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.Veterinario = Veterinario;
    }
    
    Veterinario V = new Veterinario ("Felipe","urologo");
    
    public void mostrarConsulta(){
    
    System.out.println("----- Detalle de la consulta -----");
    System.out.println("Codigo:" + this.getCodigo());
    System.out.println("Fecha:" + this.getFecha());
    System.out.println("veterinario:" + V.getNombre());
    System.out.println("especialidad:" + V.getEspecialidad());
  }
    
}

