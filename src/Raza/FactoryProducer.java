
package Raza;

import RazaVagos.FactoryVagosEdificaciones;
import RazaFamilies.FactoryFamiliesEdificaciones;
import RazaBallas.FactoryBallasEdificaciones;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryProducer {
    public static AbstracFactory getRaza(int type){
        switch(type){
            case 1:
                return new FactoryBallasEdificaciones();
            case 2:
                return new FactoryFamiliesEdificaciones();
            case 3:
                return new FactoryVagosEdificaciones();
        }
        return null;
    }
}
