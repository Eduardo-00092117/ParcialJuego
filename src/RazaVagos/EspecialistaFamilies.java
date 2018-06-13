
package RazaVagos;

import Milicia.Milicia;
import Milicia.Milicias;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EspecialistaFamilies implements Milicia{
    
    private static Milicias milicia = new Milicias();
    
    @Override
    public Milicias getInstance() {
        return milicia;
    }
    
    @Override
    public void crearMilicia() {
        milicia.setTipoNombre("Especialista families");
        milicia.setAtaque(50);
        milicia.setCosto1(2, 100);
        milicia.setCosto1(1, 200);
        milicia.setTipoRaza("vagos");
        milicia.setVida(0);
        milicia.setTiempo(2);
    }    
}
