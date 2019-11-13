
package curso;
import java.util.ArrayList;
import java.util.List;

public class RendicionDeExamen {
    private Examen examen;
    private ArrayList <Integer> respuestas = new ArrayList <> ();
    private int puntajeMinmo;
    
    public RendicionDeExamen (Examen examen, ArrayList <Integer> respuestas) {
        
        this.examen = examen;
        this.respuestas = respuestas;

    }
    
    public Examen getExamen () {
        return examen;
    }

    }


