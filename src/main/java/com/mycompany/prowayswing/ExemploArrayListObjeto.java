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
public class ExemploArrayListObjeto {

    public void exemploArrayListProdutos() {
        var produtos = new ArrayList<Produto>();

        var produtoXbox = new Produto();

        produtoXbox.nome = "Xbox";
        produtoXbox.quantidade = 2;
        produtoXbox.precoUnitario = 2390.20;

        produtos.add(produtoXbox);

        var produtosPS5 = new Produto();

        produtosPS5.nome = "PS5";
        produtosPS5.precoUnitario = 3030.00;
        produtosPS5.quantidade = 1;

        produtos.add(produtosPS5);

        var primeiroProduto = produtos.get(0);
        JOptionPane.showMessageDialog(null, primeiroProduto.nome);

    }
    
    

    public static void main(String[] args) {
        new ExemploArrayListObjeto().exemploArrayListProdutos();
    }
}
