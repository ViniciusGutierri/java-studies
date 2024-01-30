import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Aplicando desconto no preço original");

        System.out.println("\nInforme o preço original do produto: ");
        double precoOriginal = input.nextDouble();

        System.out.println("Informe quanto % de desconto (exemplo: 10): ");
        double percentualDesconto = input.nextDouble();

        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.printf("\nPreço original: R$%.2f", precoOriginal);
        System.out.printf("\nDesconto: R$%.2f", valorDesconto);
        System.out.printf("\nNovo preço com desconto: R$%.2f", precoComDesconto);
    }
}
