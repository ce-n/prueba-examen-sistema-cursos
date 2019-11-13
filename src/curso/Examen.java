/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cecilia
 */
public class Examen {
    
    private List <Pregunta> preguntas = new ArrayList <> ();
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
    
}
