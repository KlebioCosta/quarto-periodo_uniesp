package atividade01_exercicio07.entidades;


import java.time.LocalDate;


public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private LocalDate dataDeNascimento;
    private String telefone;
    private Livros livros;
    private DataEmprestimo emprestimo;

    public Cliente() {}
    public Cliente(String nome, String cpf, LocalDate dataDeNascimento, String telefone, Endereco endereco, Livros livros, DataEmprestimo emprestimo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.livros = livros;
        this.emprestimo = emprestimo;

    }


    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() { return endereco; }
    public Cliente(Livros livros) {
        this.livros = livros;
    }
    public Livros getLivros() { return livros; }
    public Cliente(DataEmprestimo emprestimo) { this.emprestimo = emprestimo; }
    public DataEmprestimo getEmprestimo() { return emprestimo; }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
