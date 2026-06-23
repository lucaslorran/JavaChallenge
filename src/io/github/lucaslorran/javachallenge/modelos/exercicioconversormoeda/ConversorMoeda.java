package io.github.lucaslorran.javachallenge.modelos.exercicioconversormoeda;

public class ConversorMoeda implements ConversaoFinanceira {

    double COTACAO_DOLAR = 5.19;

    @Override
    public void converterDolarParaReal(double valorDolar){
        double valorReal = COTACAO_DOLAR * valorDolar;
        System.out.println(valorReal);
    }
}
