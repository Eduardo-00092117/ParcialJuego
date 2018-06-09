package Ballas;

import Edificacion.*;
import Raza.AbstracFactory;
import Families.Families;
import Vagos.Vagos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryBallas implements AbstracFactory {

    @Override
    public Ballas getBallas(int opc) {
        switch (opc) {
            case 1:
                return new edificioBallasRecursos1();
            case 2:
                return new edificioBallasRecursos2();
            case 3:
                return new edificioBallasRecursos3();
        }
        return null;
    }

    @Override
    public Families getFamilies(int opc) {
        return null;
    }

    @Override
    public Vagos getVagos(int opc) {
        return null;
    }

}
