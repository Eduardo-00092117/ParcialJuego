
package Ballas;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
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
        edificio.setNombre("Cuartel de la fuerzas armadas"); 
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
