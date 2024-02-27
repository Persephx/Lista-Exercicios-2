
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();


        int maiorNumero = Math.max(n1, n2);


        System.out.println("O maior número é: " + maiorNumero);
    }
}
