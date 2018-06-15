package RazaVagos;

import Vehiculos.Vehiculo;
import Vehiculos.Vehiculos;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class VehiculoVagos1 implements Vehiculo {
    private static Vehiculos vehiculo = new Vehiculos();
    
    @Override
    public Vehiculos getInstance() {
        return vehiculo;
    }

    @Override
    public void crearVehiculos() {
        vehiculo.setTipoNombre("Carro lanza cuete");
        vehiculo.setTipoRaza("Vagos");
        vehiculo.setVida(600);
        vehiculo.setTiempo(4);
        vehiculo.setCosto1(1, 600);
        vehiculo.setCosto2(2, 500);
        vehiculo.setAtaque(200);
    }
}
