
package RazaVagos;

import Vehiculos.AbstracFactory;
import Vehiculos.Vehiculo;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class FactoryVagosVehiculo implements AbstracFactory{

    @Override
    public Vehiculo getBallasVehiculo(int opc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo getFamiliesVehiculo(int opc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo getVagosVehiculo(int opc) {
        switch(opc){
            case 1:
                return new VehiculoVagos1();
            case 2:
                return new VehiculoVagos2();
        }
        return null;
    }
    
}
