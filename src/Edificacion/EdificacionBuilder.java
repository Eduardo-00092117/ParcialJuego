
package Edificacion;
import Ballas.Ballas;
import Raza.*;
import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EdificacionBuilder {
    private Ballas dato;
    
    public EdificacionBuilder(Ballas dato){
        this.dato = dato;
    }
    
    public void elaborarEdificio(){
        dato.crearEdificacionRecursos();
    }
    
    public Edificio getEdificio(){
        return this.dato.getEdificioRecursos();
    }
}
