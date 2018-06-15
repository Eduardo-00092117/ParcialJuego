
package Vehiculos;

import EdificacionVehiculo.EdificioVehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface VehiculoPlan {
    public void setTipoNombre(String tipo);
    public void setTipoRaza(String raza);
    public void setTiempo(int tiempo);
    public void setVida(int vida);
    public void setAtaque(int ataque);
    public void setCosto1(int recurso, int costo);
    public void setCosto2(int recurso, int costo);
    public void setEdificio(EdificioVehiculo Edificio);
    
    public String getTipoNombre();
    public String getTipoRaza();
    public int getTiempo();
    public int getVida();
    public int getAtaque();
    public int[] getCosto1();
    public int[] getCosto2();
    public EdificioVehiculo getEdificio();
}
