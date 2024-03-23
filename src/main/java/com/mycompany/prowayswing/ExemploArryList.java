/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prowayswing;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 74741
 */
public class ExemploArryList {

    public static void main(String[] args) {
        //exemplo01();
        //exemplo02();
        //exercicio01();
        exercicio02();

    }

    private static void exemplo01() throws HeadlessException {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedrinho");

        String primeiroNome = nomes.get(0);
        String segundoNome = nomes.get(1);
        String terceiroNome = nomes.get(2);

        int quantidadeElementos = nomes.size();

        nomes.add("Julhio");

        boolean contemLuiza = nomes.contains("Luiza");

        boolean removeuComSucesso = nomes.remove("Julhio");

        nomes.set(1, "Marua da Silva");

        JOptionPane.showMessageDialog(null,
                "Nome:" + primeiroNome
                + "\nNome: " + segundoNome
                + "\nNome: " + terceiroNome
                + "\nQuantidade de Pessoas: " + quantidadeElementos
                + "\n Existe o nome Luiza na Lista : " + contemLuiza
                + "\n Removeu Julhio com sucesso: " + removeuComSucesso);
    }

    private static void exemplo02() {
        var nomes = new ArrayList<String>();
        var quantidades = new ArrayList<Integer>();
        var precosUnitarios = new ArrayList<Double>();
        var precosPorProdutos = new ArrayList<Double>();

        var quantidadeDesejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade Desejada"));

        for (var i = 0; i < quantidadeDesejada; i++) {
            var nome = JOptionPane.showInputDialog("Digite o nome:").trim();
            var quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
            var precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco Unitário"));
            nomes.add(nome);
            quantidades.add(quantidade);
            precosUnitarios.add(precoUnitario);
        }

        for (var i = 0; i < quantidades.size(); i++) {
            var quantidade = quantidades.get(i);
            var precoUnitario = precosUnitarios.get(i);
            var precoPorProduto = quantidade * precoUnitario;
            precosPorProdutos.add(precoPorProduto);
        }

        var totalPedidos = 0.0;
        for (var i = 0; i < quantidades.size(); i++) {
            totalPedidos = totalPedidos + precosPorProdutos.get(i);
        }

        JOptionPane.showMessageDialog(null, "Total dos pedidos: " + totalPedidos);
    }

    //1- Solicitar para o usuário, nome e sobrenome de 3 usuários, 
    //apresentar no final o nome completo , armazenado em outro ArrayList
    
    //2 - Solicitar nome, altura e peso, calcular o valor do imc armazenando
    // em um ArrayLiat, apresentar no final o nome, altura, peso e imc
    private static void exercicio01() {

        var nomes = new ArrayList<String>();
        var sobrenomes = new ArrayList<String>();
        var nomeCompleto = new ArrayList<String>();
        
        int i = 0;

        while (i != 3) {

            nomes.add(JOptionPane.showInputDialog("Digite o nome da " + (i + 1) + "ª Pessoa"));
            sobrenomes.add(JOptionPane.showInputDialog("Digite o sobrenome da " + (i + 1) + "ª Pessoa"));

            i += 1;

        }
        
        i = 0;
        String texto = "";
        while (i != 3) {
            nomeCompleto.add(nomes.get(i) + " " + sobrenomes.get(i));
            texto = texto + "Nome: " + nomeCompleto.get(i) + "\n";

            i += 1;

        }
        
        JOptionPane.showMessageDialog(null, texto);
    }

    private static void exercicio02() {
        var nomes = new ArrayList<String>();
        var alturas = new ArrayList<Double>();
        var pesos = new ArrayList<Double>();
        
         var quantidadeDesejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade Desejada"));

        for (var i = 0; i < quantidadeDesejada; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite o Nome:").trim());
            alturas.add(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura")));
            pesos.add(Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso")));

        }
        
    }
    
    

}
