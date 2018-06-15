
package RazaBallas;

import Milicia.Milicia;
import Milicia.Milicias;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class SoldadoBalla implements Milicia{
    
    private static Milicias milicia = new Milicias();
    
    @Override
    public Milicias getInstance() {
        return milicia;
    }
    
    @Override
    public void crearMilicia() {
        milicia.setTipoNombre("Soldado balla");
        milicia.setAtaque(50);
        milicia.setCosto1(2, 100);
        milicia.setCosto1(1, 200);
        milicia.setTipoRaza("Ballas");
        milicia.setVida(450);
        milicia.setTiempo(2);
    }    
}
