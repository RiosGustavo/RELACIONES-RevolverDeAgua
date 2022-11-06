/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recejer2;

/**
 *
 * @author User
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    

/////// HACER ESTO EN UNA CLASE SERVICIO
    public void llenarRevolver() {

        /// llamamos  al metodo Random para hacer un boolena aleatorio
        //// asiganmos los valores aleatorios
        posicionActual = (int) Math.floor(Math.random()* 6  + 1);

        posicionAgua = (int) Math.floor(Math.random()* 6  + 1);

    }

    public boolean mojar() {
        boolean veri = false;

        if (posicionActual == posicionAgua) {
            veri = true; // alguien se va a mojar

        }
        

        return veri;
    }

    public void siguienteChorro() {

        /// como ya se diaparo en la anterior
        // se cambia la posicion del tambor del revolver a la siguiente posicion
        if (posicionActual == 6) {/// si llega a la posicion 6 
            posicionActual = 1; //// debe volver a la posicion inicial osea la 1
        } else {
            posicionActual++;
        }

    }

    @Override
    public String toString() {
        return "Posicion de la bala De Agua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}
