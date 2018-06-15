
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
public class edificioVagosVehiculo1 implements Razas{
    
    private static EdificioVehiculo edificio = new EdificioVehiculo();
    
    @Override
    public EdificioVehiculo getInstance4() {
        return edificio;
    }
    
    @Override
    public void crearEdificacionVehiculo() {
        edificio.setNombre("Cochera vagos mexico (Carro lanza cuete)");
        edificio.setRaza("Vagos"); 
        edificio.setCosto1(1, 400);
        edificio.setCosto2(3, 600);
        edificio.setVida(700);
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
