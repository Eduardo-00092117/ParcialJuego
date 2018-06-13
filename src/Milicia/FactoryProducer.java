
package Milicia;

import RazaVagos.FactoryVagosMilicia;
import RazaFamilies.FactoryFamiliesMilicia;
import RazaBallas.FactoryBallasMilicia;

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
