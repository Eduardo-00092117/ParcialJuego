
package RazaBallas;

import EdificacionCentroMando.EdificioCentroMando;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioBallasVehiculo1 implements Razas{
    
    private static EdificioVehiculo edificio = new EdificioVehiculo();
    
    @Override
    public EdificioVehiculo getInstance4() {
        return edificio;
    }
    
    @Override
    public void crearEdificacionVehiculo() {
        edificio.setNombre("Granja (Tractor)");
        edificio.setRaza("Ballas"); 
        edificio.setVida(700);
        edificio.setEdificio(1);
        edificio.setCosto1(2, 400);
        edificio.setCosto2(1, 600);
    }
    
    @Override
    public void crearEdificacionRecursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearEdificacionEntrenamiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearCentroMando() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificioRecurso getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificioCentroMando getInstance2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EdificioEntrenamiento getInstance3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
