
package Vehiculos;

import RazaVagos.FactoryVagosVehiculo;
import RazaFamilies.FactoryFamiliesVehiculo;
import RazaBallas.FactoryBallasVehiculo;
import RazaVagos.FactoryVagosMilicia;
import RazaFamilies.FactoryFamiliesMilicia;
import RazaBallas.FactoryBallasMilicia;

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
