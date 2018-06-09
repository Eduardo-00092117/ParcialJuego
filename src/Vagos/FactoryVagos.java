
package Vagos;

import Families.Families;
import Ballas.Ballas;
import Raza.AbstracFactory;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryVagos implements AbstracFactory{

    @Override
    public Ballas getBallas(int opc) {
        return null;
    }

    @Override
    public Families getFamilies(int opc) {
        return null;
    }

    @Override
    public Vagos getVagos(int opc) {
        switch (opc) {
            case 1:
                return new edificioVagosRecursos1();
            case 2:
                return new edificioVagosRecursos2();
            case 3:
                return new edificioVagosRecursos3();

        }
        return null;
    }
    
}
