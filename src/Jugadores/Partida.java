
package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Partida {
    private static Partida iniciar;
    
    public static Partida getInstance(){
        if(iniciar == null){
            iniciar = new Partida();
        }
        return iniciar;
    }
    
    public void Iniciar(){

        /*menu.menuEdificaciones();
        menu.menuEdificacionesJugador2();*/  
    }
}
