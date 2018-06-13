package RazaFamilies;

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
                return new edificioFamiliesEntrenamiento();
            case 5:
                return new edificioFamiliesVehiculo1();
            case 6:
                return new edificioFamiliesVehiculo2();
            case 7:
                return new edificioCentroMandoFamilies();

        }
        return null;
    }

    @Override
    public Razas getVagos(int opc) {
        return null;
    }

}
