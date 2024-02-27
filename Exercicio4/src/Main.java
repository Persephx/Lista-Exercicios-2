import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        double n2 = scanner.nextDouble();

        double resultado = (n1 + n2) /2;

        if (resultado >= 50) {
            System.out.println("Média:" + resultado);
            System.out.println("Aprovado");
        } else {
                System.out.println("Média:" + resultado);
                System.out.println("Digite a nota da prova de recuperação:");
                double recuperacao = scanner.nextDouble();

                double novoResultado = (resultado + recuperacao);

                if (novoResultado < 50) {
System.out.println("Média:" + novoResultado);
System.out.println("Reprovado");
} else {
System.out.println("Média:" + novoResultado);
System.out.println("Aprovado");
                }

            }
        }
    }
