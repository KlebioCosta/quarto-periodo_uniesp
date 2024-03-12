package atividade01_exercicio06.service;

import atividade01_exercicio06.model.Aluno;

import java.util.List;


public class ImprimirDadosDoALuno {
    public void lerDadosDoAluno(List<Aluno> alunos) {
        System.out.println("Boletim escolar do Aluno: ");
        for (Aluno aluno : alunos) {
            System.out.println("\nNome do aluno: " + aluno.getNome().toUpperCase());

            int[] notas = aluno.getNotas();
            for (int i = 0; i < notas.length; i++) {
                System.out.print((i + 1) + "º nota: " + notas[i]);
            }
            System.out.printf("\nMédia final: %.1f", aluno.getMedia());

            System.out.println();
        }
        imprimirAlunos(alunos);
    }

    public void imprimirAlunos(List<Aluno> alunos) {
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("\nAlunos aprovados: ");
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() >= 6.0) {
                System.out.println("Nome: " + aluno.getNome() + ", Média: " + aluno.getMedia());
            aprovados++;
            }else {
                reprovados++;
            }
        }
        System.out.println("\nAlunos reprovados: ");
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() < 6.0) {
                System.out.println("Nome: " + aluno.getNome() + ", Média: " + aluno.getMedia());
            }
        }
        System.out.println("\nTotal aprovados: " + aprovados+
                "\nTotal reprovados: "+ reprovados);

    }

}
