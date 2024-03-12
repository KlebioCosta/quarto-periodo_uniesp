package atividade01_exercicio07.entidades;

public class Livros {
    private String nome;
    private String autor;
    private int numeroDePaginas;
    private String editora;


    public Livros(String nome, String autor, int numeroDePaginas, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
