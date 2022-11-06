/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recejer2;

/**
 *
 * @author User
 */
public class Jugador {

    private int ID;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int ID) {
        this.ID = ID;
        this.nombre = "JUGADOR" + ID;
        this.mojado = false;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

  

    public boolean disparo(RevolverDeAgua disparar) {
       boolean veri =false;
        System.out.println("EL "+nombre+" SE Dispara ");
        if (disparar.mojar()) {
            mojado = true; /// se mojo
            veri = true;

       //     System.out.println(getNombre() + "jugador mojado");
        } 
            disparar.siguienteChorro();
      //      System.out.println(getNombre() + "Jugador se libro esta seco");
          
        
      return veri;
    }
    
      @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

}
