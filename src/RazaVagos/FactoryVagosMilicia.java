
package RazaVagos;

import Milicia.AbstracFactory;
import Milicia.Milicia;
import Raza.Razas;
import RazaBallas.EspecialistaBalla;
import RazaBallas.SoldadoBalla;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryVagosMilicia implements AbstracFactory{

    @Override
    public Milicia getBallasMilicia(int opc) {
        return null;
    }

    @Override
    public Milicia getFamiliesMilicia(int opc) {
        return null;
    }

    @Override
    public Milicia getVagosMilicia(int opc) {
        switch(opc){
            case 1:
                return new SoldadoVagos();
            case 2:
                return new EspecialistaVagos();
        }
        return null;
    }
    
}
