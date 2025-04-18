import java.util.Scanner;

public class Unarios {
    public static void main(String[] args) {
        OperadoresUnarios ou = new OperadoresUnarios();
        Scanner sc4 = new Scanner(System.in);
    
        int a = sc4.nextInt();

        System.out.println("Incremento: " + ou.incremento(a));
        System.out.println("Decremento: " + ou.decremento(a));

        sc4.close();

    }
}
