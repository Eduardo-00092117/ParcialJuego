
package Raza;

import Vagos.Vagos;
import Families.Families;
import Ballas.Ballas;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public interface AbstracFactory {
    public Ballas getBallas(int opc);
    public Families getFamilies(int opc);
    public Vagos getVagos(int opc);
}
