
package RazaFamilies;

import Raza.Razas;
import Vehiculos.AbstracFactory;
import Vehiculos.Vehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryFamiliesVehiculo implements AbstracFactory{

    @Override
    public Vehiculo getBallasVehiculo(int opc) {
        return null;
    }

    @Override
    public Vehiculo getFamiliesVehiculo(int opc) {
        switch(opc){
            case 1:
                return new VehiculoFamilies1();
            case 2:
                return new VehiculoFamilies2();
        }
        return null;
    }

    @Override
    public Vehiculo getVagosVehiculo(int opc) {
        return null;
    }
    
}
