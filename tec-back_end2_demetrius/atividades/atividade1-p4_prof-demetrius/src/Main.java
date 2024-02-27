import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite seus valores: ");

        System.out.print("Valor de a: ");
        int a = sc.nextInt();
        System.out.print("Valor de b: ");
        int b = sc.nextInt();
        System.out.print("Valor de c: ");
        int c = sc.nextInt();

        double delta;
        int x1 = 0;
        int x2 = 0;
        int soma = 0;
        int mes = 0;

        delta = Math.pow(b, 2) - (4*a*c);
        if(delta <= 0){
            System.out.println("Não possui valores reais! ");
        }else{
            x1 =(int) (-b + Math.sqrt(delta)) / (2 * a);
            x2 =(int) (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("\nValor de Delta: "+ delta +"\n"+
                    "valor de x1: " + x1 +"\n"+
                    "Valor de x2: " + x2);
            }
        if(x1 > 0 && x2 > 0){
            soma =(int) (x1 + x2);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Soma de x1 e x2 igual a : "+soma);
            System.out.println("\nDo zero a "+ soma);
            for(int i=0; i<=soma ; i++){
                System.out.print(i+"- ");
            }
            System.out.println("\n");
        }
        int i=0;
        while (soma > 12){
            mes = soma -= 5;
        i++;
        }
        switch (mes){
            case 1:
                String janeiro = " 1 de Janeiro";
                System.out.println("Mês do ano calculado " + janeiro);
                break;
            case 2:
                String fevereiro = "2 de Fevereiro";
                System.out.println("Mês do ano calculado " + fevereiro);
                break;
            case 3:
                String marco = " 3  de Março";
                System.out.println("Mês do ano calculado " + marco);
                break;
            case 4:
                String abril = "4 de Abril";
                System.out.println("Mês do ano calculado " + abril);
                break;
            case 5:
                String maio = " 5 de Maio";
                System.out.println("Mês do ano calculado " + maio);
                break;
            case 6:
                String junho = " 6 de Junho";
                System.out.println("Mês do ano calculado " + junho);
                break;
            case 7:
                String julho = " 7 de Julho";
                System.out.println("Mês do ano calculado " + julho);
                break;
            case 8:
                String agosto = " 8 de Agosto";
                System.out.println("Mês do ano calculado " + agosto);
                break;
            case 9:
                String setembro = " 9 de Setembro";
                System.out.println("Mês do ano calculado " + setembro);
                break;
            case 10:
                String outubro = " 10 de Outubro";
                System.out.println("Mês do ano calculado " + outubro);
                break;
            case 11:
                String novembro = "11 de Novembro";
                System.out.println("Mês do ano calculado " + novembro);
                break;
            case 12:
                String dezembro = " 12 de Dezembro";
                System.out.println("Mês do ano calculado " + dezembro);

        }
    }
}
