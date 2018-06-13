
package Ballas;
import EdificacionRecurso.EdificioRecurso;
import Raza.Razas;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioBallasRecursos1 implements Razas{
    public static EdificioRecurso edificio = new EdificioRecurso();
    
    @Override
    public EdificioRecurso getInstance(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {
        edificio.setNombre("Cuartel capital");
        edificio.setMontoActual(1000);
        edificio.setRaza("Ballas");
        edificio.setVida(100);
        edificio.setCapacidad(10000);
    }

    @Override
    public void crearEdificacionEntrenamiento() {}

    @Override
    public void crearCentroMando() {}

}
