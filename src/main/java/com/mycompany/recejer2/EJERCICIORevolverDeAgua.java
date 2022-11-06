/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recejer2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class EJERCICIORevolverDeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // partida.llenarJuego();
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        ArrayList<Jugador> jugadores = new ArrayList();

        System.out.println("Bienvenido al Juego de");
        System.out.println("Ruleta Rusa de Agua");

/// verificamos la cantidad maxima de jugadores
        System.out.println("Indique la cantidad de jugadores que desean participar");
        System.out.println("el rango esta entre 1 a 6");
        int cantJugadores = leer.nextInt();

        if (cantJugadores > 6) {
            System.out.println("la cantidad de jugadores supera el limite permitido");
            System.out.println("se seta en 6 por defecto");
            cantJugadores = 6;

        }
        /// creamos los jugadores
        for (int i = 0; i < cantJugadores; i++) {
            Jugador ju = new Jugador(i + 1);
            jugadores.add(ju);

        }

        // se prepara el revolver
        System.out.println("se prepara el revolver");
        RevolverDeAgua re = new RevolverDeAgua();
        re.llenarRevolver();

/// se inicia el juego
        Juego partida = new Juego();
        
        
        
        System.out.println("Se inicia el Juego");
        partida.llenarJuego(jugadores, re);

        boolean juegoContinua = true;
        int turno = 0;

        while (juegoContinua) {
            /// cuando el turno llega a 6 vuele a empezar
            if (turno == cantJugadores) {
                turno = 0;
            }
            System.out.println("El " + partida.getJugadores().get(turno).getNombre() + " se Apunta");
        
            juegoContinua = partida.ronda(turno);
            if (juegoContinua) {
                System.out.println("El " + partida.getJugadores().get(turno).getNombre() + " no se mojo");
            } else {

                System.out.println("El " + partida.getJugadores().get(turno).getNombre() + "  se mojo");
                System.out.println("El Juego ha Terminado");

            }
            turno++;
        }

    }

}
