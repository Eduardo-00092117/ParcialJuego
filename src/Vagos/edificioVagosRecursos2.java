
package Vagos;
import Families.*;
import Ballas.*;
import Edificacion.*;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class edificioVagosRecursos2 implements Vagos{
    private static Edificio edificio = new Edificio();
    
    public static Edificio getInstance(){
        return edificio;
    }

    @Override
    public void crearEdificacionRecursos() {
        edificio.setNombre("Vagos - Cuartel de la fuerzas armadas"); 
        edificio.setCapacidad(10000);
    }

    @Override
    public Edificio getEdificioRecursos() {
        return this.edificio;
    }
}
