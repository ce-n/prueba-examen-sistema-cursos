
package curso;

/**
 *
 * @author Cecilia
 */
public class ExamenEspecial extends Examen{
    
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
 

    
}
