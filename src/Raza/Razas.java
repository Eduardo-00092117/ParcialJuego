
package Raza;

import EdificacionCentroMando.EdificioCentroMando;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface Razas {
    public void crearEdificacionRecursos();
    public void crearEdificacionEntrenamiento();
    public void crearCentroMando();
    public void crearEdificacionVehiculo();
    public EdificioRecurso getInstance();
    public EdificioCentroMando getInstance2();
    public EdificioEntrenamiento getInstance3();
    public EdificioVehiculo getInstance4();
}
