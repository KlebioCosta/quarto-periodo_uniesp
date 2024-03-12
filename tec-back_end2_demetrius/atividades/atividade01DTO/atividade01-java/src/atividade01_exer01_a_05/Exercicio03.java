package atividade01_exer01_a_05;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


//3o Escreva um código que receba um nome completo em forma de String e mostre as iniciais
//do nome.
//Ex.:
//Entrada: Demetrius de Castro do Amaral
//Saída: D.C.A

public class Exercicio03 {
    public void abreviarNome() {
        Scanner sc = new Scanner(System.in);

        String nomeCompleto = sc.nextLine().trim();

        String[] nomes = nomeCompleto.split(" ");
        Set<String> palavrasExcluidas = new HashSet<>(Arrays.asList("a", "e", "da", "de", "do"));

        System.out.println("Entrada: " + nomeCompleto.toUpperCase());
        System.out.print("Saida: ");

        int i = 0;
        for (String nome : nomes) {
            if (!nome.isEmpty() && !palavrasExcluidas.contains(nome.toLowerCase())) {
                if( i > 0){
                    System.out.print(". ");
                }
                System.out.print(nome.toUpperCase().charAt(0));
                i ++;
            }
        }
    }

    public static void main(String[] args) {
        Exercicio03 exercicio03 = new Exercicio03();
        exercicio03.abreviarNome();
   }
}
