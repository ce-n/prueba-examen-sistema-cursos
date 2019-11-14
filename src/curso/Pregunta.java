
package curso;
import java.util.ArrayList;

public class Pregunta {
    private String consigna;
    private float puntaje;
    private ArrayList <String> opciones = new ArrayList <String> ();
    private int opcionCorrecta;
    
    public Pregunta (String consigna, float puntaje ) {
            this.consigna = consigna;
            this.puntaje= puntaje;

    }
    
    public float getPuntaje () {
        return puntaje;
    }
    
    public boolean esCorrecta (int respuesta) {

        boolean respuestaCorrecta = false;
    
        if (respuesta == opcionCorrecta) {
        
        respuestaCorrecta = true;

        }

        return respuestaCorrecta;
    
    }

}
