
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
import Milicia.Milicias;
import RazaBallas.FactoryBallasMilicia;
import RazaFamilies.FactoryFamiliesMilicia;
import RazaVagos.FactoryVagosMilicia;
import java.util.*;

public class Jugador1 {    
    private ArrayList<EdificioRecurso> edificacionRecurso = new ArrayList<>();
    private ArrayList<EdificioEntrenamiento> edificioEntrenamiento = new ArrayList<>();
    private ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();
    private ArrayList<EdificioCentroMando> edificioCentroMando = new ArrayList<>();
    
    private int raza;
    private int raza2;
    private String nombre;

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

    public int getRaza2() {
        return raza2;
    }

    public void setRaza2(int raza2) {
        this.raza2 = raza2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre1) {
        this.nombre = nombre1;
    }    

    public ArrayList<EdificioCentroMando> getEdificioCentroMando() {
        return edificioCentroMando;
    }
    
    public void guardarEdificiosRecursos(int edificio, Jugador1 jugador){
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
    
    public void guardarCentroMando(Jugador1 jugador){
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
    
    public void guardarEdificioEntrenamiento(Jugador1 jugador){
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
    
    public void guardarEdificioVehiculo(int edificio, Jugador1 jugador){
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
    
    public void guardarMilicia(int edificio, int tipoSoldado, Jugador1 jugador){
        FactoryBallasMilicia ballas = new FactoryBallasMilicia();  
        FactoryVagosMilicia vagos = new FactoryVagosMilicia();   
        FactoryFamiliesMilicia families = new FactoryFamiliesMilicia();
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallasMilicia(tipoSoldado).crearMilicia();
                Milicias edificio1 = ballas.getBallasMilicia(tipoSoldado).getInstance();                
                jugador.getEdificioEntrenamiento().get(edificio).getSoldados().add(edificio1);
                break;
            case 2://Families
                families.getFamiliesMilicia(tipoSoldado).crearMilicia();
                Milicias edificio2 = families.getFamiliesMilicia(tipoSoldado).getInstance();                
                jugador.getEdificioEntrenamiento().get(edificio).getSoldados().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagosMilicia(tipoSoldado).crearMilicia();
                Milicias edificio3 = families.getFamiliesMilicia(tipoSoldado).getInstance();                
                jugador.getEdificioEntrenamiento().get(edificio).getSoldados().add(edificio3);
                break;
        }
    }
}
