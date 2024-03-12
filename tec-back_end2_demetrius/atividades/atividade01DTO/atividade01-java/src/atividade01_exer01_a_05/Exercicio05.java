package atividade01_exer01_a_05;


import java.util.Arrays;
import java.util.Scanner;

//5o Escreva um código que receba uma String simples (apenas uma palavra) e monte um array
//com os valores respectivos a cada letra da palavra, os organize em ordem crescente, imprima
//esse array e a palavra na nova ordem.
//Ex.:
//Entrada: estudar
//Array: {5, 19, 20, 21, 4, 1, 18}
//Array ordenado: {1, 4, 5, 18, 19, 20, 21}
//Saída: aderstu.
public class Exercicio05 {
    private int[] posicaoDasLetras;
    public void ondenandoValores() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome qualquer: ");
        String nome = sc.next();
        posicaoDasLetras = new int[nome.length()];

        for (int i = 0; i < nome.length(); i++) {
            posicaoDasLetras[i] = nome.charAt(i) - 'a' + 1;
        }

    }
    public void resultado() {
        ondenandoValores();
        System.out.println("Array: " + Arrays.toString(posicaoDasLetras));

        Arrays.sort(posicaoDasLetras);

        System.out.println("Array ordenado: " + Arrays.toString(posicaoDasLetras));

        System.out.print("Saída: ");
        for (int valor : posicaoDasLetras) {
            char letra = (char) (valor + 'a' - 1);
            System.out.print(letra);
        }
    }

    public static void main(String[] args) {
        Exercicio05 exercicio05 = new Exercicio05();
        exercicio05.resultado();
    }
}

