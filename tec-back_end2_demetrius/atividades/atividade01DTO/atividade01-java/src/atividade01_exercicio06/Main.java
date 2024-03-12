package atividade01_exercicio06;

import atividade01_exercicio06.model.Aluno;
import atividade01_exercicio06.service.ImprimirDadosDoALuno;
import atividade01_exercicio06.service.ReceberDadosDoAluno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReceberDadosDoAluno receberDadosDoAluno = new ReceberDadosDoAluno();
        List<Aluno> alunos = receberDadosDoAluno.nomeDoAluno();
        float mediaTurma = receberDadosDoAluno.medianaDaTurma();
        System.out.printf("\nMédiaana da Turma %.2f\n", mediaTurma);

        ImprimirDadosDoALuno imprimirDadosDoALuno = new ImprimirDadosDoALuno();
        imprimirDadosDoALuno.lerDadosDoAluno(alunos);



    }
}
