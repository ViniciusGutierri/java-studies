import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        System.out.println("Preço do Livro: ");
        livro.setPreco(scanner.nextDouble());
        System.out.println("Desconto do Livro: ");
        livro.setDesconto(scanner.nextDouble());

        ProdutoFisico produto = new ProdutoFisico();
        System.out.println("\nPreço do Produto: ");
        produto.setPreco(scanner.nextDouble());
        System.out.println("Taxa adicional: ");
        produto.setTaxaAdicional(scanner.nextDouble());

        System.out.println("\nPreço final do Livro: R$" + livro.calcularPrecoFinal());
        System.out.println("Preço final do Produto: R$" + produto.calcularPrecoFinal());
    }
}