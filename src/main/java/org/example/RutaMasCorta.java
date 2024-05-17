package org.example;

public class RutaMasCorta implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return String.format("linea recta entre %s a %s",puntoA, puntoB);
    }
}
