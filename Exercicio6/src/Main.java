import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção do menu (Entre 5 e 9:");
        double opção = scanner.nextDouble();

        if (opção >= 5 && opção <= 9 ) {
            System.out.println("A opção escolhida foi:" + opção);

        } else {
            System.out.println("Opção inválida. Por favor escolha entre 5 e 9.");
        }
    }
}