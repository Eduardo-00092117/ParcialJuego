
package Raza;

import EdificacionCentroMando.EdificioCentroMando;
import EdificacionRecurso.EdificioRecurso;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface Razas {
    public void crearEdificacionRecursos();
    public void crearEdificacionEntrenamiento();
    public void crearCentroMando();
    public EdificioRecurso getInstance();
    public EdificioCentroMando getInstance2();
}
