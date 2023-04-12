package com.joaorezende.controllers;

import com.joaorezende.models.Produto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProdutoController {
    @FXML
    TableView<Produto> tbProdutos;
    @FXML
    TableColumn<String, String> colCodBarras;
    @FXML
    TableColumn<String, String> colDescricao;
    @FXML
    Button btnAdicionar;
    @FXML
    TextField txtDescricao;
    @FXML
    TextField txtMarca;
    @FXML
    TextField txtCodBarras;
    @FXML
    ObservableList<Produto> produtos;

    @FXML
    public void initialize() {
        colCodBarras.setCellValueFactory(new PropertyValueFactory<>("codBarras"));
        colDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));

        produtos = FXCollections.observableArrayList();

        produtos.add(new Produto(1, "Biscoito Recheado Passatempo", "Nestlé", "7891000051351"));
        produtos.add(new Produto(2, "Biscoito Recheado Bono Chocolate", "Nestlé", "7891000305232"));
        produtos.add(new Produto(3, "Biscoito Recheado Sabor Chocolate", "Bauducco", "7891962008387"));

        tbProdutos.setItems(produtos);

        tbProdutos.getSelectionModel().selectedItemProperty()
                .addListener((valorObservavel, produtoAnterior, produtoSelecionado) -> {
                    if (produtoSelecionado != null) {
                        exibirProduto(produtoSelecionado);
                    }
                });
    }

    private void exibirProduto(Produto produto) {
        txtDescricao.setText(produto.getDescricao());
        txtMarca.setText(produto.getMarca());
        txtCodBarras.setText(produto.getCodBarras());
    }

    @FXML
    private void handleExcluirProduto() {
        int indiceSelecionado = tbProdutos.getSelectionModel().getSelectedIndex();
        produtos.remove(indiceSelecionado);
    }

    @FXML
    private void handleAlterarProduto() {
        int indiceSelecionado = tbProdutos.getSelectionModel().getSelectedIndex();
        Produto produto = produtos.get(indiceSelecionado);

        produto.setDescricao(txtDescricao.getText());
        produto.setMarca(txtMarca.getText());
        produto.setCodBarras(txtCodBarras.getText());

        produtos.set(indiceSelecionado, produto);

        txtDescricao.setText("");
        txtMarca.setText("");
        txtCodBarras.setText("");
    }

    @FXML
    private void handleAdicionarProduto() {
        String descricao = txtDescricao.getText();
        String marca = txtMarca.getText();
        String codBarras = txtCodBarras.getText();
        Produto produto = new Produto(descricao, marca, codBarras);

        produtos.add(produto);

        txtDescricao.setText("");
        txtMarca.setText("");
        txtCodBarras.setText("");
    }
}
