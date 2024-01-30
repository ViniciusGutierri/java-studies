import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cálculo do preço do produto de acordo com a quantidade");

        System.out.println("\nInforme o preço unitário do produto: ");
        double precoProduto = input.nextDouble();

        System.out.println("Informe a quantidade: ");
        int quantidade = input.nextInt();

        double valorTotal = precoProduto * quantidade;

        System.out.printf("O valor total da compra é R$%.2f", valorTotal);
    }
}
