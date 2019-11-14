
package curso;

import java.util.ArrayList;

public class ExamenEspecial extends Examen{
    
    private ArrayList <Pregunta> preguntas = new ArrayList <> ();
    private ArrayList <Integer> respuestas = new ArrayList <> ();
    private float penalizacionRespuestaIncorrecta;
    
    public ExamenEspecial (String tema, float puntajeAprobacion, float penalizacion) {
        super(tema, puntajeAprobacion);
        this.penalizacionRespuestaIncorrecta = penalizacion;
        
    }
    
    @Override
    public void addPregunta (Pregunta pregunta) {
        if (pregunta.getPuntaje() > penalizacionRespuestaIncorrecta ) {
            super.addPregunta(pregunta);
        }
    }
    
    public float getPenalizacionRespuestaIncorrecta () {
        return penalizacionRespuestaIncorrecta;
    }
    
    @Override
    public ArrayList <Integer> getRespuestas () {
        this.respuestas = super.getRespuestas();
        return respuestas;
    }
    
    @Override
    public ArrayList<Pregunta> getPreguntas() {
        this.preguntas = super.getPreguntas();
        return preguntas;
    }

    public float getTotalPenalizaciones (ArrayList <Integer> respuestas) {
        float totalpenalizacion=0;
        float acumuladorPenalizaciones=0;
        for (int i=0; i<respuestas.size(); i ++) {
            if (getPreguntas().get(i).esCorrecta(respuestas.get(i)) == false) {
                acumuladorPenalizaciones++;
                totalpenalizacion = getPenalizacionRespuestaIncorrecta()*acumuladorPenalizaciones;    
            }    
        }
        return totalpenalizacion;
    }
    
    public float getPuntajeTotal (ArrayList <Pregunta> preguntas, ArrayList <Integer> respuestas) {
        float puntajeConPenalizacion;
        puntajeConPenalizacion = super.getPuntajeTotal(preguntas) - getTotalPenalizaciones (respuestas);
        return puntajeConPenalizacion;
    }
}
