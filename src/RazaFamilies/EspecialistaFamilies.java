
package RazaFamilies;

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
        milicia.setAtaque(100);
        milicia.setCosto1(2, 400);
        milicia.setCosto1(1, 200);
        milicia.setTipoRaza("families");
        milicia.setVida(600);
        milicia.setTiempo(4);
    }    
}
