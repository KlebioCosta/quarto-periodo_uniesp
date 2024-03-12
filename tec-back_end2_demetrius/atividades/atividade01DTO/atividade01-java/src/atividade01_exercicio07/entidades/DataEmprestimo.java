package atividade01_exercicio07.entidades;


import java.time.LocalDate;

//7o Crie um código que receba o cadastro de um cliente (nome, cpf, endereço, data de nascimento
//e telefone) e o cadastro de livros (nome, autor, quantidade de páginas e editora). Permita que
//os clientes possam pegar livros emprestados (data de empréstimo e data que deverá ser
//devolvido) e, USANDO DTO, exiba o nome do cliente, nome do livro, data de empréstimo e
//data de que deverá ser devolvido).
public class DataEmprestimo {
    private LocalDate dataSaida;
    private LocalDate dataVolta;

    public DataEmprestimo(LocalDate dataSaida, LocalDate dataVolta) {
        this.dataSaida = dataSaida;
        this.dataVolta = dataVolta;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(LocalDate dataVolta) {
        this.dataVolta = dataVolta;
    }
}
