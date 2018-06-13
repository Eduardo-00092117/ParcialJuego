
package Vagos;
import EdificacionRecurso.*;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioVagosRecursos1 implements Razas{
    private static EdificioRecurso edificio = new EdificioRecurso();
    
    public EdificioRecurso getInstance(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {
        edificio.setNombre("Cuartel capital"); 
        edificio.setMontoActual(1000);
        edificio.setRaza("Vagos");
        edificio.setVida(100);
        edificio.setCapacidad(10000);
    }

    @Override
    public void crearEdificacionEntrenamiento() {}
    
    @Override
    public void crearCentroMando() {}
}
