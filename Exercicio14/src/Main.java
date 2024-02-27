import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Exibe as opções de pagamento
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix");


        System.out.print("Opção: ");
        int opcaoPagamento = scanner.nextInt();


        double totalAPagar = 0;
        switch (opcaoPagamento) {
            case 1:
                totalAPagar = valorCompra * 0.95;
                break;
            case 2:

                System.out.print("Número de parcelas: ");
                int numParcelas = scanner.nextInt();

                if (numParcelas <= 4) {
                    totalAPagar = valorCompra * (1 + numParcelas * 0.02);
                } else {
                    totalAPagar = valorCompra * (1 + numParcelas * 0.05);
                }
                break;
            case 3:
                totalAPagar = valorCompra * 0.9;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }


        System.out.println("Total a pagar: R$ " + totalAPagar);
    }
}