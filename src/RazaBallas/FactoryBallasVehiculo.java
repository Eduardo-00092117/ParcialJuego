
package RazaBallas;

import Vehiculos.AbstracFactory;
import Vehiculos.Vehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryBallasVehiculo implements AbstracFactory{

    @Override
    public Vehiculo getBallasVehiculo(int opc) {
        switch(opc){
            case 1:
                return new VehiculoBallas1();
            case 2:
                return new VehiculoBallas2();
        }
        return null;
    }

    @Override
    public Vehiculo getFamiliesVehiculo(int opc) {
        return null;
    }

    @Override
    public Vehiculo getVagosVehiculo(int opc) {
        return null;
    }
    
}
