package com.exemplo.calculaimc.model;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private String classificacao;
    private String mensagem;
    private String apoio;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public String getClassificacao() { return classificacao; }
    public void setClassificacao(String classificacao) { this.classificacao = classificacao; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public String getApoio() { return apoio; }
    public void setApoio(String apoio) { this.apoio = apoio; }
}