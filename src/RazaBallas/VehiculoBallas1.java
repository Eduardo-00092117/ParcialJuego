package RazaBallas;

import Vehiculos.Vehiculo;
import Vehiculos.Vehiculos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class VehiculoBallas1 implements Vehiculo {
    private static Vehiculos vehiculo = new Vehiculos();
    
    @Override
    public Vehiculos getInstance() {
        return vehiculo;
    }

    @Override
    public void crearVehiculos() {
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();
        ballas.getBallas(5).crearEdificacionVehiculo();
        vehiculo.setTipoNombre("Tractor");
        vehiculo.setTipoRaza("Ballas");
        vehiculo.setVida(450);
        vehiculo.setTiempo(3);
        vehiculo.setCosto1(1, 100);
        vehiculo.setCosto2(2, 300);
        vehiculo.setAtaque(100);
        vehiculo.setEdificio(ballas.getBallas(5).getInstance4());
    }
}
