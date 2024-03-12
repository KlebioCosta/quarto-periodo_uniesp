package atividade01_exer01_a_05;
import java.util.Scanner;


//1o Escrever um código que receba um número inteiro
// e informe se ele é um número primo.
public class Exercicio01 {
    public boolean descobrirPrimo(int numero) {
        if (numero < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void result(int numero) {
        if(numero < 1){
            System.out.println("Numeros menor ou igual a zero não são primos!!! ");
        }
        else if(descobrirPrimo(numero)) {
            System.out.println("O número "+numero+ " é primo! ");
        }else {
            System.out.println("O número "+ numero +" não é primo! " );
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificação de números primos!! ");
        System.out.println("Digite um número maior que Zero: ");
        int numero = sc.nextInt();

        Exercicio01 exercicio01 = new Exercicio01();
        exercicio01.result(numero);


        sc.close();
    }
}
