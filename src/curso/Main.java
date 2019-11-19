
package curso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cecilia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Examen e1 = new Examen ("Capitales de provincias", 2);
        
        Pregunta p1 = new Pregunta ("Cuás es la capital de Sta Fe?",2);
        p1.addOpcion("Santa fe");
        p1.addOpcion("Rosario");
        p1.addOpcion("Parana");
        p1.setOpcionCorrecta(0);
        
        Pregunta p2 = new Pregunta ("Cuás es la capital de Corrientes?",1);
        p2.addOpcion("Parana");
        p2.addOpcion("Corrientes");
        p2.addOpcion("Goya");
        p2.setOpcionCorrecta(1);
        
        Pregunta p3 = new Pregunta ("Cuás es la capital de Misiones?",1);
        p3.addOpcion("Oberá");
        p3.addOpcion("Puerto Iguazu");
        p3.addOpcion("Posadas");
        p3.setOpcionCorrecta(2);
        
        e1.addPregunta(p1);
        e1.addPregunta(p2);
        e1.addPregunta(p3);
        
        Alumno alumno1 = new Alumno ("Juan", 35834686);
        ArrayList <Integer> respuestasE1 = new ArrayList <> ();
        respuestasE1.add(0);
        respuestasE1.add(2);
        respuestasE1.add(2);
        alumno1.rendirExamen(e1, respuestasE1);
        
        System.out.println(alumno1);
        
        Alumno alumno2 = new Alumno ("Alberto", 36989633);
        ArrayList <Integer> respuestasE2 = new ArrayList <> ();
        respuestasE2.add(1);
        respuestasE2.add(0);
        respuestasE2.add(1);
        alumno2.rendirExamen(e1, respuestasE2);
        
        System.out.println(alumno2);
        
        respuestasE1 = new ArrayList <> ();
        respuestasE1.add(1);
        respuestasE1.add(1);
        respuestasE1.add(2);
        
        alumno1.rendirExamen(e1, respuestasE1);
        System.out.println(alumno1);
    }
    
}
