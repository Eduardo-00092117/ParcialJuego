
package RazaVagos;
import EdificacionCentroMando.EdificioCentroMando;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioVagosRecursos2 implements Razas{
    private static EdificioRecurso edificio = new EdificioRecurso();
    
    public EdificioRecurso getInstance(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {
        edificio.setNombre("CASA DEL QUETZAL"); 
        edificio.setMontoActual(0);
        edificio.setRaza("Vagos");
        edificio.setVida(700);
        edificio.setCapacidad(5000);
    }

    @Override
    public void crearEdificacionEntrenamiento() {}
    
    @Override
    public void crearCentroMando() {}

    @Override
    public EdificioCentroMando getInstance2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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