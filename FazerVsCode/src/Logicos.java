import java.util.Scanner;

public class Logicos 
    {public static void main(String[] args) {
        OperadoresLogicos ol = new OperadoresLogicos();
        Scanner sc3 = new Scanner(System.in);
        
        boolean a = sc3.nextBoolean();
        boolean b = sc3.nextBoolean();

        System.out.println("E lógico (&&): " + ol.eLogico(a, b));
        System.out.println("OU lógico (||): " + ol.ouLogico(a, b));
        System.out.println("E lógico (compara ambas) (&): " + ol.eLogico1(a, b));
        System.out.println("OU lógico (compara ambas) (|): " + ol.ouLogico1(a, b));
        System.out.println("NÃO lógico (!a): " + ol.naoLogico(a));
        System.out.println("NÃO lógico (!b): " + ol.naoLogico(b));

        sc3.close();
    }
}
