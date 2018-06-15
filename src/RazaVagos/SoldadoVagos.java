
package RazaVagos;

import Milicia.Milicia;
import Milicia.Milicias;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class SoldadoVagos implements Milicia{
    
    private static Milicias milicia = new Milicias();
    
    @Override
    public Milicias getInstance() {
        return milicia;
    }
    
    @Override
    public void crearMilicia() {
        milicia.setTipoNombre("Soldados Vagos");
        milicia.setAtaque(100);
        milicia.setCosto1(2, 400);
        milicia.setCosto1(3, 500);
        milicia.setTipoRaza("Vagos");
        milicia.setVida(500);
        milicia.setTiempo(3);
    }    
}
