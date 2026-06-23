package io.github.lucaslorran.javachallenge.modelos.exercicioconversormoeda;

public class ConversorMoeda implements ConversaoFinanceira {

    double COTACAO_DOLAR = 5.19;

    @Override
    public void converterDolarParaReal(double valorDolar){
        double valorReal = COTACAO_DOLAR * valorDolar;
        System.out.println(valorReal);
    }
}


/*

/* ************************              Classe principal.

import io.github.lucaslorran.javachallenge.modelos.exercicioconversormoeda.ConversorMoeda;

public class Principal {

    public static void main (String[] args){

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarParaReal(50);

    }

}


* */