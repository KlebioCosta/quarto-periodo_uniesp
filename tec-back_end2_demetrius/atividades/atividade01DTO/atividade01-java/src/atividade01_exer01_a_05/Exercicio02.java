package atividade01_exer01_a_05;

import java.util.Random;
import java.util.Scanner;

//2o Escrever um código que sorteie um número randômico de 0 a 1000, peça um número inteiro
//neste intervalo, se o usuário errar, informar se o valor sorteado é maior ou menor que o
//informado e solicitar outro número do usuário até que ele acerte o número. Quando acertar,
//informar a quantidade de palpites que ele informou até acertar.

public class Exercicio02 {
    public static int sorteioDoNumero() {
        Random random = new Random();
        int numeroSorteado = random.nextInt(1001);
        return numeroSorteado;
    }

    public void descobrirNumero() {
        Scanner sc = new Scanner(System.in);

        int numeroSorteado = sorteioDoNumero();
        System.out.println(numeroSorteado);

        System.out.println("DIgite um número entre 0 e 1000: ");
        int numeroEscolhido = sc.nextInt();

        int i = 1;
        while (numeroEscolhido != numeroSorteado) {
            if (numeroEscolhido < 0 || numeroEscolhido > 1000) {
                System.out.println("Valor fora dos padrões, digite um número entre (0 e 1000): ");
            } else if (numeroEscolhido < numeroSorteado) {
                System.out.println("Digite um valor mais ALTO: ");
            } else {
                System.out.println("Digite um valor mais BAIXO:  ");
            }
            numeroEscolhido = sc.nextInt();
            i++;
        }
        if (i == 1) {
            System.out.println("Número Sorteado: " + numeroSorteado +
                    "\nNúmero escolhido " + numeroEscolhido +
                    "\nIncrivel você acertou o número na primeira tentativa, " +
                    "\nAbilidade Intuição aprimorada! + 10 pontos. hehe ");
        } else if (numeroEscolhido == numeroSorteado) {
            System.out.println("Parabêns você acertou o número Sorteado!!! ");
            System.out.println("\nNúmero Sorteado: " + numeroSorteado +
                    "\nSeu Número: " + numeroEscolhido +
                    "\nTentativas: " + i);
        }
    }

    public static void main(String[] args) {

        Exercicio02 exercicio02 = new Exercicio02();
        exercicio02.descobrirNumero();

    }
}