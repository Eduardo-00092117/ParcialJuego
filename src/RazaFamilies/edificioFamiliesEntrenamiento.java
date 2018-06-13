
package RazaFamilies;
import RazaBallas.*;
import EdificacionCentroMando.EdificioCentroMando;
import Raza.*;
import EdificacionEntrenamiento.*;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioFamiliesEntrenamiento implements Razas{
    
    private static EdificioEntrenamiento edificio = new EdificioEntrenamiento();
    
    public EdificioEntrenamiento getInstance3(){
        return edificio;
    }
    
    public EdificioRecurso getInstance(){
        return null;
    }
    
    @Override
    public void crearEdificacionRecursos() {}

    @Override
    public void crearEdificacionEntrenamiento() {
        edificio.setNombre("Santa María");
        edificio.setRaza("Families"); 
        edificio.setTiempo(2);
        edificio.setVida(900);
        edificio.setCosto1(3, 200);
        edificio.setCosto2(1, 100);
    }
    
    @Override
    public void crearCentroMando() {}

    @Override
    public EdificioCentroMando getInstance2() {
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
