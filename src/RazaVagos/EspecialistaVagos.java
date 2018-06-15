
package RazaVagos;

import Milicia.Milicia;
import Milicia.Milicias;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EspecialistaVagos implements Milicia{
    
    private static Milicias milicia = new Milicias();
    
    @Override
    public Milicias getInstance() {
        return milicia;
    }
    
    @Override
    public void crearMilicia() {
        milicia.setTipoNombre("Especialista Vagos");
        milicia.setAtaque(200);
        milicia.setCosto1(2, 400);
        milicia.setCosto1(1, 600);
        milicia.setTipoRaza("Vagos");
        milicia.setVida(700);
        milicia.setTiempo(5);
    }    
}
