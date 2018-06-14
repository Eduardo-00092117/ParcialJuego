
package RazaFamilies;

import Milicia.AbstracFactory;
import Milicia.Milicia;
import RazaBallas.EspecialistaBalla;
import RazaBallas.SoldadoBalla;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryFamiliesMilicia implements AbstracFactory{

    @Override
    public Milicia getBallasMilicia(int opc) {
        return null;
    }

    @Override
    public Milicia getFamiliesMilicia(int opc) {
        switch(opc){
            case 1:
                return new SoldadoFamilies();
            case 2:
                return new EspecialistaFamilies();
        }
        return null;
    }

    @Override
    public Milicia getVagosMilicia(int opc) {
        return null;
    }
    
}
