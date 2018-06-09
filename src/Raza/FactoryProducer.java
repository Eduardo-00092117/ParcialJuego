
package Raza;

import Vagos.FactoryVagos;
import Families.FactoryFamilies;
import Ballas.FactoryBallas;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryProducer {
    public static AbstracFactory getRaza(String type){
        switch(type){
            case "BALLAS":
                return new FactoryBallas();
            case "VAGOS":
                return new FactoryVagos();
            case "FAMILIES":
                return new FactoryFamilies();
        }
        return null;
    }
}
