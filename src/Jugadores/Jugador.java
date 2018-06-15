package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import RazaFamilies.*;
import RazaVagos.*;
import RazaBallas.*;
import EdificacionEntrenamiento.*;
import EdificacionRecurso.*;
import EdificacionVehiculo.*;
import EdificacionCentroMando.EdificioCentroMando;
import Milicia.Milicias;
import Vehiculos.Vehiculos;
import java.util.*;

public class Jugador {

    private ArrayList<EdificioRecurso> edificacionRecurso = new ArrayList<>();
    private ArrayList<EdificioEntrenamiento> edificioEntrenamiento = new ArrayList<>();
    private ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();
    private ArrayList<EdificioCentroMando> edificioCentroMando = new ArrayList<>();
    private ArrayList<Milicias> milicia = new ArrayList<>();
    private ArrayList<Vehiculos> vehiculo = new ArrayList<>();

    private int raza;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre1) {
        this.nombre = nombre1;
    }

    public ArrayList<EdificioCentroMando> getEdificioCentroMando() {
        return edificioCentroMando;
    }

    public ArrayList<Milicias> getMilicia() {
        return milicia;
    }

    public ArrayList<Vehiculos> getVehiculo() {
        return vehiculo;
    }

    public void guardarEdificiosRecursos(int edificio, Jugador jugador) {
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch (jugador.getRaza()) {
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

    public void guardarCentroMando(Jugador jugador) {
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch (jugador.getRaza()) {
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

    public void guardarEdificioEntrenamiento(Jugador jugador) {
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch (jugador.getRaza()) {
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

    public void guardarEdificioVehiculo(int edificio, Jugador jugador) {
        FactoryBallasEdificaciones ballas = new FactoryBallasEdificaciones();
        FactoryVagosEdificaciones vagos = new FactoryVagosEdificaciones();
        FactoryFamiliesEdificaciones families = new FactoryFamiliesEdificaciones();
        switch (jugador.getRaza()) {
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

    public void guardarMilicia(int tipoSoldado, Jugador jugador) {
        FactoryBallasMilicia ballas = new FactoryBallasMilicia();
        FactoryVagosMilicia vagos = new FactoryVagosMilicia();
        FactoryFamiliesMilicia families = new FactoryFamiliesMilicia();
        switch (jugador.getRaza()) {
            case 1://ballas
                ballas.getBallasMilicia(tipoSoldado).crearMilicia();
                Milicias edificio1 = ballas.getBallasMilicia(tipoSoldado).getInstance();
                jugador.getMilicia().add(edificio1);
                break;
            case 2://Families
                families.getFamiliesMilicia(tipoSoldado).crearMilicia();
                Milicias edificio2 = families.getFamiliesMilicia(tipoSoldado).getInstance();
                jugador.getMilicia().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagosMilicia(tipoSoldado).crearMilicia();
                Milicias edificio3 = vagos.getVagosMilicia(tipoSoldado).getInstance();
                jugador.getMilicia().add(edificio3);
                break;
        }
    }

    public void guardarVehiculo(int tipoVehiculo, Jugador jugador) {
        FactoryBallasVehiculo ballas = new FactoryBallasVehiculo();
        FactoryVagosVehiculo vagos = new FactoryVagosVehiculo();
        FactoryFamiliesVehiculo families = new FactoryFamiliesVehiculo();
        switch (jugador.getRaza()) {
            case 1://ballas
                ballas.getBallasVehiculo(tipoVehiculo).crearVehiculos();
                Vehiculos edificio1 = ballas.getBallasVehiculo(tipoVehiculo).getInstance();
                jugador.getVehiculo().add(edificio1);
                break;
            case 2://Families
                families.getFamiliesVehiculo(tipoVehiculo).crearVehiculos();
                Vehiculos edificio2 = families.getFamiliesVehiculo(tipoVehiculo).getInstance();
                jugador.getVehiculo().add(edificio2);
                break;
            case 3://Vagos
                vagos.getVagosVehiculo(tipoVehiculo).crearVehiculos();
                Vehiculos edificio3 = vagos.getVagosVehiculo(tipoVehiculo).getInstance();
                jugador.getVehiculo().add(edificio3);
                break;
        }
    }

    public void mostrarEdificaciones(Jugador jugador) {
        System.out.println("");
        if (jugador.getEdificioCentroMando().size() > 0) {
            System.out.println("////////////////// Centro de Mando //////////////////");
            System.out.println("Nombre: " + jugador.getEdificioCentroMando().get(0).getNombre());
            System.out.println("Monto de recurso 1: " + jugador.getEdificioCentroMando().get(0).getMontoRecurso()[0]);
            System.out.println("Monto de recurso 2: " + jugador.getEdificioCentroMando().get(0).getMontoRecurso()[1]);
            System.out.println("Monto de recurso 3: " + jugador.getEdificioCentroMando().get(0).getMontoRecurso()[2]);
            System.out.println("Vida: " + jugador.getEdificioCentroMando().get(0).getVida());
        }

        if (jugador.getEdificacionRecurso().size() > 0) {
            System.out.println("////////////////// Recursos //////////////////");
            for (int i = 0; i < jugador.getEdificacionRecurso().size(); i++) {
                if (jugador.getEdificacionRecurso().get(i).getTiempo() == 0) {
                    System.out.println("Nombre: " + jugador.getEdificacionRecurso().get(i).getNombre());
                    System.out.println("Vida: " + jugador.getEdificacionRecurso().get(i).getVida());
                    System.out.println("Monto Actual: " + jugador.getEdificacionRecurso().get(i).getMontoActual());
                    System.out.println("Recurso: " + jugador.getEdificacionRecurso().get(i).getCosto1()[0]);
                    System.out.println("Recurso: " + jugador.getEdificacionRecurso().get(i).getCosto1()[1]);
                }
            }
        }

        if (jugador.getEdificioEntrenamiento().size() > 0) {
            System.out.println("////////////////// Centro de entrenamiento //////////////////");
            for (int i = 0; i < jugador.getEdificioEntrenamiento().size(); i++) {
                if (jugador.getEdificioEntrenamiento().get(i).getTiempo() == 0) {
                    System.out.println(jugador.getEdificioEntrenamiento().get(i).getNombre());
                    System.out.println(jugador.getEdificioEntrenamiento().get(i).getVida());
                }
            }
        }

        if (jugador.getEdificioVehiculo().size() > 0) {
            System.out.println("////////////////// Centro de creacion de vehiculos //////////////////");
            for (int i = 0; i < jugador.getEdificioVehiculo().size(); i++) {
                if (jugador.getEdificioVehiculo().get(i).getTiempo() == 0) {
                    System.out.println(jugador.getEdificioVehiculo().get(i).getNombre());
                    System.out.println(jugador.getEdificioVehiculo().get(i).getVida());
                }
            }
        }

    }

    public void mostrarMiliciaVehiculo(Jugador jugador) {
        System.out.println("");
        System.out.println("////////////////////Tropas/////////////////////");
        for (int j = 0; j < jugador.getMilicia().size(); j++) {
            if (jugador.getMilicia().get(j).getTiempo() == 0) {
                System.out.println((j + 1) + " - " + jugador.getMilicia().get(j).getTipoNombre());
                System.out.println("Vida: " + jugador.getMilicia().get(j).getVida());
                System.out.println("Ataque: " + jugador.getMilicia().get(j).getAtaque());
            }
        }
        System.out.println("////////////////////////////////////////////////");
        System.out.println("//////////////////////Vehiculos///////////////////");
        for (int j = 0; j < jugador.getVehiculo().size(); j++) {
            if (jugador.getVehiculo().get(j).getTiempo() == 0) {
                System.out.println((j + 1) + " - " + jugador.getVehiculo().get(j).getTipoNombre());
                System.out.println("Vida: " + jugador.getVehiculo().get(j).getVida());
                System.out.println("Ataque: " + jugador.getVehiculo().get(j).getAtaque());
            }

        }
        System.out.println("///////////////////////////////////////////////////");

    }

    public void crearEdificiosFases(Jugador jugador) {
        for (int i = 0; i < jugador.getEdificacionRecurso().size(); i++) {
            int num = jugador.getEdificacionRecurso().get(i).getTiempo();
            if (jugador.getEdificacionRecurso().get(i).getTiempo() != 0) {
                jugador.getEdificacionRecurso().get(i).setTiempo(num - 1);
                if (jugador.getEdificacionRecurso().get(i).getTiempo() == 0) {
                    System.out.println("");
                    System.out.println("Edificio creado: " + jugador.getEdificacionRecurso().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getEdificioEntrenamiento().size(); i++) {
            int num = jugador.getEdificioEntrenamiento().get(i).getTiempo();
            if (jugador.getEdificioEntrenamiento().get(i).getTiempo() != 0) {
                jugador.getEdificioEntrenamiento().get(i).setTiempo(num - 1);
                if (jugador.getEdificioEntrenamiento().get(i).getTiempo() == 0) {
                    System.out.println("Edificio creado: " + jugador.getEdificioEntrenamiento().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getEdificioVehiculo().size(); i++) {
            int num = jugador.getEdificioVehiculo().get(i).getTiempo();
            if (jugador.getEdificioVehiculo().get(i).getTiempo() != 0) {
                jugador.getEdificioVehiculo().get(i).setTiempo(num - 1);
                if (jugador.getEdificioVehiculo().get(i).getTiempo() == 0) {
                    System.out.println("Edificio creado: " + jugador.getEdificioVehiculo().get(i).getNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getMilicia().size(); i++) {
            int num = jugador.getMilicia().get(i).getTiempo();
            if (jugador.getMilicia().get(i).getTiempo() != 0) {
                jugador.getMilicia().get(i).setTiempo(num - 1);
                if (jugador.getMilicia().get(i).getTiempo() == 0) {
                    System.out.println("Milicia creada: " + jugador.getMilicia().get(i).getTipoNombre());
                }
            }
        }
        for (int i = 0; i < jugador.getVehiculo().size(); i++) {
            int num = jugador.getVehiculo().get(i).getTiempo();
            if (jugador.getVehiculo().get(i).getTiempo() != 0) {
                jugador.getVehiculo().get(i).setTiempo(num - 1);
                if (jugador.getVehiculo().get(i).getTiempo() == 0) {
                    System.out.println("Vehiculo creado: " + jugador.getVehiculo().get(i).getTipoNombre());
                }
            }
        }
    }

    public void generarRecursos(Jugador jugador) {
        int cant1;
        for (int i = 0; i < jugador.getEdificacionRecurso().size(); i++) {
            if (jugador.getEdificacionRecurso().get(i).getTiempo() == 0) {
                cant1 = jugador.getEdificacionRecurso().get(i).getMontoActual() + 1000;
                if (cant1 <= jugador.getEdificacionRecurso().get(i).getCapacidad()) {
                    jugador.getEdificacionRecurso().get(i).setMontoActual(cant1);
                }
            }
        }
    }

    public void recolectarRecursos(Jugador jugador) {
        int cant1, cant2, cant3;
        cant1 = jugador.getEdificioCentroMando().get(0).getMontoRecurso()[0];
        cant2 = jugador.getEdificioCentroMando().get(0).getMontoRecurso()[1];
        cant3 = jugador.getEdificioCentroMando().get(0).getMontoRecurso()[2];
        for (int i = 0; i < jugador.getEdificacionRecurso().size(); i++) {
            if (jugador.getEdificacionRecurso().get(i).getCapacidad() == 10000) {
                cant1 = jugador.getEdificioCentroMando().get(0).getMontoRecurso()[0] + jugador.getEdificacionRecurso().get(i).getMontoActual();
            }
            if (jugador.getEdificacionRecurso().get(i).getCapacidad() == 5000) {
                cant2 = jugador.getEdificioCentroMando().get(0).getMontoRecurso()[1] + jugador.getEdificacionRecurso().get(i).getMontoActual();
            }
            if (jugador.getEdificacionRecurso().get(i).getCapacidad() == 3000) {
                cant3 = jugador.getEdificioCentroMando().get(0).getMontoRecurso()[2] + jugador.getEdificacionRecurso().get(i).getMontoActual();
            }
            jugador.getEdificioCentroMando().get(0).setMontoRecurso(cant1, cant2, cant3);
            jugador.getEdificacionRecurso().get(i).setMontoActual(0);
        }
    }
}
