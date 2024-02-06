import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Nome do produto: ");
        produto.setNome(scanner.nextLine());
        System.out.println("Preço do produto: ");
        produto.setPreco(scanner.nextDouble());

        System.out.println("\nQual o percentual de desconto? ");
        produto.aplicarDesconto(scanner.nextInt());

        System.out.printf("\nNovo Preço após Desconto: %.2f%n", produto.getPreco());
    }
}