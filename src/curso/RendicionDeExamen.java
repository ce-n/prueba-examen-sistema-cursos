
package curso;
import java.util.ArrayList;
import java.util.List;

public class RendicionDeExamen {
    private Examen examen;
    private ArrayList <Integer> respuestas = new ArrayList <> ();
    private float puntajeMinimo;
    
    public RendicionDeExamen (Examen examen, ArrayList <Integer> respuestas) {
        
        this.examen = examen;
        this.respuestas = respuestas;

    }
    
    public Examen getExamen () {
        return examen;
    }
    
    public boolean estaAprobado () {
        boolean aprobado = false;
        
        if (examen.getPuntajeTotal(examen.getPreguntas()) >= puntajeMinimo) {
             aprobado = true;
        }
        
        return aprobado;
    }
    
    @Override
    public String toString () {
        String aprobado = "Desaprobado";
        if (this.estaAprobado()) {
            aprobado = "Aprobo";
        }
        
        return examen.getTema()+"("+aprobado+")";
    }

}


