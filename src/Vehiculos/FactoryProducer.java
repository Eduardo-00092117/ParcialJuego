
package Vehiculos;

import Vagos.FactoryVagosVehiculo;
import Families.FactoryFamiliesVehiculo;
import Ballas.FactoryBallasVehiculo;
import Vagos.FactoryVagosMilicia;
import Families.FactoryFamiliesMilicia;
import Ballas.FactoryBallasMilicia;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryProducer{
    public AbstracFactory getVehiculo(String type){
        switch(type){
            case "Ballas":
                return new FactoryBallasVehiculo();
            case "Families":
                return new FactoryFamiliesVehiculo();
            case "Vagos":
                return new FactoryVagosVehiculo();
        }
        return null;
    }
}
