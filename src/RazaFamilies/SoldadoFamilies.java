
package RazaFamilies;

import Milicia.Milicia;
import Milicia.Milicias;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class SoldadoFamilies implements Milicia{
    
    private static Milicias milicia = new Milicias();
    
    @Override
    public Milicias getInstance() {
        return milicia;
    }
    
    @Override
    public void crearMilicia() {
        milicia.setTipoNombre("Soldados families");
        milicia.setAtaque(50);
        milicia.setCosto1(2, 100);
        milicia.setCosto1(1, 200);
        milicia.setTipoRaza("Families");
        milicia.setVida(0);
        milicia.setTiempo(2);
    }    
}
