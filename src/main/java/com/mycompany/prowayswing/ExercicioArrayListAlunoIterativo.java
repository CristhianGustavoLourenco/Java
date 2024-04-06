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
public class ExercicioArrayListAlunoIterativo {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    private int indiceAtual = 1;

    public static void main(String[] args) {
        new ExercicioArrayListAlunoIterativo().apresentarMenu();

    }

    public void apresentarMenu() {

        var botoes = new String[]{"Cadastrar Aluno",
            "Editar Aluno",
            "Apagar Aluno",
            "Listar Todos Aluno",
            "Calcular Maior Média",
            "Calcular Menor Média",
            "Situação do Aluno",
            "Sair"};

        var menuEscolhido = 0;
        var botaoSairIndice = botoes.length - 1;

        while (menuEscolhido != botaoSairIndice && menuEscolhido != JOptionPane.CLOSED_OPTION) {

            menuEscolhido = JOptionPane.showOptionDialog(null,
                    "Escolha a Opção do Menu",
                    "Sistema de Alunos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    botoes,
                    "Cadastrar");

            switch (menuEscolhido) {
                case 0 ->
                    cadastrarAlunos();
                case 1 ->
                    editarAluno();
                case 2 ->
                    apagarAluno();
                case 3 ->
                    listarAluno();
                case 4 ->
                    calcularMaiorMediaAlunos();
                case 5 ->
                    calcularMenorMediaAlunos();
                case 6 ->
                    situacaoAluno();

            }
        }

    }

    private void cadastrarAlunos() {
            var aluno = new Aluno();
            aluno.codigo = indiceAtual;
            aluno.nome = JOptionPane.showInputDialog("Digite o nome do Aluno");
            aluno.cpf = JOptionPane.showInputDialog("Digite o CPF do Aluno");
            aluno.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1º Nota"));
            aluno.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2º Nota"));
            aluno.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3º Nota"));
            indiceAtual += 1;
            alunos.add(aluno);
        }

    private void editarAluno() {
        
       var nomesAlunos = new ArrayList<String>();
        for (int i = 0; i < alunos.size(); i++) {
            var aluno = alunos.get(i);
            nomesAlunos.add(aluno.codigo + " - " + aluno.nome);
            
        }
        
        var alunoEscolhido = JOptionPane.showInputDialog(null, 
                "Escolha o aluno a ser alterado", 
                "Sistema de Alunos",
                JOptionPane.WARNING_MESSAGE, 
                null, 
                nomesAlunos.toArray(), 
                "");
        
        if(alunoEscolhido == null){
            return;
        }
        
        for (int i = 0; i < alunos.size(); i++) {
            var aluno = alunos.get(i);
            if(alunoEscolhido.equals(aluno.codigo + " - " + aluno.nome)){
                aluno.nome = JOptionPane.showInputDialog(null, 
                        "Digite o nome do Aluno", 
                        aluno.nome);
                aluno.nome = JOptionPane.showInputDialog(null, 
                        "Digite o nome do Aluno", 
                        aluno.nome);
            }
        }
        
    }

    private void apagarAluno() {
       
    }

    private void listarAluno() {
 
    }

    private void calcularMaiorMediaAlunos() {

    }

    private void calcularMenorMediaAlunos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void situacaoAluno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
