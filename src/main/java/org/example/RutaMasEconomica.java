package org.example;

public class RutaMasEconomica implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return String.format("ruta con menor gasto de gasolina de %s a %s",puntoA, puntoB);
    }
}
