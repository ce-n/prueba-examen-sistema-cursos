
package curso;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que representa a alumnos del curso
 * 
 * @author Cecilia
 * @see curso.RendicionDeExamen
 */
public class Alumno {
    private ArrayList <RendicionDeExamen> examenesRendidos = new ArrayList <> ();
    private String nombre;
    private int dni;
    
    public Alumno (String nombre, int dni ) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre (String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    
    public int getDni (int dni) {
        this.dni = dni;
        return dni;
    }
    
    /**
     * Se agrega un nuevo examen en la lista examenes rendidos del alumno
     * solo si el examen que se desea rendir está desaprobado
     * 
     * @param examen Examen necesario para generar una nueva rendicion
     * @param respuestas Respuestas necesarias para generar una nueva rendicion
     * @return Verdadero en caso de que se haya efectuado una nueva rendición de examen
     */
    
    public boolean rendirExamen (Examen examen, ArrayList <Integer> respuestas) {
        
        boolean nuevoExamenAgregado = false;
        
        for (int i=0; i<examenesRendidos.size()-1; i--) {
           
            RendicionDeExamen examenRendido = examenesRendidos.get(i);
            
            if (examenRendido.estaAprobado() == false) {
                  RendicionDeExamen nuevoExamenRendido = new RendicionDeExamen (examen, respuestas);
                  examenesRendidos.add(nuevoExamenRendido);
                  nuevoExamenAgregado = true;
                    
            }
        }
        return nuevoExamenAgregado;   
    }

     @Override
    public String toString () {
        String historiaAcademica = nombre+": ";
        Iterator <RendicionDeExamen> it = examenesRendidos.iterator();
        
        while (it.hasNext()) {
            RendicionDeExamen rendicion = it.next();
            historiaAcademica+= rendicion.toString()+"***";
        }
        return historiaAcademica;
    }
   
}
   
