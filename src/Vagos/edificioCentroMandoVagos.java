
package Vagos;
import Raza.*;
import EdificacionCentroMando.*;
import EdificacionRecurso.EdificioRecurso;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioCentroMandoVagos implements Razas{    
    private static EdificioCentroMando edificio = new EdificioCentroMando();
    
    public static EdificioCentroMando getInstance2(){
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
        edificio.setNombre("Poderoso centro de mando Ballas");
        edificio.setVida(1000);
        edificio.setCapacidad1(10000);
        edificio.setCapacidad2(5000);
        edificio.setCapacidad2(3000);
    }
    
}
