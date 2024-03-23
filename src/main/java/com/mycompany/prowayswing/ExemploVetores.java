/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prowayswing;

import javax.swing.JOptionPane;

/**
 *
 * @author 74741
 */
public class ExemploVetores {

    public static void main(String[] args) {

        //exemplo01();
        //exemplo02();
        //exemplo03();
        //exercicio01();
        //exercicio02();
        exercicio03();
    }

    private static void exemplo01() {
        String[] nomes = new String[3];
        nomes[0] = "Batman";
        nomes[1] = "Robin";
        nomes[2] = "Mulher Maravilha";

        nomes[2] = "Wonder Woman";

        System.out.println("1º Nome: " + nomes[0]);
        System.out.println("2º Nome: " + nomes[1]);
        System.out.println("3º Nome: " + nomes[2]);
    }

    private static void exemplo02() {
        int[] numeros = new int[5];
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número"));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número"));
        numeros[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número"));
        numeros[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º número"));
        numeros[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 5º número"));

        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];

        JOptionPane.showMessageDialog(null,
                "Números 01: " + numeros[0]
                + "\nNúmeros 02: " + numeros[1]
                + "\nNúmeros 03: " + numeros[2]
                + "\nNúmeros 04: " + numeros[3]
                + "\nNúmeros 05: " + numeros[4]
                + "\nSoma: " + soma);
    }

    private static void exemplo03() {

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i = i + 1) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        }

        int soma = 0;

        for (int i = 0; i < 5; i = i + 1) {
            soma = soma + numeros[i];
        }

        String texto = "";

        for (int i = 0; i < 5; i = i + 1) {
            texto = texto + "Número: " + numeros[i] + "\n";
        }
        texto = texto + "Soma: " + soma;

        JOptionPane.showMessageDialog(null, texto);
    }

    private static void exercicio01() {
        int[] idades = new int[4];
        String[] nomes = new String[4];

        for (int i = 0; i < 4; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o Nome da " + (i + 1) + "ª Pessoa:");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade da " + (i + 1) + "ª Pessoa:"));
        }

        String texto = "";

        for (int i = 0; i < 4; i++) {
            texto = texto + "Nome da " + (i + 1) + "ª Pessoa: " + nomes[i] + "\nIdade da " + (i + 1) + "ª Pessoa: " + idades[i] + "\n";
        }

        int menorIdade = idades[0];
        String nomeMenorIdade = nomes[0];

        for (int i = 1; i < 4; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                nomeMenorIdade = nomes[i];
            }
        }

        texto = texto + "\nNome da Pessoa com menor Idade:" + nomeMenorIdade + "\nMenor Idade: " + menorIdade + "\n";

        JOptionPane.showMessageDialog(null, texto);
    }

    private static void exercicio02() {
        //Fazer um programa que permita o usuário solicitar a quantidade de numeros que quiser, e posteriormente faça a soma dos números pares positivos

        int quantidadeNumeros;

        quantidadeNumeros = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Números que Deseja Digitar"));

        int[] numeros = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º Número"));
        }

        int somaParesPositivos = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            if ((numeros[i] % 2 == 0) && (numeros[i] > 0)) {
                somaParesPositivos = somaParesPositivos + numeros[i];
            }
        }

        String texto = "";

        for (int i = 0; i < quantidadeNumeros; i++) {
            texto = texto + (i + 1) + "º Número: " + numeros[i] + "\n";
        }

        texto = texto + "\nSoma dos Números Positivos Pares: " + somaParesPositivos;

        JOptionPane.showMessageDialog(null, texto);
    }

    private static void exercicio03() {

        int[][] numeros = new int[4][4];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            }
        }

        int somaDiagonalPrimaria = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                if (i == j) {
                    somaDiagonalPrimaria = somaDiagonalPrimaria + numeros[i][j];
                } else if (i  + j == 3) {
                    somaDiagonalSecundaria = somaDiagonalSecundaria + numeros[i][j];
                }
            }
        }
        
        String texto = "";
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                texto = texto +" | "+ numeros[i][j];
            }
            texto = texto + "\n";
        }
        texto = texto + "\nSoma da Diagonal Primária: " + somaDiagonalPrimaria + "\nSoma da Diagonal Secundária: " + somaDiagonalSecundaria;
        JOptionPane.showMessageDialog(null, texto);

    }

}
