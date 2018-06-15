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
        vehiculo.setVida(600);
        vehiculo.setTiempo(4);
        vehiculo.setCosto1(1, 500);
        vehiculo.setCosto2(3, 200);
        vehiculo.setAtaque(100);
    }
}
