package main;

import Jugadores.Menu;
import java.util.Scanner;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("------------------Pasteles Games-----------------");
        System.out.println("-------------------------------------------------");
        System.out.println("1- Iniciar");
        System.out.println("2- Salir");
        System.out.print("Opcion: ");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("");
                menu.menuEleccion();
                menu.turnos();
                break;
        }
    }
}
