package com.mycompany.prowayswing;

import javax.swing.JOptionPane;

public class ExemploObjeto {

    public void executar() {
        // Instanciando(new) um objeto chamado xbox da classe Produto
        var xbox = new Produto();
        // Definindo valor para os atributos do objeto xbox
        xbox.nome = "Xbox Series X";
        xbox.quantidade = 2;
        xbox.precoUnitario = 3500.00;
        // Chamando o método calcularPreco do objeto xbox
        var precoXbox = xbox.calcularPreco();

        var ps5 = new Produto();
        ps5.nome = "PlayStation 5";
        ps5.precoUnitario = 3300.00;
        ps5.quantidade = 4;
        var precoPs5 = ps5.calcularPreco();

        // Alterado o preço do ps5
        ps5.precoUnitario = 3150.99;

        JOptionPane.showMessageDialog(
                null,
                "Nome: " + xbox.nome
                + "\nQuantidade: " + xbox.quantidade
                + "\nPreço unitário: " + xbox.precoUnitario
                + "\nPreço produto 1: " + precoXbox
                + "\n\nNome: " + ps5.nome
                + "\nQuantidade: " + ps5.quantidade
                + "\nPreço unitário: " + ps5.precoUnitario
                + "\nPreço produto 2: " + precoPs5);
    }

    public void executarAluno() {
        // Instanciar um objeto do Aluno
        var thiago = new Aluno();
        thiago.nome = "Thiago com H";
        thiago.cpf = "456.789.123-30";
        thiago.nota1 = 5.0;
        thiago.nota2 = 8.0;
        thiago.nota3 = 6.5;
        var mediaThiago = thiago.calcularMedia();
        var statusThiago = thiago.obterStatus();

        var leonardo = new Aluno();
        leonardo.nome = "Leonardo com D";
        leonardo.cpf = "986.213.530-29";
        leonardo.nota1 = 4.0;
        leonardo.nota2 = 0.2;
        leonardo.nota3 = 10.0;

        JOptionPane.showMessageDialog(
                null,
                "Aluno 1:" + thiago.nome
                + "\nCPF: " + thiago.cpf
                + "\nMédia: " + mediaThiago
                + "\nStatus: " + statusThiago
                + "\n\nAluno 2:" + leonardo.nome
                + "\nCPF: " + leonardo.cpf
                + "\nMédia: " + leonardo.calcularMedia()
                + "\nStatus: " + leonardo.obterStatus());
    }

    public void executarAlunoComInteracao() {
        // Instanciar um objeto do Aluno
        var aluno1 = new Aluno();
        aluno1.nome = JOptionPane.showInputDialog("Digite o nome");
        aluno1.cpf = JOptionPane.showInputDialog("Digite o cpf");
        aluno1.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        aluno1.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        aluno1.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        var mediaThiago = aluno1.calcularMedia();
        var statusThiago = aluno1.obterStatus();

        var aluno2 = new Aluno();
        aluno2.nome = JOptionPane.showInputDialog("Digite o nome");
        aluno2.cpf = JOptionPane.showInputDialog("Digite o cpf");
        aluno2.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        aluno2.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        aluno2.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));

        JOptionPane.showMessageDialog(
                null,
                "Aluno 1:" + aluno1.nome
                + "\nCPF: " + aluno1.cpf
                + "\nMédia: " + mediaThiago
                + "\nStatus: " + statusThiago
                + "\n\nAluno 2:" + aluno2.nome
                + "\nCPF: " + aluno2.cpf
                + "\nMédia: " + aluno2.calcularMedia()
                + "\nStatus: " + aluno2.obterStatus());
    }

    public void executarAlunoEnsinoMedio() {
        // Instanciar um objeto do AlunoEnsinoMedio
        var thiago = new AlunoEnsinoMedio();
        thiago.nome = "Thiago com H";
        thiago.cpf = "456.789.123-30";
        thiago.adicionarNota(5.0);
        thiago.adicionarNota(8.0);
        thiago.adicionarNota(6.5);
        var mediaThiago = thiago.calcularMedia();
        var statusThiago = thiago.obterStatus();

        var leonardo = new AlunoEnsinoMedio();
        leonardo.nome = "Leonardo com D";
        leonardo.cpf = "986.213.530-29";
        leonardo.adicionarNota(4.0);
        leonardo.adicionarNota(0.2);
        leonardo.adicionarNota(10.0);

        JOptionPane.showMessageDialog(
                null,
                "Aluno 1:" + thiago.nome
                + "\nCPF: " + thiago.cpf
                + "\nMédia: " + mediaThiago
                + "\nStatus: " + statusThiago
                + "\n\nAluno 2:" + leonardo.nome
                + "\nCPF: " + leonardo.cpf
                + "\nMédia: " + leonardo.calcularMedia()
                + "\nStatus: " + leonardo.obterStatus());
    }

    public static void main(String[] args) {
        new ExemploObjeto().executarAlunoEnsinoMedio();
    }
}
/*
Exercício 01
Criar uma classe de Paciente com os seguintes atributos
- nome
- sobrenome
- idade
- peso
- altura
Criar os seguintes métodos:
- obterNomeCompleto que retorna uma String nome e sobrenome concatenados
- calcularImc que retorna o imc
- obterStatusImc que retorna o grau do imc (procurar tabela de imc)
 
Exercício 02
Criar uma classe Turma
- nome
- descrição
- alunos (ArrayList)
Criar os seguintes métodos
- adicionarAluno recebe o nome do aluno como parâmetro
- obterAlunos

*/
