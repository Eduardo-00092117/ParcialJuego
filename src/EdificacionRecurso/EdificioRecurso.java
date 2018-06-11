
package EdificacionRecurso;
import Raza.*;
import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EdificioRecurso implements RecursosPlan{
    public String nombre, raza;
    public int capacidad, vida, montoActual;
    
    public ArrayList<EdificioRecurso> edificioRecurso = new ArrayList<>();
    
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

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setMontoActual(int montoActual) {
        this.montoActual = montoActual;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getMontoActual() {
        return this.montoActual;
    }

    @Override
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int getCapacidad() {
        return this.capacidad;
    }
}
