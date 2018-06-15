package EdificacionRecurso;

import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class EdificioRecurso implements RecursosPlan {

    public String nombre, raza;
    public int capacidad, vida, montoActual, tiempo, recurso1, recurso2, costo1, costo2;

    public ArrayList<EdificioRecurso> edificioRecurso = new ArrayList<>();

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setMontoActual(int montoActual) {
        this.montoActual = montoActual;
    }

    @Override
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getMontoActual() {
        return this.montoActual;
    }

    @Override
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int getCapacidad() {
        return this.capacidad;
    }

    @Override
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }

    @Override
    public void setCosto1(int recurso, int costo) {
        this.recurso1 = recurso;
        this.costo1 = costo;
    }

    @Override
    public void setCosto2(int recurso, int costo) {
        this.recurso2 = recurso;
        this.costo2 = costo;
    }

    @Override
    public int[] getCosto1() {
        int[] costo = new int[2];
        costo[0] = this.recurso1;
        costo[1] = this.costo1;
        return costo;
    }

    @Override
    public int[] getCosto2() {
        int[] costo = new int[2];
        costo[0] = this.recurso2;
        costo[1] = this.costo2;
        return costo;
    }
}
