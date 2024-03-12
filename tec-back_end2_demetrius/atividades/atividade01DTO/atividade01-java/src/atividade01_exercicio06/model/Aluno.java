package atividade01_exercicio06.model;



//6o Escreva um código que tenha uma classe chamada Aluno, que receba três notas do tipo inteiro
//e o nome do aluno do tipo String.
//Pergunte ao usuário o nome do aluno e as três notas, continue pedindo alunos e notas até que o
//usuário digite “sair” como nome do aluno.
//Quando o usuário digitar “sair”, imprima a nota e média das notas de todos os alunos.
//Imprimir a média geral da turma.
//
//Imprimir a quantidade de alunos reprovados e aprovado (média >= 6 aprovado).
//Imprimir os nomes dos alunos aprovados
//Imprimir os nomes dos alunos reprovados
public class Aluno {

    private String nome;
    private int[] notas = new int[3];
    private float media;
    private boolean estado;

    public Aluno(String nome, int[] notas, float media, boolean estado) {
        this.nome = nome;
        this.notas = notas;
        this.media = media;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    public boolean getEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
