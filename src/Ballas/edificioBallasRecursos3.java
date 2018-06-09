
package Ballas;
import Edificacion.*;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioBallasRecursos3 implements Ballas{
    private static Edificio edificio = new Edificio();
    
    public static Edificio getInstance(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {
        edificio.setNombre("Cuartel real academia"); 
        edificio.setCapacidad(10000);
    }

    @Override
    public Edificio getEdificioRecursos() {
        return this.edificio;
    }
}
