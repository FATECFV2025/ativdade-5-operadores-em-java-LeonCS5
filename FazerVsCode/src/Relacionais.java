import java.util.Scanner;

public class Relacionais {
    public static void main (String[] args){
        OperadoresRelacionais or = new OperadoresRelacionais();
        Scanner sc2 = new Scanner(System.in);
        
        int a = sc2.nextInt();
        int b = sc2.nextInt();

        // Compara os dois numeros
        System.out.println("Os números são iguais? " + or.igual(a, b));
        System.out.println("Os números são diferentes? " + or.diferente(a, b));
        System.out.println("O primeiro número é maior que o segundo? " + or.maiorQue(a, b));
        System.out.println("O primeiro número é menor que o segundo? " + or.menorQue(a, b));
        System.out.println("O primeiro número é maior ou igual ao segundo? " + or.maiorOuigual(a, b));
        System.out.println("O primeiro número é menor ou igual ao segundo? " + or.menorOuigual(a, b));

        sc2.close();
    }
}
