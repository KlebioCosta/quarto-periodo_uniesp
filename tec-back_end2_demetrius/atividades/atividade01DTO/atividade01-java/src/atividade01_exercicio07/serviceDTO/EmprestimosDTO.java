package atividade01_exercicio07.serviceDTO;

import java.time.LocalDate;

public class EmprestimosDTO {
    private String nomeDoCliente;
    private String nomeDoLivro;
    private LocalDate dataEmprestimo;
    private LocalDate devolucao;

    public EmprestimosDTO(String nomeDoCliente, String nomeDoLivro, LocalDate dataEmprestimo, LocalDate devolucao) {
        this.nomeDoCliente = nomeDoCliente;
        this.nomeDoLivro = nomeDoLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.devolucao = devolucao;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDate dataDevolucao) {
        this.devolucao = dataDevolucao;
    }
}
