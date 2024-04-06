package com.mycompany.prowayswing;

public class Aluno {
    public int codigo;
    public String nome;
    public String cpf;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia() {
        var media = (nota1 + nota2 + nota3) / 3;
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
