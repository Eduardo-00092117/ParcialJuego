
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
        vehiculo.setTipoNombre("Tanque");
        vehiculo.setTipoRaza("Ballas");
        vehiculo.setVida(650);
        vehiculo.setTiempo(4);
        vehiculo.setCosto1(2, 300);
        vehiculo.setCosto2(1, 400);
        vehiculo.setAtaque(200);
        vehiculo.setEdificio(ballas.getBallas(6).getInstance4());
    }
}
