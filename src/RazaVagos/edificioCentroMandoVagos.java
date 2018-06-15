
package RazaVagos;
import Raza.*;
import EdificacionCentroMando.*;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioCentroMandoVagos implements Razas{    
    private static EdificioCentroMando edificio = new EdificioCentroMando();
    
    @Override
    public EdificioCentroMando getInstance2(){
        return edificio;
    }
    
    public EdificioRecurso getInstance(){
        return null;
    }

    @Override
    public void crearEdificacionRecursos() {}

    @Override
    public void crearEdificacionEntrenamiento() {}

    @Override
    public void crearCentroMando() {
        edificio.setNombre("Centro de Mando - Vagos");
        edificio.setVida(1000);
        edificio.setCapacidad(10000, 5000, 3000);
        edificio.setMontoRecurso(5000, 3000, 1000);
    }

    @Override
    public EdificioEntrenamiento getInstance3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearEdificacionVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificioVehiculo getInstance4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
