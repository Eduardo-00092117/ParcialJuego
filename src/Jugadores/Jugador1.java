
package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import EdificacionEntrenamiento.*;
import EdificacionRecurso.*;
import EdificacionVehiculo.*;
import Ballas.*;
import Vagos.*;
import Families.*;
import java.util.*;

public class Jugador1 {
    private static Jugador1 jugador = new Jugador1();
    public static Jugador1 getInstance(){
        if(jugador == null){
            jugador = new Jugador1();
        }
        return jugador;
    }
    
    private ArrayList<EdificioRecurso> edificacionRecurso = new ArrayList<>();
    private ArrayList<EdificioEntrenamiento> edificioEntrenamiento = new ArrayList<>();
    private ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();
    private ArrayList<EdificioVehiculo> edificioCentroMando = new ArrayList<>();
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
    
    public void guardarEdificiosRecursos(int edificio){
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();  
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();   
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        ArrayList<EdificioRecurso> aux = new ArrayList<>();
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallas(edificio).crearEdificacionRecursos();
                EdificioRecurso edificio1 = ballas.getBallas(edificio).getInstance();
                edificio1.edificioRecurso.add(edificio1);
                jugador.getEdificacionRecurso().add(edificio1);
                break;
            case 2://Families
                families.getFamilies(edificio).crearEdificacionRecursos();
                EdificioRecurso edificio2 = families.getFamilies(edificio).getInstance();
                jugador.getEdificacionRecurso().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagos(edificio).crearEdificacionRecursos();
                EdificioRecurso edificio3 = vagos.getVagos(edificio).getInstance();
                edificio3.edificioRecurso.add(edificio3);
                jugador.getEdificacionRecurso().add(edificio3);
                break;
        }
    }
}
