
package curso;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List <RendicionDeExamen> examenesRendidos = new ArrayList <> ();
    private String nombre;
    private int dni;
    
    public Alumno (String nombre, int dni ) {
        
    }
    
    public String getNombre (String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    
    public int getDni (int dni) {
        this.dni = dni;
        return dni;
    }
    
    public boolean rendirExamen (Examen examen, ArrayList <Integer> respuestas) {
        
        boolean nuevoExamenAgregado = false;
        
        for (int i=0; i<examenesRendidos.size(); i++) {
            RendicionDeExamen examenRendido = examenesRendidos.get(i);    
        
            if (examenRendido.estaAprobado() == false) {
                RendicionDeExamen nuevoExamenRendido = new RendicionDeExamen (examen, respuestas);
                examenesRendidos.add(nuevoExamenRendido);
                nuevoExamenAgregado = true;
            }
        }
        
        return nuevoExamenAgregado;   
    }
    
}
