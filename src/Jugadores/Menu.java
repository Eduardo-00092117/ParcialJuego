package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import java.util.*;

public class Menu {

    public void menuEleccion() {
        Jugador1 jugador1 = Jugador1.getInstance();
        Jugador2 jugador2 = Jugador2.getInstance();
        Partida partida = Partida.getInstance();
        Scanner leer = new Scanner(System.in);
        int raza;
        System.out.println("---------------------------------");
        System.out.println("----------- Jugador 1 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador1.setRaza(raza);
        jugador1.guardarCentroMando();

        System.out.println("---------------------------------");
        System.out.println("----------- Jugador 2 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador2.setRaza(raza);
        jugador2.guardarCentroMando();
    }

    public void menuEdificacionesJugador1() {
        int opc = 0;
        while (opc != 7) {
            Jugador1 jugador1 = Jugador1.getInstance();
            Scanner leer = new Scanner(System.in);
            System.out.println("\n1- Agregar edificación recurso 1");
            System.out.println("2- Agregar edificación recurso 2");
            System.out.println("3- Agregar edificación recurso 3");
            System.out.println("4- Agregar edificación de entrenamiento");
            System.out.println("5- Agregar edificacion de vehiculo tipo 1");
            System.out.println("6- Agregar edificacion de vehiculo tipo 2");
            System.out.println("7- Regresar");
            System.out.print("Opción: ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    jugador1.guardarEdificiosRecursos(opc);
                    break;
                case 2:
                    jugador1.guardarEdificiosRecursos(opc);
                    break;
                case 3:
                    jugador1.guardarEdificiosRecursos(opc);
                    break;
                case 4:
                    jugador1.guardarEdificioEntrenamiento();
                    break;
                case 5:
                    jugador1.guardarEdificioVehiculo(opc);
                    break;
                case 6:
                    jugador1.guardarEdificioVehiculo(opc);
                    break;
                case 7:
                    menuCompletoJugador1();
                    break;
            }
        }
        /*for (int i = 0; i < jugador1.getEdificioVehiculo().size(); i++) {
            System.out.println(jugador1.getEdificioVehiculo().get(i).getNombre() + " - " + jugador1.getEdificioVehiculo().get(i).getRaza());
        }
        for (int i = 0; i < jugador1.getEdificacionRecurso().size(); i++) {
            System.out.println(jugador1.getEdificacionRecurso().get(i).getNombre() + " - " + jugador1.getEdificacionRecurso().get(i).getRaza());
        }*/
    }

    public void menuEdificacionesJugador2() {
        int opc = 0;
        while (opc != 7) {
            Jugador2 jugador2 = Jugador2.getInstance();
            Scanner leer = new Scanner(System.in);
            System.out.println("\n1- Agregar edificación recurso 1");
            System.out.println("2- Agregar edificación recurso 2");
            System.out.println("3- Agregar edificación recurso 3");
            System.out.println("4- Agregar edificación de entrenamiento");
            System.out.println("5- Agregar edificacion de vehiculo tipo 1");
            System.out.println("6- Agregar edificacion de vehiculo tipo 2");
            System.out.println("7- Salir");
            System.out.print("Opción: ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    jugador2.guardarEdificiosRecursos(opc);
                    break;
                case 2:
                    jugador2.guardarEdificiosRecursos(opc);
                    break;
                case 3:
                    jugador2.guardarEdificiosRecursos(opc);
                    break;
                case 4:
                    jugador2.guardarEdificioEntrenamiento();
                    break;
                case 5:
                    jugador2.guardarEdificioVehiculo(opc);
                    break;
                case 6:
                    jugador2.guardarEdificioVehiculo(opc);
                    break;
                case 7:
                    menuCompletoJugador2();
                    break;
            }
        }
        /*for (int i = 0; i < jugador2.getEdificioVehiculo().size(); i++) {
            System.out.println(jugador2.getEdificioVehiculo().get(i).getNombre() + " - " + jugador2.getEdificioVehiculo().get(i).getRaza());
        }
        for (int i = 0; i < jugador2.getEdificacionRecurso().size(); i++) {
            System.out.println(jugador2.getEdificacionRecurso().get(i).getNombre() + " - " + jugador2.getEdificacionRecurso().get(i).getRaza());
        }*/
    }

    public void menuCompletoJugador1() {
        int opc;
        Jugador1 jugador1 = Jugador1.getInstance();
        Scanner leer = new Scanner(System.in);
        System.out.println("\n---------------------------------");
        System.out.println("----------- Jugador 1 -----------");
        System.out.println("---------------------------------\n");
        System.out.println("1- Crear Edificios");
        System.out.println("2- Entrenar Milicia");
        System.out.println("3- Atacar");
        System.out.println("4- Agregar milicia/especialista");
        System.out.println("5- Recolectar Recursos");
        System.out.println("6- Ver información de los recursos disponibles");
        System.out.println("7- Terminar turno");
        System.out.print("Opción: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menuEdificacionesJugador1();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                menuCompletoJugador2();
                break;
        }
    }

    public void menuCompletoJugador2() {
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("\n---------------------------------");
        System.out.println("----------- Jugador 2 -----------");
        System.out.println("---------------------------------\n");
        System.out.println("1- Crear Edificios");
        System.out.println("2- Entrenar Milicia");
        System.out.println("3- Atacar");
        System.out.println("4- Agregar milicia/especialista");
        System.out.println("5- Recolectar Recursos");
        System.out.println("6- Ver información de los recursos disponibles");
        System.out.println("7- Terminar turno");
        System.out.print("Opción: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menuEdificacionesJugador2();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                menuCompletoJugador1();
                break;
        }

    }
}
