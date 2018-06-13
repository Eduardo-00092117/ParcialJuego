
package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import RazaFamilies.FactoryFamiliesEdificaciones;
import RazaVagos.FactoryVagosEdificaciones;
import RazaBallas.FactoryBallasEdificaciones;
import EdificacionEntrenamiento.*;
import EdificacionRecurso.*;
import EdificacionVehiculo.*;
import EdificacionCentroMando.EdificioCentroMando;
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
    
    public void guardarEdificiosRecursos(int edificio){
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();  
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();   
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallas(edificio).crearEdificacionRecursos();
                EdificioRecurso edificio1 = ballas.getBallas(edificio).getInstance();                
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
                jugador.getEdificacionRecurso().add(edificio3);
                break;
        }
    }
    
    public void guardarCentroMando(){
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();  
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();   
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallas(7).crearCentroMando();
                EdificioCentroMando edificio1 = ballas.getBallas(7).getInstance2();
                jugador.getEdificioCentroMando().add(edificio1);
                break;
            case 2://Families
                families.getFamilies(7).crearCentroMando();
                EdificioCentroMando edificio2 = families.getFamilies(7).getInstance2();
                jugador.getEdificioCentroMando().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagos(7).crearCentroMando();
                EdificioCentroMando edificio3 = vagos.getVagos(7).getInstance2();
                jugador.getEdificioCentroMando().add(edificio3);
                break;
        }
    }
    
    public void guardarEdificioEntrenamiento(){
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();  
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();   
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallas(4).crearEdificacionEntrenamiento();
                EdificioEntrenamiento edificio1 = ballas.getBallas(4).getInstance3();
                jugador.getEdificioEntrenamiento().add(edificio1);
                break;
            case 2://Families
                families.getFamilies(4).crearEdificacionEntrenamiento();
                EdificioEntrenamiento edificio2 = families.getFamilies(4).getInstance3();
                jugador.getEdificioEntrenamiento().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagos(4).crearEdificacionEntrenamiento();
                EdificioEntrenamiento edificio3 = vagos.getVagos(4).getInstance3();
                jugador.getEdificioEntrenamiento().add(edificio3);
                break;
        }
    }
    
    public void guardarEdificioVehiculo(int edificio){
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();  
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();   
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallas(edificio).crearEdificacionVehiculo();
                EdificioVehiculo edificio1 = ballas.getBallas(edificio).getInstance4();                
                jugador.getEdificioVehiculo().add(edificio1);
                break;
            case 2://Families
                families.getFamilies(edificio).crearEdificacionVehiculo();
                EdificioVehiculo edificio2 = families.getFamilies(edificio).getInstance4();
                jugador.getEdificioVehiculo().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagos(edificio).crearEdificacionVehiculo();
                EdificioVehiculo edificio3 = vagos.getVagos(edificio).getInstance4();                
                jugador.getEdificioVehiculo().add(edificio3);
                break;
        }
    }
}
