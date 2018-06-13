
package EdificacionCentroMando;
import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EdificioCentroMando implements CentroMandoPlan{
    public String nombre, raza;
    public int vida, capacidad1, capacidad2, capacidad3;
    
    public ArrayList<EdificioCentroMando> edificioCentroMando = new ArrayList<>();

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
       this.vida = vida;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public void setCapacidad1(int capacidad1) {
        this.capacidad1 = capacidad1;
    }

    @Override
    public void setCapacidad2(int capacidad2) {
        this.capacidad2 = capacidad2;
    }

    @Override
    public void setCapacidad3(int capacidad3) {
        this.capacidad3 = capacidad3;
    }

    @Override
    public int getCapacidad1() {
        return this.capacidad1;
    }

    @Override
    public int getCapacidad2() {
        return this.capacidad2;
    }

    @Override
    public int getCapacidad3() {
        return this.capacidad3;
    }
}
