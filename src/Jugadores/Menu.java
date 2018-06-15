package Jugadores;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
import RazaBallas.FactoryBallasVehiculo;
import RazaFamilies.FactoryFamiliesVehiculo;
import RazaVagos.FactoryVagosVehiculo;
import java.util.*;

public class Menu {
    
    public static Jugador jugador1 = new Jugador();
    public static Jugador jugador2 = new Jugador(); 
    
    public void menuEleccion() {
        Scanner leer = new Scanner(System.in);
        int raza;
        String nombre;
        System.out.println("---------------------------------");
        System.out.println("----------- Jugador1 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Nombre: ");
        nombre = leer.next();
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador1.setRaza(raza);
        jugador1.guardarCentroMando(jugador1);
        jugador1.setNombre(nombre);

        System.out.println("\n---------------------------------");
        System.out.println("----------- Jugador 2 -----------");
        System.out.println("---------------------------------\n");
        System.out.print("Nombre: ");
        nombre = leer.next();
        System.out.print("Que raza desea seleccionar (1- Ballas, 2- Families, 3-Vagos): ");
        raza = leer.nextInt();
        jugador2.setRaza(raza);
        jugador2.guardarCentroMando(jugador2);
        jugador2.setNombre(nombre);
    }

    public void menuEdificaciones(Jugador jugador) {
        int opc = 0;
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
    
    public void menuMilicia(Jugador jugador){
        int opc2;
        Jugador ju = new Jugador();
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Que desea entrenar?");
        System.out.println("1- Soldado");
        System.out.println("2- Especialista");
        System.out.print("Opcion: ");
        opc2 = leer.nextInt();
        ju.guardarMilicia(opc2, jugador);
    }
    
    public void menuVehiculo(Jugador jugador){
        FactoryBallasVehiculo ballas = new FactoryBallasVehiculo();
        FactoryVagosVehiculo vagos = new FactoryVagosVehiculo();
        FactoryFamiliesVehiculo families = new FactoryFamiliesVehiculo();
        int opc2;
        Jugador ju = new Jugador();
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Que desea crear de vehiculo?");
        switch(jugador.getRaza()){
            case 1://ballas
                ballas.getBallasVehiculo(1).crearVehiculos();
                ballas.getBallasVehiculo(2).crearVehiculos();
                System.out.println("1 - "+ballas.getBallasVehiculo(1).getInstance().getTipoNombre());
                System.out.println("2 - "+ballas.getBallasVehiculo(2).getInstance().getTipoNombre());
                break;
            case 2://families
                families.getFamiliesVehiculo(1).crearVehiculos();
                families.getFamiliesVehiculo(2).crearVehiculos();
                System.out.println("1 - "+families.getFamiliesVehiculo(1).getInstance().getTipoNombre());
                System.out.println("2 - "+families.getFamiliesVehiculo(2).getInstance().getTipoNombre());
                break;
            case 3://vagos
                vagos.getVagosVehiculo(1).crearVehiculos();
                vagos.getVagosVehiculo(2).crearVehiculos();
                System.out.println("1 - "+vagos.getVagosVehiculo(1).getInstance().getTipoNombre());
                System.out.println("2 - "+vagos.getVagosVehiculo(2).getInstance().getTipoNombre());
                break;
        }
        System.out.print("Opcion: ");
        opc2 = leer.nextInt();
        ju.guardarVehiculo(opc2, jugador);
    }
    
    public int fase = 1;
    
    public void menuCompletoJugador1(Jugador j) {
        int opc;
        Jugador ju = new Jugador();
        Scanner leer = new Scanner(System.in);
        System.out.println("\n---------------------------------");
        System.out.println("----------- "+j.getNombre()+" -----------");
        System.out.println("---------------------------------\n");
        System.out.println("1- Crear Edificios");
        System.out.println("2- Ver estado de edificaciones");
        System.out.println("3- Entrenar Milicia");
        System.out.println("4- Ver estado de tropas/milicia");
        System.out.println("5- Atacar/Defender");
        System.out.println("6- Agregar vehiculo");
        System.out.println("7- Recolectar Recursos");
        System.out.println("8- Ver información de los recursos disponibles");
        System.out.println("9- Terminar turno");
        System.out.print("Opción: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menuEdificaciones(j);
                menuCompletoJugador1(j);
                break;
            case 2:
                ju.mostrarEdificaciones(j);
                menuCompletoJugador1(j);
                break;
            case 3:
                if(j.getEdificioEntrenamiento().size() > 0 && j.getMilicia().size() <= 10*(j.getEdificioEntrenamiento().size())){
                    boolean bandera = false;
                    for(int i=0; i < j.getEdificioEntrenamiento().size(); i++){
                        if(j.getEdificioEntrenamiento().get(i).getTiempo() == 0){
                            bandera = true;
                        }
                    }
                    if(bandera == true){
                        menuMilicia(j);
                    }else{
                        System.out.println("\nNo se ha creado aun ningun edificio de entrenamiento");
                    }
                }else{
                    System.out.println("\nNo se pueden crear tropas sin el edificio de entrenamiento");
                }
                menuCompletoJugador1(j);
                break;
            case 4:
                ju.mostrarMiliciaVehiculo(j);
                menuCompletoJugador1(j);
                break;
            case 5:
                break;
            case 6:
                if(j.getEdificioVehiculo().size() > 0 && j.getVehiculo().size() <= 10*(j.getEdificioVehiculo().size())){
                    menuVehiculo(j);
                }else{
                    System.out.println("\nNo se pueden crear vehiculos sin el edificio de creacion");
                }
                menuCompletoJugador1(j);
                break;
            case 7:
                ju.recolectarRecursos(j);
                menuCompletoJugador1(j);
                break;
            case 8:
                ju.mostrarRecursos(j);
                menuCompletoJugador1(j);
            case 9:
                if(jugador1 == j){
                    menuCompletoJugador1(jugador2);
                }else{
                    System.out.println("\n/////////////////FASE "+fase+"//////////////////////");
                    fase++;
                    ju.generarRecursos(jugador1);
                    ju.generarRecursos(jugador2);
                    ju.crearEdificiosFases(jugador1);
                    ju.crearEdificiosFases(jugador2);
                    menuCompletoJugador1(jugador1);
                }
                break;
        }
    }
    
    public void turnos(){
        menuCompletoJugador1(jugador1);        
    }
}
