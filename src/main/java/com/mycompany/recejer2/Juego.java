/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.recejer2;

import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

public class Juego {

    private RevolverDeAgua Revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(RevolverDeAgua Revolver, ArrayList<Jugador> jugadores) {
        this.Revolver = Revolver;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return Revolver;
    }

    public void setRevolver(RevolverDeAgua Revolver) {
        this.Revolver = Revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> j, RevolverDeAgua r) {
        jugadores = j;
        Revolver = r;

    }

    public boolean ronda(int t) {
        boolean juegoContinua = true;
        jugadores.get(t).disparo(Revolver);
        if (jugadores.get(t).isMojado()) {
            juegoContinua = false;
        }
        return juegoContinua;

    }

}
