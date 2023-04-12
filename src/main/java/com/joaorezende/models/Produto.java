package com.joaorezende.models;

public class Produto {
    private Integer idProduto;
    private String descricao;
    private String marca;
    private String codBarras;

    public Produto(String descricao, String marca, String codBarras) {
        this.descricao = descricao;
        this.marca = marca;
        this.codBarras = codBarras;
    }

    public Produto(Integer idProduto, String descricao, String marca, String codBarras) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.marca = marca;
        this.codBarras = codBarras;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getCodBarras() {
        return codBarras;
    }

    @Override
    public String toString() {
        return idProduto + " / " + descricao + " / " + marca + " / " + codBarras;
    }
}
