
package clinicaVeterinaria;

import java.util.ArrayList;

public class Historial {
    private ArrayList <Consulta> consultas;
    
    public Historial (){
        this.consultas = new ArrayList<>();
    }
    
    public void agregarConsulta(Consulta con){
        if (con != null){
            consultas.add(con);  
        }
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    public void mostrarConsultas (){
        if (consultas.isEmpty()){
            System.out.println(" Sin consultas registradas");
        }else {
            for (Consulta c : consultas){
                c.mostrarDetallesConsulta();
                System.out.println("-----------------------------");
                
            }
        }
    }
}
