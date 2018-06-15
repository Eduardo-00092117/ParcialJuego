package RazaFamilies;

import Vehiculos.Vehiculo;
import Vehiculos.Vehiculos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class VehiculoFamilies1 implements Vehiculo {
    private static Vehiculos vehiculo = new Vehiculos();
    
    @Override
    public Vehiculos getInstance() {
        return vehiculo;
    }

    @Override
    public void crearVehiculos() {
        vehiculo.setTipoNombre("Camion de bomberos");
        vehiculo.setTipoRaza("Families");
        vehiculo.setVida(0);
        vehiculo.setTiempo(0);
        vehiculo.setCosto1(0, 0);
        vehiculo.setCosto2(0, 0);
        vehiculo.setAtaque(0);
    }
}
