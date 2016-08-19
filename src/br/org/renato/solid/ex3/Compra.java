package br.org.renato.solid.ex3;

public class Compra {
    private double valor;
    private String cidade;

    public Compra(double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }

    public double getValor() {
        return this.valor;
    }

    public String getCidade() {
        return this.cidade;
    }

}