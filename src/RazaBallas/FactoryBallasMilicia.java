
package RazaBallas;

import Milicia.AbstracFactory;
import Milicia.Milicia;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryBallasMilicia implements AbstracFactory{

    @Override
    public Milicia getBallasMilicia(int opc) {
        switch(opc){
            case 1:
                return new SoldadoBalla();
            case 2:
                return new EspecialistaBalla();
        }
        return null;
    }

    @Override
    public Milicia getFamiliesMilicia(int opc) {
        return null;
    }

    @Override
    public Milicia getVagosMilicia(int opc) {
        return null;
    }
    
}
