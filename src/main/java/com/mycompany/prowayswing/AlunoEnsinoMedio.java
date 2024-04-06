package com.mycompany.prowayswing;

import java.util.ArrayList;

public class AlunoEnsinoMedio {
    public String nome;
    public String cpf;
    public ArrayList<Double> notas = new ArrayList<>();

    // Método responsável por adicionar uma nota na lista
    // de notas, ou seja, é possível ter quantas notas forem 
    // necessárias
    public void adicionarNota(double nota){
        notas.add(nota);
    }

    public double calcularMedia() {
        var soma = 0.0;
        // Percorrer cada uma das notas cadastradas
        for (int i = 0; i < notas.size(); i++) {
            // Obtendo a nota da lista de notas na posição i
            var nota = notas.get(i);
            // Acumlar a nota na variável soma
            soma = soma + nota;
        }
        // Calular a média utilizando a soma das notas
        // divindo pela quantidade de notas cadastradas
        var media = soma / notas.size();
        return media;
    }

    public String obterStatus() {
        var media = calcularMedia();
        var status = "";

        if (media < 5) {
            status = "Reprovado";
        } else if (media < 7) {
            status = "Em recuperação";
        } else {
            status = "Aprovado";
        }
        return status;
    }
}
