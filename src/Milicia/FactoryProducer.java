
package Milicia;

import Vagos.FactoryVagosMilicia;
import Families.FactoryFamiliesMilicia;
import Ballas.FactoryBallasMilicia;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryProducer{
    public AbstracFactory getMilicia(String type){
        switch(type){
            case "Ballas":
                return new FactoryBallasMilicia();
            case "Families":
                return new FactoryFamiliesMilicia();
            case "Vagos":
                return new FactoryVagosMilicia();
        }
        return null;
    }
}
