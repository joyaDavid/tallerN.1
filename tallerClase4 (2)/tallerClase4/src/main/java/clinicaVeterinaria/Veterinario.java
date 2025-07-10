
package clinicaVeterinaria;

public class Veterinario {

    public String nombre;
    public String especialidad;

    public Veterinario(String nombre, String especialidad) {
        setEspecialidad(especialidad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(" nombre del veterinario no puede estar vacío. ");
        }
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.especialidad = especialidad;
    }

    public void mostrarPerfil() {
        System.out.println("| Veterinario: |" + nombre + "| Especialidad: | " + especialidad);

    }

}
