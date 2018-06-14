
package Jugadores;

import EdificacionCentroMando.EdificioCentroMando;
import EdificacionEntrenamiento.EdificioEntrenamiento;
import EdificacionRecurso.EdificioRecurso;
import EdificacionVehiculo.EdificioVehiculo;
import Milicia.Milicias;
import RazaBallas.FactoryBallasEdificaciones;
import RazaBallas.FactoryBallasMilicia;
import RazaFamilies.FactoryFamiliesEdificaciones;
import RazaFamilies.FactoryFamiliesMilicia;
import RazaVagos.FactoryVagosEdificaciones;
import RazaVagos.FactoryVagosMilicia;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Jugador2 {
    private static Jugador2 jugador = new Jugador2();
    
    public static Jugador2 getInstance(){
        if(jugador == null){
            jugador = new Jugador2();
        }
        return jugador;
    }
    
    private ArrayList<EdificioRecurso> edificacionRecurso = new ArrayList<>();
    private ArrayList<EdificioEntrenamiento> edificioEntrenamiento = new ArrayList<>();
    private ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();
    private ArrayList<EdificioCentroMando> edificioCentroMando = new ArrayList<>();
    private int raza;

    public ArrayList<EdificioRecurso> getEdificacionRecurso() {
        return edificacionRecurso;
    }

    public ArrayList<EdificioEntrenamiento> getEdificioEntrenamiento() {
        return edificioEntrenamiento;
    }

    public ArrayList<EdificioVehiculo> getEdificioVehiculo() {
        return edificioVehiculo;
    }    

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public ArrayList<EdificioCentroMando> getEdificioCentroMando() {
        return edificioCentroMando;
    }
}
