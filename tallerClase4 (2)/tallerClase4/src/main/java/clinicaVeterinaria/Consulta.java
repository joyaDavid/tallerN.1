
package clinicaVeterinaria;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Consulta {

    private String codigo;
    private LocalDate fecha;

//    Veterinario vet = new Veterinario("Carlos", " anastesiologo");
    
    private Veterinario vet;

    public Consulta(String codigo, String fecha, Veterinario vet) {
        setCodigo(codigo);
        setFecha(fecha);
        setVet(vet);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código inválido.");
        }
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fechaText) {
        try {
            this.fecha = LocalDate.parse(fechaText);
         }catch(DateTimeParseException E){
           throw new IllegalArgumentException(" formato de fecha no valido");
        }

    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        if (vet == null) {
            throw new IllegalArgumentException("Veterinario requerido");
        }
        this.vet = vet;
    }

//        public void mostrarDetallesConsulta() {
//        System.out.println("Detalles Consulta");
//        System.out.println("Codigo:" + thiscodigo);
//        System.out.println("Fecha:" + this.fecha);
//        System.out.println("Nombre:" + vet.nombre);
//        System.out.println("Especialidad:" + vet.especialidad);
   
    
    public void mostrarDetallesConsulta() {
        System.out.println("Detalles Consulta");
        System.out.println("Codigo:" + codigo);
        System.out.println("Fecha:" + this.fecha);
        if ( vet != null ){
            vet.mostrarPerfil();
        }else{
            System.out.println(" Sin veterinario asignado");
        }

    }
}
  