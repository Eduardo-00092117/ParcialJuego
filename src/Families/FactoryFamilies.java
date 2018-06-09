package Families;

import Ballas.Ballas;
import Raza.AbstracFactory;
import Vagos.Vagos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryFamilies implements AbstracFactory {

    @Override
    public Ballas getBallas(int opc) {
        return null;
    }

    @Override
    public Families getFamilies(int opc) {
        switch (opc) {
            case 1:
                return new edificioFamiliesRecursos1();
            case 2:
                return new edificioFamiliesRecursos2();
            case 3:
                return new edificioFamiliesRecursos3();

        }
        return null;
    }

    @Override
    public Vagos getVagos(int opc) {
        return null;
    }

}
