
package EdificacionCentroMando;
import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EdificioCentroMando implements CentroMandoPlan{
    public String nombre, raza;
    public int vida, capacidad1, capacidad2, capacidad3, recurso1, recurso2, recurso3;
    
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
    public void setCapacidad(int capacidad1, int capacidad2, int capacidad3) {
       this.capacidad1 = capacidad1;
       this.capacidad2 = capacidad2;
       this.capacidad3 = capacidad3;
    }

    @Override
    public int[] getCapacidad() {
        int[] capacidad = new int[3];
        capacidad[0] = this.capacidad1;
        capacidad[1] = this.capacidad2;
        capacidad[2] = this.capacidad3;
        return capacidad;
    }

    @Override
    public void setMontoRecurso(int recurso1, int recurso2, int recurso3) {
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
    }

    @Override
    public int[] getMontoRecurso() {
        int[] recurso = new int[3];
        recurso[0] = this.recurso1;
        recurso[1] = this.recurso2;
        recurso[2] = this.recurso3;
        return recurso;
    }
}
