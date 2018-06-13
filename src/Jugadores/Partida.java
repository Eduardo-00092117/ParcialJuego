
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
        Jugador1 jugador = Jugador1.getInstance();
        Menu menu = new Menu();
        menu.menuEleccion();
        menu.menuEdificaciones();
        /*jugador.guardarEdificiosRecursos(1);
        jugador.guardarEdificiosRecursos(2);
        jugador.guardarEdificiosRecursos(3);
        for(int i=0; i < jugador.getEdificacionRecurso().size(); i++){
            System.out.println(jugador.getEdificacionRecurso().get(i).getNombre()+" - "+jugador.getEdificacionRecurso().get(i).getRaza());
        }*/      
    }
}
