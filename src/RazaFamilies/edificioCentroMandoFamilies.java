
package RazaFamilies;
import Raza.*;
import EdificacionCentroMando.*;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioCentroMandoFamilies implements Razas{    
    private static EdificioCentroMando edificio = new EdificioCentroMando();
    
    @Override
    public EdificioCentroMando getInstance2(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {}

    @Override
    public void crearEdificacionEntrenamiento() {}

    @Override
    public void crearCentroMando() {
        edificio.setNombre("Poderoso centro de mando Families");
        edificio.setVida(1000);
        edificio.setCapacidad1(10000);
        edificio.setCapacidad2(5000);
        edificio.setCapacidad2(3000);
    }

    @Override
    public EdificioRecurso getInstance() {
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
