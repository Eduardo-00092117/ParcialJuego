
package Vagos;

import Ballas.edificioCentroMandoBallas;
import Raza.AbstracFactory;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryVagosEdificaciones implements AbstracFactory{

    @Override
    public Razas getBallas(int opc) {
        return null;
    }

    @Override
    public Razas getFamilies(int opc) {
        return null;
    }

    @Override
    public Razas getVagos(int opc) {
        switch (opc) {
            case 1:
                return new edificioVagosRecursos1();
            case 2:
                return new edificioVagosRecursos2();
            case 3:
                return new edificioVagosRecursos3();
            case 4:
                return new edificioCentroMandoBallas();

        }
        return null;
    }
    
}
