package org.example;

public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasCorta());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaMasRapida());
        gps.calcularRuta("Punto A", "Punto B");

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Punto A", "Punto B");
    }
}
