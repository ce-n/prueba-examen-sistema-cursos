
package curso;

import java.util.ArrayList;

public class Examen {
    
    private ArrayList <Pregunta> preguntas = new ArrayList <> ();
    private ArrayList <Integer> respuestas = new ArrayList <> ();
    private String tema;
    private float puntajeAprobacion;
    
    public Examen (String tema,float puntajeAprobacion) {
        this.tema = tema;
        this.puntajeAprobacion = puntajeAprobacion;
    }
    
    public void addPregunta (Pregunta pregunta) {
        this.preguntas.add(pregunta);
    }
    
    public String getTema () {
        return tema;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
    
    public ArrayList <Integer> getRespuestas () {
        return respuestas;
    }
    
    public float getPuntajeTotal (ArrayList <Pregunta> preguntas) {
        float puntajePregunta;
        float puntajeTotal = 0;
        for (int i=0; i<preguntas.size(); i++) {
            if (preguntas.get(i).esCorrecta(respuestas.get(i))) {
                        puntajePregunta = preguntas.get(i).getPuntaje();
                        puntajeTotal = puntajeTotal+puntajePregunta;
            }
        }
        
        return puntajeTotal;
         
    }



}
