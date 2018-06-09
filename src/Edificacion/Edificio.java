
package Edificacion;
import Raza.*;
import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Edificio implements RecursosPlan{
    public String nombre;
    public int capacidad;
    
    public ArrayList<Edificio> edificio = new ArrayList<>();
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}
