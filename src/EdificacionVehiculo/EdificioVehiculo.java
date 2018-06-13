
package EdificacionVehiculo;
import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EdificioVehiculo implements VehiculoPlan{
    public String nombre, raza, tipoVehiculo;
    public int costo1, costo2, recurso1, recurso2, vida, tiempo;
    
    public ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
       this.vida = vida;
    }

    @Override
    public void setRaza(String raza) {
       this.raza = raza;
    }

    @Override
    public void setCosto1(int recurso, int costo1) {
        this.recurso1 = recurso;
        this.costo1 = costo1;
    }

    @Override
    public void setCosto2(int recurso, int costo2) {
        this.recurso2 = recurso;
        this.costo2 = costo2;
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
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int[] getCosto1() {
        int[] costo = new int[1];
        costo[0] = this.recurso1;
        costo[1] = this.costo1;
        return costo;
    }

    @Override
    public int[] getCosto2() {
        int[] costo = new int[1];
        costo[0] = this.recurso2;
        costo[1] = this.costo2;
        return costo;
    }   

    @Override
    public void setTipo(String tipo) {
        this.tipoVehiculo = tipo;
    }

    @Override
    public String getTipo() {
        return this.tipoVehiculo;
    }

    @Override
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }
}
