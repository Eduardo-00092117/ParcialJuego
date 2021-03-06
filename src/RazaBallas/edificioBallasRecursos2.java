
package RazaBallas;
import EdificacionCentroMando.EdificioCentroMando;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;
import Raza.Razas;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioBallasRecursos2 implements Razas{
    private static EdificioRecurso edificio = new EdificioRecurso();
    
    @Override
    public EdificioRecurso getInstance(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {
        edificio.setNombre("CASA DEL ORO"); 
        edificio.setMontoActual(0);
        edificio.setRaza("Ballas");
        edificio.setVida(600);
        edificio.setCapacidad(5000);
        edificio.setTiempo(3);
        edificio.setCosto1(1, 200);
        edificio.setCosto2(3, 400);
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
