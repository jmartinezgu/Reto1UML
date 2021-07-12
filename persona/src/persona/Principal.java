package persona;

import java.time.Instant;
import java.util.Set;

/**
 *
 * @author Veronica
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonClass inst_persona = new PersonClass("Jenniffer", "cc", 1053771774, 'F', 63.2f, 1.51f, "Caldas", "Manizales", "cll 82b 38-50", 315, "Union libre", false, true, 1);
       System.out.println(inst_persona.mostrar_informacion_persona()); 
       
      inst_persona.ejercicio();
      inst_persona.banarse();
      inst_persona.cepillarse();
      inst_persona.comer();
      inst_persona.dormir();
      inst_persona.estudiar();
      inst_persona.trabajar();
    }   
}
