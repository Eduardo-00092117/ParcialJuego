package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import java.util.*;

public class Menu {

    public void menuEleccion() {
        Jugador1 jugador1 = Jugador1.getInstance();
        Partida partida = Partida.getInstance();
        Scanner leer = new Scanner(System.in);
        int raza;
        System.out.println("---------------------------------");
        System.out.println("----------- Jugador 1 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador1.setRaza(raza);
    }

    public void menuEdificaciones() {
        int opc;
        Jugador1 jugador1 = Jugador1.getInstance();
        Scanner leer = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("----------- Jugador 1 -----------");
        System.out.println("---------------------------------\n");
        System.out.println("1- Agregar edificación recurso 1");
        System.out.println("2- Agregar edificación recurso 2");
        System.out.println("3- Agregar edificación recurso 3");
        System.out.println("4- Agregar edificación de entrenamiento");
        System.out.println("5- Agregar edificacion de vehiculo tipo 1");
        System.out.println("6- Agregar edificacion de vehiculo tipo 2");
        System.out.print("Opción: ");
        opc = leer.nextInt();
        switch(opc){
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
                break;
            case 5:
                break;
            case 6: 
                break;
        }
        for(int i=0; i < jugador1.getEdificacionRecurso().size(); i++){
            System.out.println(jugador1.getEdificacionRecurso().get(i).getNombre()+" - "+jugador1.getEdificacionRecurso().get(i).getRaza());
        }   
    }
}
