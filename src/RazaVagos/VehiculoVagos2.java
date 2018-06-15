
package RazaVagos;

import Vehiculos.Vehiculo;
import Vehiculos.Vehiculos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class VehiculoVagos2 implements Vehiculo{
    private static Vehiculos vehiculo = new Vehiculos();
    
    @Override
    public Vehiculos getInstance() {
        return vehiculo;
    }

    @Override
    public void crearVehiculos() {
        vehiculo.setTipoNombre("Carro de misil");
        vehiculo.setTipoRaza("Vagos");
        vehiculo.setVida(500);
        vehiculo.setTiempo(2);
        vehiculo.setCosto1(2, 400);
        vehiculo.setCosto2(3, 700);
        vehiculo.setAtaque(100);
    }
}
