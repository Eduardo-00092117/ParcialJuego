
package main;

import Raza.*;
import Edificacion.*;
import Ballas.*;
import Families.*;
import Vagos.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class main {
    public static void main(String[] args) {
        FactoryBallas ballas = new FactoryBallas();   
        FactoryVagos vagos = new FactoryVagos();   
        FactoryFamilies families = new FactoryFamilies();
        
        ballas.getBallas(1).crearEdificacionRecursos();
        vagos.getVagos(2).crearEdificacionRecursos();
        families.getFamilies(3).crearEdificacionRecursos();
        
        Edificio edificio = edificioBallasRecursos1.getInstance();
        edificio.edificio.add(edificio);
        Edificio edificio2 = edificioVagosRecursos2.getInstance();
        edificio.edificio.add(edificio2);
        Edificio edificio3 = edificioFamiliesRecursos3.getInstance();
        edificio.edificio.add(edificio3);
        
        System.out.println(edificio.edificio.get(0).getNombre());
        System.out.println(edificio.edificio.get(1).getNombre());
        System.out.println(edificio.edificio.get(2).getNombre());
    }
}
