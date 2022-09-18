package com.jimg.juego;

public class Main {
    public static void main(String[] args) {

        Juego juego = new Juego(4);

        Juego.Contador contadorJuego = juego.new Contador();

        System.out.println("La puntuación de juego al inicio es " + juego.obtenerPuntuacion());

        contadorJuego.incrementarPuntuacion(500);
        System.out.println("La puntuación de juego después de incrementar puntuación es: " + juego.obtenerPuntuacion());

    }
}
