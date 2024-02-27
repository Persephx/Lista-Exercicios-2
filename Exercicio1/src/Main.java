import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número real:");

        double n1 = scanner.nextDouble();


        if (n1 > 0) {

            double raizQuadrada = Math.sqrt(n1);
            System.out.println("A raiz quadrada de " + n1 + " é: " + raizQuadrada);
        } else {

            System.out.println("Valor inválido!");
        }

    }
}
