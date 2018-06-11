
package main;

import EdificacionRecurso.EdificioRecurso;
import Ballas.*;
import Families.*;
import Vagos.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class main {
    public static void main(String[] args) {  
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();   
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();   
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        
        ballas.getBallas(1).crearEdificacionRecursos();
        vagos.getVagos(2).crearEdificacionRecursos();
        families.getFamilies(3).crearEdificacionRecursos();
        
        EdificioRecurso edificio = edificioBallasRecursos1.getInstance();
        edificio.edificioRecurso.add(edificio);
        EdificioRecurso edificio2 = edificioVagosRecursos2.getInstance();
        edificio.edificioRecurso.add(edificio2);
        EdificioRecurso edificio3 = edificioFamiliesRecursos3.getInstance();
        edificio.edificioRecurso.add(edificio3);
        
        System.out.println(edificio.edificioRecurso.get(0).getNombre() + " - " + edificio.edificioRecurso.get(0).getRaza());
        System.out.println(edificio.edificioRecurso.get(1).getNombre() + " - " + edificio.edificioRecurso.get(1).getRaza());
        System.out.println(edificio.edificioRecurso.get(2).getNombre() + " - " + edificio.edificioRecurso.get(2).getRaza());
    }
}
