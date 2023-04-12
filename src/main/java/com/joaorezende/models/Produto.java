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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getCodBarras() {
        return codBarras;
    }

    @Override
    public String toString() {
        return idProduto + " / " + descricao + " / " + marca + " / " + codBarras;
    }
}
