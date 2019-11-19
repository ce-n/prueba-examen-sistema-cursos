
package curso;
import java.util.ArrayList;

public class Pregunta {
    private String consigna;
    private ArrayList <String> opciones = new ArrayList <String> ();
    private int opcionCorrecta;
    private float puntaje;
    
    public Pregunta (String consigna, float puntaje ) {
            this.consigna = consigna;
            this.puntaje= puntaje;

    }
    
    public void addOpcion (String opcion) {
        opciones.add(opcion);
    }
    
    public void setOpcionCorrecta (int opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }
    
    public boolean esCorrecta (int respuesta) {

        boolean respuestaCorrecta = false;
    
        if (respuesta == opcionCorrecta) {
        
        respuestaCorrecta = true;

        }

        return respuestaCorrecta;
    
    }
    
    public float getPuntaje () {
        return puntaje;
    }

}
