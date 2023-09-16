package com.mycompany.projeto;

public class Produto {
    private int id;
    private int Classificacao;
    private String nomeProduto;
    private double precoProduto;

    public Produto() {
    }

    public Produto(int id, int Classificacao, String nomeProduto, double precoProduto) {
        this.id = id;
        this.Classificacao = Classificacao;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(int Classificacao) {
        this.Classificacao = Classificacao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
}

