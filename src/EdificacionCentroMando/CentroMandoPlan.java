
package EdificacionCentroMando;

import EdificacionEntrenamiento.*;


/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface CentroMandoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad1(int capacidad1);
    public void setCapacidad2(int capacidad2);
    public void setCapacidad3(int capacidad3);
    
    public String getNombre();
    public int getVida();
    public int getCapacidad1();
    public int getCapacidad2();
    public int getCapacidad3();
}
