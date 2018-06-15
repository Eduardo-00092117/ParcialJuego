
package Milicia;

import java.util.*;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class Milicias implements MiliciaPlan{
    public String tipoNombre, tipoRaza;
    public int tiempo, vida, ataque, recurso1, recurso2, costo1, costo2;
    public int entrenamiento;
    
    public ArrayList<Milicias> milicia = new ArrayList<>();

    @Override
    public void setTipoNombre(String tipo) {
        this.tipoNombre = tipo;
    }

    @Override
    public void setTipoRaza(String raza) {
        this.tipoRaza = raza;
    }

    @Override
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
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
    public String getTipoNombre() {
        return this.tipoNombre;
    }

    @Override
    public String getTipoRaza() {
        return this.tipoRaza;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getAtaque() {
        return this.ataque;
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
