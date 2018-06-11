
package EdificacionRecurso;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface RecursosPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setMontoActual( int montoActual);
    public void setRaza(String raza);
    public void setCapacidad(int capacidad);
    public void setTiempo(int tiempo);
    
    public String getNombre();            
    public int getVida();
    public int getMontoActual();
    public String getRaza();
    public int getCapacidad();
    public int getTiempo();
}
