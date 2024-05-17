package org.example;

public class RutaMasRapida implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return String.format("Ruta con menor trafico entre %s a %s",puntoA, puntoB);
    }
}
