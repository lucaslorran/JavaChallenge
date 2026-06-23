package io.github.lucaslorran.javachallenge.modelos.exerciciocarro;

public class Carro {

    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double calcularMenorPreco(){
        double menorPreco = precoAno1;

        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }

        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = precoAno1;

        if(precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if(precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

}