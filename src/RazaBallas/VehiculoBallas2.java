
package RazaBallas;

import Vehiculos.Vehiculo;
import Vehiculos.Vehiculos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class VehiculoBallas2 implements Vehiculo{
    private static Vehiculos vehiculo = new Vehiculos();
    
    @Override
    public Vehiculos getInstance() {
        return vehiculo;
    }

    @Override
    public void crearVehiculos() {
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();
        ballas.getBallas(6).crearEdificacionVehiculo();
        vehiculo.setTipoNombre("Potente tanque");
        vehiculo.setTipoRaza("Ballas");
        vehiculo.setVida(0);
        vehiculo.setTiempo(0);
        vehiculo.setCosto1(0, 0);
        vehiculo.setCosto2(0, 0);
        vehiculo.setAtaque(0);
        vehiculo.setEdificio(ballas.getBallas(6).getInstance4());
    }
}
