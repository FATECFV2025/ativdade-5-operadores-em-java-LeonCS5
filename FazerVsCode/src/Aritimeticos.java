import java.util.Scanner;

public class Aritimeticos {
    public static void main(String[] args) {
        OperadoresAritimeticos oa = new OperadoresAritimeticos();
        Scanner sc1 = new Scanner(System.in);

        float a = sc1.nextFloat();
        float b = sc1.nextFloat();

        //Soma dois números e retorna o resultado
        System.out.println("O Resultado de adicao é: "+oa.adicao(a, b));

        //Subtrai o segundo número do primeiro
        System.out.println("O Resultado de subtracao é: "+oa.subtracao(a, b));

        //Multiplica dois números
        System.out.println("O Resultado de multiplicacao é: "+oa.multiplicacao(a, b));

        //Divide o primeiro número pelo segundo
        System.out.println("O Resultado de divisao é: "+oa.divisao(a, b));

        //exemplo de modulo(ou resto);Retorna o resto da divisão entre dois números
        System.out.println("O Resultado de modulo(ou resto) é: "+oa.resto(a, b));

        sc1.close();
    }
}
