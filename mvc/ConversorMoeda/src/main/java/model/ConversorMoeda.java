package model;

import java.util.HashMap;
import java.util.Map;

public class ConversorMoeda {
    private static final Map<String, Double> TAXAS_DE_CAMBIO = new HashMap<>();

    static {
        TAXAS_DE_CAMBIO.put("USD", 1.0);  // Dólar Americano
        TAXAS_DE_CAMBIO.put("EUR", 0.85); // Euro
        TAXAS_DE_CAMBIO.put("JPY", 110.31); // Iene
        TAXAS_DE_CAMBIO.put("GBP", 0.75); // Libra Esterlina
    }

    public double converterMoeda(double valor, String moedaOrigem, String moedaDestino) {
        if (!TAXAS_DE_CAMBIO.containsKey(moedaOrigem) || !TAXAS_DE_CAMBIO.containsKey(moedaDestino)) {
            throw new IllegalArgumentException("Moeda não suportada.");
        }

        double taxaOrigem = TAXAS_DE_CAMBIO.get(moedaOrigem);
        double taxaDestino = TAXAS_DE_CAMBIO.get(moedaDestino);

        // Conversão de moeda
        double valorEmDolar = valor / taxaOrigem;
        double valorConvertido = valorEmDolar * taxaDestino;

        return valorConvertido;
    }
}
