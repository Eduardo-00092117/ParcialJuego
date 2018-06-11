
package Vehiculos;

import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface AbstracFactory {
    public Razas getBallasVehiculo(int opc);
    public Razas getFamiliesVehiculo(int opc);
    public Razas getVagosVehiculo(int opc);
}
