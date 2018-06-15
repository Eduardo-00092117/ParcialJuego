
package Vehiculos;


/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface AbstracFactory {
    public Vehiculo getBallasVehiculo(int opc);
    public Vehiculo getFamiliesVehiculo(int opc);
    public Vehiculo getVagosVehiculo(int opc);
}
