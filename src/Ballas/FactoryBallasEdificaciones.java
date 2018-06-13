package Ballas;

import Raza.AbstracFactory;
import Raza.Razas;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryBallasEdificaciones implements AbstracFactory {

    @Override
    public Razas getBallas(int opc) {
        switch (opc) {
            case 1:
                return new edificioBallasRecursos1();
            case 2:
                return new edificioBallasRecursos2();
            case 3:
                return new edificioBallasRecursos3();
            case 4:
                return new edificioCentroMandoBallas();
        }
        return null;
    }

    @Override
    public Razas getFamilies(int opc) {
        return null;
    }

    @Override
    public Razas getVagos(int opc) {
        return null;
    }

}
