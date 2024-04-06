/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prowayswing;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 74741
 */
public class ExemploArrayListIterativo {

    private ArrayList<Produto> produtos = new ArrayList<>();

    private int indiceAtual = 1;

    public void apresentarMenu() {

        var botoes = new String[]{"Cadastrar",
            "Editar",
            "Apagar",
            "Listar Todos",
            "Produto Menor Preço",
            "Caluclar Total",
            "Sair"};
        
        
        var menuEscolhido = 0;
        var botaoSairIndice = botoes.length - 1;

        while (menuEscolhido != botaoSairIndice && menuEscolhido != JOptionPane.CLOSED_OPTION) {
            menuEscolhido = JOptionPane.showOptionDialog(null,
                    "Escolha o menu desejado",
                    "Sistema Proway",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botoes,
                    "Cadastrar");
            
                    switch (menuEscolhido) {
                case 0 ->
                    cadastrar();
                case 1 ->
                    editar();
                case 2 ->
                    apagar();
                case 3 ->
                    listar();
                case 4 ->
                    apresentarProdutoMenorPreco();
                case 5 ->
                    calcularTotal();
            }

        }
    }

    public void cadastrar() {
        var produto = new Produto();
        produto.codigo = indiceAtual;
        produto.nome = JOptionPane.showInputDialog("Informe o nome");
        produto.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade"));
        produto.precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço Unitário"));
        indiceAtual += 1;
        produtos.add(produto);
    }

    private void editar() {
        var nomeProdutos = new ArrayList<String>();
        for (int i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            nomeProdutos.add(produto.codigo + " - " + produto.nome);
        }

        var produtoEscolhido = JOptionPane.showInputDialog(null,
                "Escolha o produto a ser alterado",
                "Sistema Proway",
                JOptionPane.WARNING_MESSAGE,
                null,
                nomeProdutos.toArray(),
                "");

        if (produtoEscolhido == null) {
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            if (produtoEscolhido.equals(produto.codigo + " - " + produto.nome)) {
                produto.nome = JOptionPane.showInputDialog(null,
                        "Informe o nome",
                        produto.nome);
                produto.quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe a quantidade",
                        produto.quantidade));
                produto.precoUnitario = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Informe o preço unitário",
                        produto.precoUnitario));

            }
        }
    }

    private void apagar() {

        var nomeProdutos = new ArrayList<String>();
        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            nomeProdutos.add(produto.codigo + " - " + produto.nome);
        }
        var produtoEscolhido = JOptionPane.showInputDialog(null,
                "Escolha o produto a ser apagado",
                "Sistema ProWay",
                JOptionPane.WARNING_MESSAGE,
                null, nomeProdutos.toArray(),
                "");

        if (produtoEscolhido == null) {
            JOptionPane.showMessageDialog(null, "Seus produtos não foram excluídos");
            return;
        }

        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            if (produtoEscolhido.equals(produto.codigo + " - " + produto.nome)) {
                produtos.remove(produto);
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                break;
            }
        }

    }

    private void listar() {
        var texto = "";

        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            texto += "Nome: " + produto.nome
                    + " Quantidade: " + produto.quantidade
                    + " Preço Unitário: " + produto.precoUnitario
                    + " Preço Total: " + produto.calcularPreco() + "\n";

        }
        JOptionPane.showMessageDialog(null, texto);

    }

    public void calcularTotal() {
        var total = 0.0;
        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            total = total + produto.calcularPreco();
        }
        JOptionPane.showMessageDialog(null, "O valor total dos produtos é: " + total);
    }

    private void apresentarProdutoMenorPreco() {
        var nomeProdutoMenorPreco = "";
        var menorPreco = Double.MAX_VALUE;
        for (var i = 0; i < produtos.size(); i++) {
            var produto = produtos.get(i);
            

            if (produto.precoUnitario < menorPreco) {
                menorPreco = produto.precoUnitario;
                nomeProdutoMenorPreco = produto.nome;
            }
        }
        JOptionPane.showMessageDialog(null, "O produto " + nomeProdutoMenorPreco + " possui o menor preço unitário: " + menorPreco);
    

    
    }
    public static void main(String[] args) {
        new ExemploArrayListIterativo().apresentarMenu();
    }
    


}
