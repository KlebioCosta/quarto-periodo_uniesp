package atividade01_exer01_a_05;


import java.util.Scanner;

//4o Escreva um código que receba uma String qualquer e a imprima de forma invertida.
//Ex.:
//Entrada: estude java
//Saída: avaj edutse
public class Exercicio04 {
    public void palavraInvertida() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome ou frase ");
        String nome = sc.nextLine();
        String invertido = " ";
        for(int i = nome.length() - 1; i >= 0; i--)
            invertido += nome.charAt(i);

        System.out.println("Palavra normal: "+nome +
                "\nPalavra invertida: "+invertido);
    }

    public static void main(String[] args) {

        Exercicio04 exercicio04 = new Exercicio04();
        exercicio04.palavraInvertida();
    }
}
