
package Raza;

import Vagos.FactoryVagosEdificaciones;
import Families.FactoryFamiliesEdificaciones;
import Ballas.FactoryBallasEdificaciones;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryProducer {
    public static AbstracFactory getRaza(String type){
        switch(type){
            case "BALLAS":
                return new FactoryBallasEdificaciones();
            case "VAGOS":
                return new FactoryVagosEdificaciones();
            case "FAMILIES":
                return new FactoryFamiliesEdificaciones();
        }
        return null;
    }
}
