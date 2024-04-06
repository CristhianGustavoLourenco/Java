package com.mycompany.prowayswing;

public class Produto {
    // Atributos: características do Produto
    public int codigo;
    public String nome;
    public double precoUnitario;
    public int quantidade;
    
    // Método para calcular e retornar o preço do produto
    // Método com retorno do tipo double
    public double calcularPreco(){
        var preco = quantidade * precoUnitario;
        return preco;
    }
}