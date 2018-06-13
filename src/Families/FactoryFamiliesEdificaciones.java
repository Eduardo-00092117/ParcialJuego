package Families;

import Raza.AbstracFactory;
import Raza.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryFamiliesEdificaciones implements AbstracFactory {

    @Override
    public Razas getBallas(int opc) {
        return null;
    }

    @Override
    public Razas getFamilies(int opc) {
        switch (opc) {
            case 1:
                return new edificioFamiliesRecursos1();
            case 2:
                return new edificioFamiliesRecursos2();
            case 3:
                return new edificioFamiliesRecursos3();
            case 4:
                return new edificioCentroMandoFamilies();

        }
        return null;
    }

    @Override
    public Razas getVagos(int opc) {
        return null;
    }

}
