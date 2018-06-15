
package Vehiculos;

import RazaVagos.FactoryVagosVehiculo;
import RazaFamilies.FactoryFamiliesVehiculo;
import RazaBallas.FactoryBallasVehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryProducer{
    public static AbstracFactory getVehiculo(int type){
        switch(type){
            case 1:
                return new FactoryBallasVehiculo();
            case 2:
                return new FactoryFamiliesVehiculo();
            case 3:
                return new FactoryVagosVehiculo();
        }
        return null;
    }
}
