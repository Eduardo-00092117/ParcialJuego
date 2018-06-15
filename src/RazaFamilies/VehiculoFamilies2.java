
package RazaFamilies;

import Vehiculos.Vehiculo;
import Vehiculos.Vehiculos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class VehiculoFamilies2 implements Vehiculo{
    private static Vehiculos vehiculo = new Vehiculos();
    
    @Override
    public Vehiculos getInstance() {
        return vehiculo;
    }

    @Override
    public void crearVehiculos() {
        vehiculo.setTipoNombre("Carro de policia");
        vehiculo.setTipoRaza("Families");
        vehiculo.setVida(450);
        vehiculo.setTiempo(2);
        vehiculo.setCosto1(2, 300);
        vehiculo.setCosto2(3, 300);
        vehiculo.setAtaque(50);
    }
}
