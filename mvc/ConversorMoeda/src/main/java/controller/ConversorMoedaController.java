package controller;

import model.ConversorMoeda;

public class ConversorMoedaController {
    public double calcularResultado(double valor, String moedaOrigem, String moedaDestino) {
        ConversorMoeda conversor = new ConversorMoeda();
        return conversor.converterMoeda(valor, moedaOrigem, moedaDestino);
    }
}

