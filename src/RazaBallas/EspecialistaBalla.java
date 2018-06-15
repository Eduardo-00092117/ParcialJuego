
package RazaBallas;

import Milicia.Milicia;
import Milicia.Milicias;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EspecialistaBalla implements Milicia{
    
    private static Milicias milicia = new Milicias();
    
    @Override
    public Milicias getInstance() {
        return milicia;
    }
    
    @Override
    public void crearMilicia() {
        milicia.setTipoNombre("Especialista ballas");
        milicia.setAtaque(100);
        milicia.setCosto1(2, 100);
        milicia.setCosto1(1, 200);
        milicia.setTipoRaza("Ballas");
        milicia.setVida(600);
        milicia.setTiempo(1);
    }    
}
