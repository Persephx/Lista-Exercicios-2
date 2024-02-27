import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua média:");
        double media = scanner.nextDouble();

        if (media >= 8.5) {
            System.out.println("Nota A");
        } else if (media >= 7 && media < 8.5) {
            System.out.println("Nota B");
        } else if (media >= 5 && media < 7)
        { System.out.println("Nota C");
        } else if (media <= 4) {
            System.out.println("Nota D");
        }
        }



    }
