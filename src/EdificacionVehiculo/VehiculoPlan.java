
package EdificacionVehiculo;

import Vehiculos.Vehiculos;
import java.util.ArrayList;


/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface VehiculoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setRaza(String raza);
    public void setTipo(String tipo);
    public void setCosto1(int recurso, int costo1);
    public void setCosto2(int recurso, int costo2);
    public void setTiempo(int tiempo);
    
    public String getNombre();
    public int getVida();
    public String getRaza();
    public String getTipo();
    public int[] getCosto1();
    public int[] getCosto2();
    public int getTiempo();
    public ArrayList<Vehiculos> getVehiculo(); 
}
