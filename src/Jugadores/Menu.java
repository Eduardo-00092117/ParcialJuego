package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import java.util.*;

public class Menu {
    
    public static Jugador1 jugador1 = new Jugador1();
    public static Jugador1 jugador2 = new Jugador1(); 
    
    public void menuEleccion() {
        Scanner leer = new Scanner(System.in);
        int raza;
        System.out.println("---------------------------------");
        System.out.println("----------- Jugador1 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador1.setRaza(raza);
        jugador1.guardarCentroMando(jugador1);
        jugador1.setNombre("Eduardo");

        System.out.println("---------------------------------");
        System.out.println("----------- Jugador 2 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador2.setRaza(raza);
        jugador2.guardarCentroMando(jugador2);
        jugador2.setNombre("Robert");
    }

    public void menuEdificaciones(Jugador1 jugador) {
        int opc = 0;
        while (opc != 7) {
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
                    jugador.guardarEdificiosRecursos(opc, jugador);
                    break;
                case 2:
                    jugador.guardarEdificiosRecursos(opc, jugador);
                    break;
                case 3:
                    jugador.guardarEdificiosRecursos(opc, jugador);
                    break;
                case 4:
                    jugador.guardarEdificioEntrenamiento(jugador);
                    break;
                case 5:
                    jugador.guardarEdificioVehiculo(opc, jugador);
                    break;
                case 6:
                    jugador.guardarEdificioVehiculo(opc, jugador);
                    break;
                case 7:
                    menuCompletoJugador1(jugador);
                    break;
            }
        }
        /*for (int i = 0; i < jugador.getEdificioVehiculo().size(); i++) {
            System.out.println(jugador.getEdificioVehiculo().get(i).getNombre() + " - " + jugador.getEdificioVehiculo().get(i).getRaza());
        }
        for (int i = 0; i < jugador.getEdificacionRecurso().size(); i++) {
            System.out.println(jugador.getEdificacionRecurso().get(i).getNombre() + " - " + jugador.getEdificacionRecurso().get(i).getRaza());
        }*/
    }

    public void menuCompletoJugador1(Jugador1 j) {
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("\n---------------------------------");
        System.out.println("----------- "+j.getNombre()+" -----------");
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
                menuEdificaciones(j);
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
                menuCompletoJugador1(jugador2);
                break;
        }
    }
    
    public void turnos(){
        Menu menu = new Menu();
        menu.menuCompletoJugador1(jugador1);
    }
}
