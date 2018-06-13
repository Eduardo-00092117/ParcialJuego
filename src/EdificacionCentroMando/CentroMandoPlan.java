
package EdificacionCentroMando;


/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface CentroMandoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad(int capacidad1, int capacidad2, int capacidad3);
    public void setMontoRecurso(int recurso1, int recurso2, int recurso3);
    
    public String getNombre();
    public int getVida();
    public int[] getCapacidad();
    public int[] getMontoRecurso();
}
