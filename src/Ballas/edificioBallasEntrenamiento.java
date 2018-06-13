
package Ballas;
import Raza.*;
import EdificacionEntrenamiento.*;
import EdificacionRecurso.EdificioRecurso;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioBallasEntrenamiento implements Razas{
    
    private static EdificioEntrenamiento edificio = new EdificioEntrenamiento();
    
    public static EdificioEntrenamiento getInstance2(){
        return edificio;
    }
    
    public EdificioRecurso getInstance(){
        return null;
    }
    
    @Override
    public void crearEdificacionRecursos() {}

    @Override
    public void crearEdificacionEntrenamiento() {
        edificio.setNombre("Fortaleza flotante");
        edificio.setRaza("Ballas"); 
        edificio.setTiempo(2);
        edificio.setVida(200);
        edificio.setCosto1(2, 200);
        edificio.setCosto2(3, 300);
    }
    
    @Override
    public void crearCentroMando() {}
    
}
